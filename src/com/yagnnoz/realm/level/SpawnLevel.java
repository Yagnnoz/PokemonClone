package com.yagnnoz.realm.level;

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
            image.getRGB(0, 0, w, h, lvlPixels, 0, w);

        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Exception! Could not load level file!");
        }
    }
}
