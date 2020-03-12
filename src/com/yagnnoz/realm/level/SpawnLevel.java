package com.yagnnoz.realm.level;

import com.yagnnoz.realm.level.tile.GrassTile;
import com.yagnnoz.realm.level.tile.Tile;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 *
 * @author Jens Kroll
 */
public class SpawnLevel extends Level {

    private Tile[] tiles;
    private int[] lvlPixels;

    public SpawnLevel(String path) {
        super(path);
    }

    @Override
    protected void loadLevel(String path) {
        try {
            BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path));
            int w = image.getWidth();
            int h = image.getHeight();
            tiles = new Tile[w * h];
            image.getRGB(0, 0, w, h, lvlPixels, 0, w);

        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Exception! Could not load level file!");
        }
    }

    /*
    * Grass = 0x00FF00
    * FLower = 0xFFFF00
    * ROck = 0x7F7F00
     */
    @Override
    protected void generateLevel() {
        for (int i = 0; i < lvlPixels.length; i++) {
            if (lvlPixels[i] == 0xff00) {
                tiles[i] = Tile.grass;
            }
            if (lvlPixels[i] == 0xffff00) {
                tiles[i] = Tile.flower;
            }
            if (lvlPixels[i] == 0x7f7f00) {
                tiles[i] = Tile.rock;
            }

        }
    }
}
