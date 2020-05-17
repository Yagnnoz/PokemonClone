package com.yagnnoz.realm.level;

import java.util.List;

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
    }

    
}
