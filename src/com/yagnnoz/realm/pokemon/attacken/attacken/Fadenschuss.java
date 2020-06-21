package com.yagnnoz.realm.pokemon.attacken.attacken;

import com.yagnnoz.realm.pokemon.attacken.Mechanics.Attacke;
import com.yagnnoz.realm.pokemon.mechanics.PokemonTyp;

/**
 *
 * @author Jens
 */
public class Fadenschuss extends Attacke {

    public Fadenschuss() {
        str = 0;
        acc = 100;
        typ = PokemonTyp.TYP.KÄFER;
        stdPP = 15;
        maxPP = 25;
        currPP = stdPP;
    }

    @Override
    public String toString() {
        return "Fadenschuss";
    }
    
}
