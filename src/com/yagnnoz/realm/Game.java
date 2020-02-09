package com.yagnnoz.realm;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jens
 */
public class Game implements Runnable {

    public static int width = 300;
    public static int height = width / 16 * 9;
    public static int scale = 3;

    private Thread gameThread;
    private boolean running = false;

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

        }
    }

}
