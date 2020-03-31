package com.yagnnoz.realm.level.tile;

import com.yagnnoz.realm.level.tile.spawn_level.*;

import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.graphics.Sprite;

/**
 *
 * @author Jens
 */
public class Tile {

    public int x, y;
    public Sprite sprite;

    public static Tile grass = new GrassTile(Sprite.grass);
    public static Tile flower = new FlowerTile(Sprite.flower);
    public static Tile rock = new RockTile(Sprite.rock);
    public static Tile voidTile = new VoidTile(Sprite.voidSprite);

    //------------------------------------------------------------------------\\
    //------------------------------ SPAWN-LEVEL------------------------------\\
    //------------------------------------------------------------------------\\
    //-------------------------------- TREES -----------------------------------
    public static Tile spawn_tree_1 = new SpawnTreeTile(Sprite.spawn_tree_1);
    public static Tile spawn_tree_2 = new SpawnTreeTile(Sprite.spawn_tree_2);
    public static Tile spawn_tree_3 = new SpawnTreeTile(Sprite.spawn_tree_3);
    public static Tile spawn_tree_4 = new SpawnTreeTile(Sprite.spawn_tree_4);
    public static Tile spawn_tree_5 = new SpawnTreeTile(Sprite.spawn_tree_5);
    public static Tile spawn_tree_6 = new SpawnTreeTile(Sprite.spawn_tree_6);
    public static Tile spawn_tree_7 = new SpawnTreeTile(Sprite.spawn_tree_7);
    public static Tile spawn_tree_8 = new SpawnTreeTile(Sprite.spawn_tree_8);
    public static Tile spawn_tree_9 = new SpawnTreeTile(Sprite.spawn_tree_9);

    public static Tile spawn_tree_corner1 = new SpawnTreeTile(Sprite.spawn_tree_corner1);
    public static Tile spawn_tree_corner2 = new SpawnTreeTile(Sprite.spawn_tree_corner2);
    public static Tile spawn_tree_corner3 = new SpawnTreeTile(Sprite.spawn_tree_corner3);
    public static Tile spawn_tree_corner4 = new SpawnTreeTile(Sprite.spawn_tree_corner4);
    //------------------------------ TREE-COLORS -------------------------------
    public static final int COL_SPAWN_TREE_1 = 0xFF008C12;
    public static final int COL_SPAWN_TREE_2 = 0xFF2D8E00;
    public static final int COL_SPAWN_TREE_3 = 0xFF005109;
    public static final int COL_SPAWN_TREE_4 = 0xFF007A0C;
    public static final int COL_SPAWN_TREE_5 = 0xFF16C400;
    public static final int COL_SPAWN_TREE_6 = 0xFF1BC126;
    public static final int COL_SPAWN_TREE_7 = 0xFF113800;
    public static final int COL_SPAWN_TREE_8 = 0xFF1C5B00;
    public static final int COL_SPAWN_TREE_9 = 0xFF0A5900;

    public static final int COL_SPAWN_TREE_CORNER_1 = 0xFF004E0C;
    public static final int COL_SPAWN_TREE_CORNER_2 = 0xFF00680F;
    public static final int COL_SPAWN_TREE_CORNER_3 = 0xFF008712;
    public static final int COL_SPAWN_TREE_CORNER_4 = 0xFF009E15;

    //------------------------------ WATER -------------------------------------
    public static Tile spawn_water_1 = new SpawnWaterTile(Sprite.spawn_water_1);
    public static Tile spawn_water_2 = new SpawnWaterTile(Sprite.spawn_water_2);
    public static Tile spawn_water_3 = new SpawnWaterTile(Sprite.spawn_water_3);
    public static Tile spawn_water_4 = new SpawnWaterTile(Sprite.spawn_water_4);
    public static Tile spawn_water_5 = new SpawnWaterTile(Sprite.spawn_water_5);
    public static Tile spawn_water_6 = new SpawnWaterTile(Sprite.spawn_water_6);
    public static Tile spawn_water_7 = new SpawnWaterTile(Sprite.spawn_water_7);
    public static Tile spawn_water_8 = new SpawnWaterTile(Sprite.spawn_water_8);
    public static Tile spawn_water_9 = new SpawnWaterTile(Sprite.spawn_water_9);

    public static Tile spawn_water_deep_1 = new SpawnWaterTile(Sprite.spawn_water_deep_1);
    public static Tile spawn_water_deep_2 = new SpawnWaterTile(Sprite.spawn_water_deep_2);
    public static Tile spawn_water_deep_3 = new SpawnWaterTile(Sprite.spawn_water_deep_3);
    public static Tile spawn_water_deep_4 = new SpawnWaterTile(Sprite.spawn_water_deep_4);
    public static Tile spawn_water_deep_5 = new SpawnWaterTile(Sprite.spawn_water_deep_5);
    public static Tile spawn_water_deep_6 = new SpawnWaterTile(Sprite.spawn_water_deep_6);
    public static Tile spawn_water_deep_7 = new SpawnWaterTile(Sprite.spawn_water_deep_7);
    public static Tile spawn_water_deep_8 = new SpawnWaterTile(Sprite.spawn_water_deep_8);
    public static Tile spawn_water_deep_9 = new SpawnWaterTile(Sprite.spawn_water_deep_9);

    public static Tile spawn_water_corner_1 = new SpawnWaterTile(Sprite.spawn_water_corner_1);
    public static Tile spawn_water_corner_2 = new SpawnWaterTile(Sprite.spawn_water_corner_2);
    public static Tile spawn_water_corner_3 = new SpawnWaterTile(Sprite.spawn_water_corner_3);
    public static Tile spawn_water_corner_4 = new SpawnWaterTile(Sprite.spawn_water_corner_4);

    //-------------------------- WATER-COLORS ----------------------------------
    public static final int COL_SPAWN_WATER_1 = 0xFF006CFF;
    public static final int COL_SPAWN_WATER_2 = 0xFF0065EA;
    public static final int COL_SPAWN_WATER_3 = 0xFF0055C4;
    public static final int COL_SPAWN_WATER_4 = 0xFF004EAD;
    public static final int COL_SPAWN_WATER_5 = 0xFF004DA5;
    public static final int COL_SPAWN_WATER_6 = 0xFF004799;
    public static final int COL_SPAWN_WATER_7 = 0xFF00418C;
    public static final int COL_SPAWN_WATER_8 = 0xFF003B7F;
    public static final int COL_SPAWN_WATER_9 = 0xFF003572;

    public static final int COL_SPAWN_WATER_DEEP_1 = 0xFF0033FF;
    public static final int COL_SPAWN_WATER_DEEP_2 = 0xFF0030F2;
    public static final int COL_SPAWN_WATER_DEEP_3 = 0xFF002DE5;
    public static final int COL_SPAWN_WATER_DEEP_4 = 0xFF002BD8;
    public static final int COL_SPAWN_WATER_DEEP_5 = 0xFF0023B2;
    public static final int COL_SPAWN_WATER_DEEP_6 = 0xFF0021A8;
    public static final int COL_SPAWN_WATER_DEEP_7 = 0xFF001F9B;
    public static final int COL_SPAWN_WATER_DEEP_8 = 0xFF001C8C;
    public static final int COL_SPAWN_WATER_DEEP_9 = 0xFF00187C;

    public static final int COL_SPAWN_WATER_CORNER_1 = 0xFF0008FF;
    public static final int COL_SPAWN_WATER_CORNER_2 = 0xFF0007E8;
    public static final int COL_SPAWN_WATER_CORNER_3 = 0xFF0007DB;
    public static final int COL_SPAWN_WATER_CORNER_4 = 0xFF0006CE;

    //---------------------------- PATH ---------------------------------------
    public static Tile spawn_path_1 = new GrassTile(Sprite.spawn_path_1);
    public static Tile spawn_path_2 = new GrassTile(Sprite.spawn_path_2);
    public static Tile spawn_path_3 = new GrassTile(Sprite.spawn_path_3);
    public static Tile spawn_path_4 = new GrassTile(Sprite.spawn_path_4);
    public static Tile spawn_path_5 = new GrassTile(Sprite.spawn_path_5);
    public static Tile spawn_path_6 = new GrassTile(Sprite.spawn_path_6);
    public static Tile spawn_path_7 = new GrassTile(Sprite.spawn_path_7);
    public static Tile spawn_path_8 = new GrassTile(Sprite.spawn_path_8);
    public static Tile spawn_path_9 = new GrassTile(Sprite.spawn_path_9);
    
    //------------------------- PATH-COLORS -----------------------------------
    public static final int COL_SPAWN_PATH_1 = 0xFFFDD78B;
    public static final int COL_SPAWN_PATH_2 = 0xFFEFCB83;
    public static final int COL_SPAWN_PATH_3 = 0xFFE5C37E;
    public static final int COL_SPAWN_PATH_4 = 0xFFCCAE72;
    public static final int COL_SPAWN_PATH_5 = 0xFFBCA169;
    public static final int COL_SPAWN_PATH_6 = 0xFFB79C66;
    public static final int COL_SPAWN_PATH_7 = 0xFFA58C5C;
    public static final int COL_SPAWN_PATH_8 = 0xFF917A51;
    public static final int COL_SPAWN_PATH_9 = 0xFF7F6A47;
    
    //----------------------- TALL-GRASS ---------------------------------------
    public static Tile spawn_tall_grass = new SpawnSandTile(Sprite.spawn_path);
    //------------------ TALL GRASS COLORS -------------------------------------
    public static final int COL_SPAWN_TALL_GRASS = 0xFF00FF00;

    public Tile(Sprite sprite) {
        this.sprite = sprite;
    }

    public void render(int x, int y, Screen screen) {

    }

    public boolean solid() {
        return false;
    }

}
