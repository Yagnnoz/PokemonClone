package com.yagnnoz.realm.level;

import com.yagnnoz.realm.graphics.Screen;

/**
 *
 * @author Jens
 */
public class Level {
    
    protected int width, height;
    protected int[] tiles;
    
    public Level(int width, int height){
        this.width = width;
        this.height = height;
        tiles = new int[width*height];
        generateLevel();
    }
    
    public Level(String path){
        loadLevel(path);
    }

    protected void generateLevel() {
        
    }

    private void loadLevel(String path) {
        
    }
    
    public void update(){
        
    }
    
    public void render(int xScroll, int yScroll, Screen screen){
        
    }
    
}
