package com.yagnnoz.realm.pokemon.attacken.attacken;

import com.yagnnoz.realm.pokemon.attacken.Mechanics.Attacke;
import com.yagnnoz.realm.pokemon.mechanics.PokemonTyp;

/**
 *
 * @author Jens
 */
public class Feuersturm extends Attacke {

    public Feuersturm() {
        str = 90;
        acc = 75;
        typ = PokemonTyp.TYP.FEUER;
        stdPP = 5;
        maxPP = 8;
        currPP = stdPP;
    }

    @Override
    public String toString() {
        return "Feuersturm";
    }
    
}
