package com.yagnnoz.realm.level.tile;

import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.graphics.Sprite;

/**
 *
 * @author Jens
 */
public class Tile {
    
    public int x,y;
    public Sprite sprite;
    
    public static Tile grass = new GrassTile(Sprite.grass);
    public static Tile grass2 = new GrassTile(Sprite.grass2);
    public static Tile grass3 = new GrassTile(Sprite.grass3);
    public static Tile voidTile = new VoidTile(Sprite.voidSprite);
    
    public Tile(Sprite sprite){
        this.sprite = sprite;
    }
    
    public void render(int x, int y, Screen screen){
        
    }
    
    public boolean solid(){
        return false;
    }
    
}
