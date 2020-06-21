package com.yagnnoz.realm.pokemon.attacken.attacken;

import com.yagnnoz.realm.pokemon.attacken.Mechanics.Attacke;
import com.yagnnoz.realm.pokemon.mechanics.PokemonTyp;

/**
 *
 * @author Jens
 */
public class Giftstachel extends Attacke{

    public Giftstachel() {
        str = 15;
        acc = 95;
        typ = PokemonTyp.TYP.GIFT;
        stdPP = 15;
        maxPP = 25;
        currPP = stdPP;
    }

    
    
    @Override
    public String toString() {
        return "Giftstachel";
    }
    
}
