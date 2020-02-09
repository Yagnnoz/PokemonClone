package com.yagnnoz.realm;

import java.awt.Canvas;
import java.awt.Dimension;
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
            System.out.println("Running...");
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

}
