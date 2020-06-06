package com.yagnnoz.realm.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Jens
 */
public class Keyboard implements KeyListener {

    private boolean[] keys = new boolean[KeyEvent.KEY_LAST];
    public boolean up, down, left, right, esc, b, e;

    public void update() {
        up = keys[KeyEvent.VK_UP] || keys[KeyEvent.VK_W];
        left = keys[KeyEvent.VK_LEFT] || keys[KeyEvent.VK_A];
        down = keys[KeyEvent.VK_DOWN] || keys[KeyEvent.VK_S];
        right = keys[KeyEvent.VK_RIGHT] || keys[KeyEvent.VK_D];
        esc = keys[KeyEvent.VK_ESCAPE];
        b = keys[KeyEvent.VK_B];
        e = keys[KeyEvent.VK_E];
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

}
