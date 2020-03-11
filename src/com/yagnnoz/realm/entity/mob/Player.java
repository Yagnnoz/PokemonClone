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
    private Sprite sprite;
    private int animate = 0;
    private boolean walking = false;

    public Player(Keyboard input) {
        this.input = input;
        this.sprite = Sprite.player_up;
    }

    public Player(int x, int y, Keyboard input) {
        this.x = x;
        this.y = y;
        this.input = input;
        this.sprite = Sprite.player_up;
    }

    @Override
    public void update() {
        int xa = 0, ya = 0;
        if (animate < 7500) {
            animate++;
        } else {
            animate = 0;
        }
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
            walking = true;
            move(xa, ya);
        } else {
            walking = false;
        }
    }

    @Override
    public void render(Screen screen) {
        if (dir == 0) {
            sprite = Sprite.player_up;
            if (walking) {
                if (animate % 40 > 10 && animate % 40 <= 20) {
                    sprite = Sprite.player_up_1;
                }
                if (animate % 40 > 30 && animate % 40 <= 40) {
                    sprite = Sprite.player_up_2;
                }
            }
        }
        if (dir == 1) {
            sprite = Sprite.player_right;
            if (walking) {
                if (animate % 40 > 10 && animate % 40 <= 20) {
                    sprite = Sprite.player_right_1;
                }
                if (animate % 40 > 30 && animate % 40 <= 40) {
                    sprite = Sprite.player_right_2;
                }
            }
        }
        if (dir == 2) {
            sprite = Sprite.player_down;
            if (walking) {
                if (animate % 40 > 10 && animate % 40 <= 20) {
                    sprite = Sprite.player_down_1;
                }
                if (animate % 40 > 30 && animate % 40 <= 40) {
                    sprite = Sprite.player_down_2;
                }
            }
        }
        if (dir == 3) {
            sprite = Sprite.player_left;
            if (walking) {
                if (animate % 40 > 10 && animate % 40 <= 20) {
                    sprite = Sprite.player_left_1;
                }
                if (animate % 40 > 30 && animate % 40 <= 40) {
                    sprite = Sprite.player_left_2;
                }
            }
        }

        screen.renderPlayer(x - 16, y - 16, sprite);

    }

}
