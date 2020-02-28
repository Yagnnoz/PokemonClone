package com.yagnnoz.realm.entity.mob;

import com.yagnnoz.realm.entity.Entity;
import com.yagnnoz.realm.graphics.Sprite;

/**
 *
 * @author Jens
 */
public abstract class Mob extends Entity {

    protected Sprite sprite;
    protected int dir = 0; //direction. 0 north, 1 east, 2 south, 3 west
    protected boolean moving = false;

    public void move(int xa, int ya) {
        if (xa > 0) {
            dir = 1;
        }
        if (xa < 0) {
            dir = 3;
        }
        if (ya > 0) {
            dir = 2;
        }
        if (ya < 0) {
            dir = 0;
        }

        if (!collision()) {
            x += xa;
            y += ya;
        }
    }

    @Override
    public void update() {
    }

    public void render() {

    }

    private boolean collision() {
        return false;
    }

}
