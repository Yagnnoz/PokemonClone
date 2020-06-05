package com.yagnnoz.realm.level;

import com.yagnnoz.realm.entity.mob.Trainer;
import com.yagnnoz.realm.pokemon.Rattfratz;

/**
 *
 * @author Jens
 */
public class Route1 extends SpawnLevel {
    
    
    
    public Route1(String path) {
        super(path);
        minLvl = 1;
        maxLvl = 4;
        
        TileCoordinate trainerSpawn = new TileCoordinate(3, 3);
        
        spawns.add("Hornliu");
        spawnrate.add(0.4);
        
        spawns.add("Pikachu");
        spawnrate.add(0.5);
        
        spawns.add("Rattfratz");
        spawnrate.add(1.0);
        
        t1 = new Trainer(trainerSpawn.getX(),trainerSpawn.getY());
        t1.addPokemon(new Rattfratz(2));
    }

    
}
