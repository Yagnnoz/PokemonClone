package com.yagnnoz.realm.entity.mob;

import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.graphics.Sprite;
import java.util.ArrayList;

/**
 *
 * @author Jens
 */
public class Trainer extends Player {
    
    public Trainer(int x, int y) {
        super(x,y, null);
        this.sprite = Sprite.trainer_left;
        team = new ArrayList<>();
        dir = 1;
    }
    
    
    @Override
    public void render(Screen screen) {
        if (dir == 0) {
            sprite = Sprite.trainer_up;
            if (walking) {
                if (animate % 40 > 10 && animate % 40 <= 20) {
                    sprite = Sprite.trainer_up_1;
                }
                if (animate % 40 > 30 && animate % 40 <= 40) {
                    sprite = Sprite.trainer_up_2;
                }
            }
        }
        if (dir == 1) {
            sprite = Sprite.trainer_right;
            if (walking) {
                if (animate % 40 > 10 && animate % 40 <= 20) {
                    sprite = Sprite.trainer_right_1;
                }
                if (animate % 40 > 30 && animate % 40 <= 40) {
                    sprite = Sprite.trainer_right_2;
                }
            }
        }
        if (dir == 2) {
            sprite = Sprite.trainer_down;
            if (walking) {
                if (animate % 40 > 10 && animate % 40 <= 20) {
                    sprite = Sprite.trainer_down_1;
                }
                if (animate % 40 > 30 && animate % 40 <= 40) {
                    sprite = Sprite.trainer_down_2;
                }
            }
        }
        if (dir == 3) {
            sprite = Sprite.trainer_left;
            if (walking) {
                if (animate % 40 > 10 && animate % 40 <= 20) {
                    sprite = Sprite.trainer_left_1;
                }
                if (animate % 40 > 30 && animate % 40 <= 40) {
                    sprite = Sprite.trainer_left_2;
                }
            }
        }

        screen.renderPlayer(x - 16, y - 16, sprite);

    }
    
    
   
    
}
