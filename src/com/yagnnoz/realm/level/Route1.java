package com.yagnnoz.realm.level;

/**
 *
 * @author Jens
 */
public class Route1 extends SpawnLevel {
    
    
    public Route1(String path) {
        super(path);
        minLvl = 1;
        maxLvl = 4;
        
        spawns.add("Hornliu");
        spawnrate.add(0.4);
        
        spawns.add("Pikachu");
        spawnrate.add(0.5);
        
        spawns.add("Rattfratz");
        spawnrate.add(1.0);
    }

    
}
