package com.yagnnoz.realm.entity;

import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.level.Level;
import java.util.Random;

/**
 *
 * @author Jens
 */
public abstract class Entity {

    public int x, y;
    private boolean removed = false;
    protected Level level;
    protected final Random rdm = new Random();

    public void update() {

    }

    public void render(Screen screen) {

    }

    public void remove() {

        removed = true;
    }

    public boolean isRemoved() {
        //remove from level
        return removed;
    }

    public void init(Level level) {
        this.level = level;
    }
}
