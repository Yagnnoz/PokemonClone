package com.yagnnoz.realm.level;

import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.level.tile.Tile;

/**
 *
 * @author Jens
 */
public class Level {

    protected int width, height;
    protected int[] tilesInt;
    protected int[] tiles;
    
    public static Level spawn = new Level("/levels/spawn.png");

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
                getTile(x, y).render(x, y, screen);

            }
        }
    }


    /*
    * Grass = 0xFF00FF00
    * FLower = 0xFFFFFF00
    * ROck = 0xFF7F7F00
    * Tree_Tile1: 0xFF008C12
    * Tree_Tile2: 0xFF2D8E00
    * Tree_Tile3: 0xFF005109
    * Tree_Tile4: 0xFF007A0C
    
    * Tree_Tile5: 0xFF007A0C unused
    
    * Tree_Tile6: 0xFF007A0C unused
    
    * Tree_Tile7: 0xFF113800
    
    * Tree_Tile8: 0xFF1C5B00
    * Tree_Tile9: 0xFF0A5900
    *
     */
    public Tile getTile(int x, int y) {
        if (x < 0 || y < 0 || x >= width || y >= height) {
            return Tile.voidTile;
        }
        if (tiles[x + y * width] == Tile.COL_SPAWN_TREE_1) {
            return Tile.spawn_tree_1;
        }
        if (tiles[x + y * width] == Tile.COL_SPAWN_TREE_2) {
            return Tile.spawn_tree_2;
        }
        if (tiles[x + y * width] == Tile.COL_SPAWN_TREE_3) {
            return Tile.spawn_tree_3;
        }
        if (tiles[x + y * width] == Tile.COL_SPAWN_TREE_4) {
            return Tile.spawn_tree_4;
        }
        if (tiles[x + y * width] == Tile.COL_SPAWN_TREE_5) {
            return Tile.spawn_tree_5;
        }
        if (tiles[x + y * width] == Tile.COL_SPAWN_TREE_6) {
            return Tile.spawn_tree_6;
        }
        if (tiles[x + y * width] == Tile.COL_SPAWN_TREE_7) {
            return Tile.spawn_tree_7;
        }
        if (tiles[x + y * width] == Tile.COL_SPAWN_TREE_8) {
            return Tile.spawn_tree_8;
        }
        if (tiles[x + y * width] == Tile.COL_SPAWN_TREE_9) {
            return Tile.spawn_tree_9;
        }
        if (tiles[x + y * width] == Tile.COL_SPAWN_TREE_CORNER_1) {
            return Tile.spawn_tree_corner1;
        }
        if (tiles[x + y * width] == Tile.COL_SPAWN_TREE_CORNER_2) {
            return Tile.spawn_tree_corner2;
        }
        if (tiles[x + y * width] == Tile.COL_SPAWN_TREE_CORNER_3) {
            return Tile.spawn_tree_corner3;
        }
        if (tiles[x + y * width] == Tile.COL_SPAWN_TREE_CORNER_4) {
            return Tile.spawn_tree_corner4;
        }
        
        
        
        /*
        if (tiles[x + y * width] == Tile.col_spawnWater) {
            return Tile.spawn_water;
        }
        if (tiles[x + y * width] == Tile.col_spawnDirt) {
            return Tile.spawn_sand;
        }
        if (tiles[x + y * width] == Tile.col_spawnHighGrass) {
            return Tile.spawn_grass;
        }*/
        
        return Tile.voidTile;
    }

}
