package com.yagnnoz.realm;

import java.awt.Canvas;
import java.awt.Color;
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
    public static int height = width / 16 * 9;
    public static int scale = 3;

    private Thread gameThread;
    private JFrame frame;
    private boolean running = false;

    private BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR); //creating an image
    private int[] pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();        //accessing the image & modify

    public Game() {
        Dimension size = new Dimension(width * scale, height * scale);
        setPreferredSize(size);

        frame = new JFrame();
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
        while (running) {
            update();
            render();
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

    }

    private void render() {
        BufferStrategy bs = getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3); // puts 2 frames in the buffer and 1 on the screen. (2) would have 1 frame buffer and 1 on the screen. more buffers are not useful. 3 is best max.
            return;
        }
        Graphics g = bs.getDrawGraphics();
        //Graphic stuff goes here
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, getWidth(), getHeight()); //getWidht() and getHeight() returns size of the window; part of component
        g.dispose();
        bs.show();
    }

}
