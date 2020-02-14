package com.yagnnoz.realm;

import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.input.Keyboard;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import javax.swing.JFrame;

/**
 *
 * @author Jens
 */
public class Game extends Canvas implements Runnable {
    
    private static final long serialVersionUID = 1L;
    
    public static int width = 300;
    public static int height = width / 16 * 9;      //16:9 format
    public static int scale = 3;
    
    private Thread gameThread;
    private JFrame frame;
    private Keyboard key;
    private boolean running = false;
    
    private Screen screen;
    
    private BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR); //creating an image
    private int[] pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();        //accessing the image & modify

    
    public Game() {
        Dimension size = new Dimension(width * scale, height * scale);
        setPreferredSize(size);
        screen = new Screen(width, height);
        frame = new JFrame();
        key = new Keyboard();
        
        addKeyListener(key);
        
    }
    
    public synchronized void start() {
        running = true;
        gameThread = new Thread(this, "Display");
        gameThread.start();
    }
    
    public synchronized void stop() {
        running = false;
        try {
            gameThread.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void run() {
        long lastTime = System.nanoTime();
        long timer = System.currentTimeMillis();
        final double ns = 1000000000.0 / 60.0;
        double delta = 0;
        int frames = 0;
        int updates = 0;
        
        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                update();
                updates++;
                delta--;
            }
            render();
            frames++;
            
            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                frame.setTitle("RAIN | UPS: " + updates + ", FPS: " + frames);
                frames = 0;
                updates = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        Game game = new Game();
        game.frame.setResizable(false);
        game.frame.setTitle("RAIN");
        game.frame.add(game);
        game.frame.pack();
        game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.frame.setLocationRelativeTo(null);  //centers window on the screen
        game.frame.setVisible(true);
        game.start();
    }
    
    private void update() {
        key.update();
    }
    
    private void render() {
        BufferStrategy bs = getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3); // puts 2 frames in the buffer and 1 on the screen. (2) would have 1 frame buffer and 1 on the screen. more buffers are not useful. 3 is best max.
            return;
        }
        screen.clear();
        screen.render();
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = screen.pixels[i];
        }
        
        Graphics g = bs.getDrawGraphics();
        //Graphic stuff goes here
        g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        g.dispose();
        bs.show();
    }
    
}
