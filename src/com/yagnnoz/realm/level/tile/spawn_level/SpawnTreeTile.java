package com.yagnnoz.realm.level.tile.spawn_level;

import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.graphics.Sprite;
import com.yagnnoz.realm.level.tile.Tile;

/**
 *
 * @author Jens
 */
public class SpawnTreeTile extends Tile {

    public SpawnTreeTile(Sprite sprite) {
        super(sprite);
    }

    @Override
    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);    //multiply x & y by 16, to get back to pixel values from tile values
    }

    @Override
    public boolean solid() {
        return true;
    }
}
