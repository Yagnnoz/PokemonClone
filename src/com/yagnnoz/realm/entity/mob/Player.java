package com.yagnnoz.realm.entity.mob;

import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.graphics.Sprite;
import com.yagnnoz.realm.input.Keyboard;

/**
 *
 * @author Jens
 */
public class Player extends Mob {

    private Keyboard input;
    private Sprite currentPlayer;

    public Player(Keyboard input) {
        this.input = input;
        this.currentPlayer = Sprite.player_up;
    }

    public Player(int x, int y, Keyboard input) {
        this.x = x;
        this.y = y;
        this.input = input;
        this.currentPlayer = Sprite.player_up;
    }

    @Override
    public void update() {
        int xa = 0, ya = 0;
        if (input.up) {
            ya--;
        }
        if (input.down) {
            ya++;
        }
        if (input.left) {
            xa--;
        }
        if (input.right) {
            xa++;
        }

        if (xa != 0 || ya != 0) {
            move(xa, ya);
        }
    }

    public void render(Screen screen) {
        switch (dir) {
            case 0:
                currentPlayer = Sprite.player_up;
                break;
            case 1:
                currentPlayer = Sprite.player_right;
                break;
            case 2:
                currentPlayer = Sprite.player_down;
                break;
            case 3:
                currentPlayer = Sprite.player_left;
                break;
        }
        screen.renderPlayer(x - 16, y - 16, currentPlayer);

    }

}
