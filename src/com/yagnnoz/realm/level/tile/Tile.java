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

    public static Tile spawn_tree = new SpawnTreeTile(Sprite.spawn_tree);
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
