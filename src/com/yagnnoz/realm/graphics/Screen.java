package com.yagnnoz.realm.graphics;

import java.util.Random;

/**
 *
 * @author Jens
 */
public class Screen {

    private int width, height;
    public int[] pixels;

    public int[] tiles = new int[64 * 64];

    private Random rdm = new Random();

    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new int[width * height];

        //fills tiles with random colors.
        for (int i = 0; i < 64 * 64; i++) {
            tiles[i] = rdm.nextInt(0xffffff);
        }
    }

    public void render() {
        for (int y = 0; y < height; y++) {
            if (y < 0 || y >= height) {
                break;
            }

            for (int x = 0; x < width; x++) {
                if (x < 0 || x >= width) {
                    break;
                }
                //x>>4 ist das gleiche wie x/16. bitshift nach rechts um  4 -> geteilt durch 2^4 => geteilt durch 16
                //bessere performance in nested for loops
                int tileIndex = (x >> 4) + (y >> 4) * 64;     //a single tile is 16x16
                pixels[x + y * width] = tiles[tileIndex];   //kein 2D array, darum so.

            }
        }
    }

    public void clear() {
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = 0;
        }
    }

}
