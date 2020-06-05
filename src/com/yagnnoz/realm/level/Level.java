package com.yagnnoz.realm.level;

import com.yagnnoz.realm.entity.mob.Trainer;
import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.level.tile.Tile;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jens
 */
public class Level {

    protected int width, height;
    protected int[] tilesInt;
    protected int[] tiles;

    protected List<String> spawns;
    protected List<Double> spawnrate;

    protected int minLvl;
    protected int maxLvl;

    protected Trainer t1;

    public static Level spawn = new Level("/levels/spawn.png");

    public Level(int width, int height) {
        this.width = width;
        this.height = height;
        tilesInt = new int[width * height];
        spawns = new ArrayList<>();

        generateLevel();

    }

    public Level(String path) {
        loadLevel(path);
        spawns = new ArrayList<>();
        spawnrate = new ArrayList<>();
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
        
        if(t1 != null){
            t1.render(screen);
        }
    }

    public Tile getTile(int x, int y) {
        if (x < 0 || y < 0 || x >= width || y >= height) {
            return Tile.voidTile;
        }
//------------  TREES --------------------------------------
        switch (tiles[x + y * width]) {
            case Tile.COL_SPAWN_TREE_1:
                return Tile.spawn_tree_1;
            case Tile.COL_SPAWN_TREE_2:
                return Tile.spawn_tree_2;
            case Tile.COL_SPAWN_TREE_3:
                return Tile.spawn_tree_3;
            case Tile.COL_SPAWN_TREE_4:
                return Tile.spawn_tree_4;
            case Tile.COL_SPAWN_TREE_5:
                return Tile.spawn_tree_5;
            case Tile.COL_SPAWN_TREE_6:
                return Tile.spawn_tree_6;
            case Tile.COL_SPAWN_TREE_7:
                return Tile.spawn_tree_7;
            case Tile.COL_SPAWN_TREE_8:
                return Tile.spawn_tree_8;
            case Tile.COL_SPAWN_TREE_9:
                return Tile.spawn_tree_9;

            case Tile.COL_SPAWN_TREE_CORNER_1:
                return Tile.spawn_tree_corner1;
            case Tile.COL_SPAWN_TREE_CORNER_2:
                return Tile.spawn_tree_corner2;
            case Tile.COL_SPAWN_TREE_CORNER_3:
                return Tile.spawn_tree_corner3;
            case Tile.COL_SPAWN_TREE_CORNER_4:
                return Tile.spawn_tree_corner4;

//------------- WATER --------------------------------------
            case Tile.COL_SPAWN_WATER_1:
                return Tile.spawn_water_1;
            case Tile.COL_SPAWN_WATER_2:
                return Tile.spawn_water_2;
            case Tile.COL_SPAWN_WATER_3:
                return Tile.spawn_water_3;
            case Tile.COL_SPAWN_WATER_4:
                return Tile.spawn_water_4;
            case Tile.COL_SPAWN_WATER_5:
                return Tile.spawn_water_5;
            case Tile.COL_SPAWN_WATER_6:
                return Tile.spawn_water_6;
            case Tile.COL_SPAWN_WATER_7:
                return Tile.spawn_water_7;
            case Tile.COL_SPAWN_WATER_8:
                return Tile.spawn_water_8;
            case Tile.COL_SPAWN_WATER_9:
                return Tile.spawn_water_9;

            case Tile.COL_SPAWN_WATER_DEEP_1:
                return Tile.spawn_water_deep_1;
            case Tile.COL_SPAWN_WATER_DEEP_2:
                return Tile.spawn_water_deep_2;
            case Tile.COL_SPAWN_WATER_DEEP_3:
                return Tile.spawn_water_deep_3;
            case Tile.COL_SPAWN_WATER_DEEP_4:
                return Tile.spawn_water_deep_4;
            case Tile.COL_SPAWN_WATER_DEEP_5:
                return Tile.spawn_water_deep_5;
            case Tile.COL_SPAWN_WATER_DEEP_6:
                return Tile.spawn_water_deep_6;
            case Tile.COL_SPAWN_WATER_DEEP_7:
                return Tile.spawn_water_deep_7;
            case Tile.COL_SPAWN_WATER_DEEP_8:
                return Tile.spawn_water_deep_8;
            case Tile.COL_SPAWN_WATER_DEEP_9:
                return Tile.spawn_water_deep_9;

            case Tile.COL_SPAWN_WATER_CORNER_1:
                return Tile.spawn_water_corner_1;
            case Tile.COL_SPAWN_WATER_CORNER_2:
                return Tile.spawn_water_corner_2;
            case Tile.COL_SPAWN_WATER_CORNER_3:
                return Tile.spawn_water_corner_3;
            case Tile.COL_SPAWN_WATER_CORNER_4:
                return Tile.spawn_water_corner_4;

//------------------ TALL GRASS ------------------------------------------------                
            case Tile.COL_SPAWN_TALL_GRASS:
                return Tile.spawn_tall_grass;

//------------------ PATH ------------------------------------------------------
            case Tile.COL_SPAWN_PATH_1:
                return Tile.spawn_path_1;
            case Tile.COL_SPAWN_PATH_2:
                return Tile.spawn_path_2;
            case Tile.COL_SPAWN_PATH_3:
                return Tile.spawn_path_3;
            case Tile.COL_SPAWN_PATH_4:
                return Tile.spawn_path_4;
            case Tile.COL_SPAWN_PATH_5:
                return Tile.spawn_path_5;
            case Tile.COL_SPAWN_PATH_6:
                return Tile.spawn_path_6;
            case Tile.COL_SPAWN_PATH_7:
                return Tile.spawn_path_7;
            case Tile.COL_SPAWN_PATH_8:
                return Tile.spawn_path_8;
            case Tile.COL_SPAWN_PATH_9:
                return Tile.spawn_path_9;

            default:
                return Tile.voidTile;
        }
    }

    public List<Double> getSpawnrate() {
        return spawnrate;
    }

    public List<String> getSpawns() {
        return spawns;
    }

}
