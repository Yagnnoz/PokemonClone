package com.yagnnoz.realm.level;

import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.level.tile.Tile;

/**
 *
 * @author Jens
 */
public class Level {

    protected Tile[] tiles;
    protected int width, height;
    protected int[] tilesInt;

    public Level(int width, int height) {
        this.width = width;
        this.height = height;
        tilesInt = new int[width * height];
        generateLevel();
    }

    public Level(String path) {
        loadLevel(path);
        generateLevel();
    }

    protected void generateLevel() {

    }

    protected void loadLevel(String path) {

    }

    public void update() {

    }

    public void render(int xScroll, int yScroll, Screen screen) {

        screen.setOffset(xScroll, yScroll);

        /*
        * adding cornerpins.
        * grund: aufteilung des Kooordinatensystems in Tiles, nicht in Pixel
        * x0 -> left side of the screen
        * x1 -> right side of the screen
        * y0 -> top side of the screen
        * y1 -> bottom side of the screen
         */
        int x0 = xScroll >> 4; //shift right um 4 -> identisch mit geteilt durch 16 (größe der tiles).
        int x1 = (xScroll + screen.width + 16) >> 4; //brackets important, so that the division comes after the addition
        int y0 = yScroll >> 4;
        int y1 = (yScroll + screen.height + 16) >> 4;

        for (int y = y0; y < y1; y++) {
            for (int x = x0; x < x1; x++) {
                //getTile(x, y).render(x, y, screen);
                if (x + y * 16 < 0 || x + y * 16 >= 256) {
                    Tile.voidTile.render(x, y, screen);
                    continue;
                }
                tiles[x + y * 16].render(x, y, screen);

            }
        }
    }

    public Tile getTile(int x, int y) {
        if (x < 0 || y < 0 || x >= width || y >= height) {
            return Tile.voidTile;
        }
        if (tilesInt[x + y * width] == 0) {
            return Tile.grass;
        }
        if (tilesInt[x + y * width] == 1) {
            return Tile.flower;
        }
        if (tilesInt[x + y * width] == 2) {
            return Tile.rock;
        }
        return Tile.voidTile;
    }

}
