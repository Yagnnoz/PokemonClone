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
    
    
    public Tile(Sprite sprite){
        this.sprite = sprite;
    }
    
    public void render(int x, int y, Screen screen){
        
    }
    
    public boolean solid(){
        return false;
    }
    
}
