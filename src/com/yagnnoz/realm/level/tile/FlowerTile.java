package com.yagnnoz.realm.level.tile;

import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.graphics.Sprite;

/**
 *
 * @author Jens
 */
public class FlowerTile extends Tile {

    public FlowerTile(Sprite sprite) {
        super(sprite);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);    //multiply x & y by 16, to get back to pixel values from tile values
    }

}
