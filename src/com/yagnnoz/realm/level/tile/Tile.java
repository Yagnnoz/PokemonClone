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

    //------------------------------ SPAWN-LEVEL------------------------------\\
    //-------------------- TREES ----------------------------------------------
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
    //---------------------- TREE-COLORS --------------------------------------
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
    
    public static Tile spawn_grass = new SpawnGrassTile(Sprite.spawn_grass);
    public static Tile spawn_flower = new SpawnGrassTile(Sprite.spawn_flower);
    public static Tile spawn_rock = new SpawnRockTile(Sprite.spawn_rock);
    public static Tile spawn_sand = new SpawnSandTile(Sprite.spawn_sand);
    public static Tile spawn_shroom = new SpawnGrassTile(Sprite.spawn_shroom);
    public static Tile spawn_water = new SpawnWaterTile(Sprite.spawn_water);
    
    public static final int col_spawnTree = 0xff1C5B00;
    public static final int col_spawnHighGrass = 0xff89FF53;
    public static final int col_spawnWater = 0xff006CFF;
    public static final int col_spawnDirt = 0xffFDD78B;
    
    

    public Tile(Sprite sprite) {
        this.sprite = sprite;
    }

    public void render(int x, int y, Screen screen) {

    }

    public boolean solid() {
        return false;
    }

}
