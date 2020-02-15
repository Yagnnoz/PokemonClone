package com.yagnnoz.realm.graphics;

import java.util.Random;

/**
 *
 * @author Jens
 */
public class Screen {

    private int width, height;
    public int[] pixels;
    public final int MAP_SIZE = 64;
    public final int MAP_SIZE_MASK = MAP_SIZE - 1;

    public int[] tiles = new int[MAP_SIZE * MAP_SIZE];

    private Random rdm = new Random();

    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new int[width * height];

        //fills tiles with random colors.
        for (int i = 0; i < MAP_SIZE * MAP_SIZE; i++) {
            tiles[i] = rdm.nextInt(0xffffff);
        }
        tiles[0] = 0x000000;
    }

    public void render(int xOffset, int yOffset) {
        for (int y = 0; y < height; y++) {
            int yp = y + yOffset;
            if (yp < 0 || yp >= height) {
                continue;
            }
            for (int x = 0; x < width; x++) {
                int xp = x + xOffset;
                if (xp < 0 || xp >= width) {
                    continue;
                }
                pixels[xp + yp * width] = Sprite.grass.pixels[(x & 15) + (y & 15) * Sprite.grass.SIZE];   // & ist bitwise AND, sorgt hier für Loop der Tiles

            }
        }
    }

    public void clear() {
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = 0;
        }
    }

}
