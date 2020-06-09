package com.yagnnoz.realm.level;

import com.yagnnoz.realm.entity.mob.Trainer;
import com.yagnnoz.realm.pokemon.Hornliu;
import java.util.ArrayList;

/**
 *
 * @author Jens
 */
public class Route1 extends SpawnLevel {
    
    
    
    public Route1(String path) {
        super(path);
        minLvl = 1;
        maxLvl = 4;
        
        TileCoordinate trainerSpawn = new TileCoordinate(2, 3);
        
        spawns.add("Hornliu");
        spawnrate.add(0.4);
        
        spawns.add("Pikachu");
        spawnrate.add(0.5);
        
        spawns.add("Rattfratz");
        spawnrate.add(1.0);
        
        enemyTrainer = new ArrayList<>();
        
        Trainer t1 = new Trainer(trainerSpawn, 1);
        t1.addPokemon(new Hornliu(2));
        
        enemyTrainer.add(t1);
        System.out.println(t1.x / 16 + ", "+ t1.y / 16);
        
    }

    
}
