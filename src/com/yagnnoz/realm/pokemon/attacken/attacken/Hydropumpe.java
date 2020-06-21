package com.yagnnoz.realm.pokemon.attacken.attacken;

import com.yagnnoz.realm.pokemon.attacken.Mechanics.Attacke;
import com.yagnnoz.realm.pokemon.mechanics.PokemonTyp;

/**
 *
 * @author Jens
 */
public class Hydropumpe extends Attacke{
    
    public Hydropumpe(){
        str = 120;
        acc = 70;
        typ = PokemonTyp.TYP.WASSER;
        stdPP = 15;
        maxPP = 25;
        currPP = stdPP;
    }
    
    @Override
    public String toString() {
        return "Hydropumpe";
    }
    
}
