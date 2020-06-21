package com.yagnnoz.realm.pokemon.attacken.attacken;

import com.yagnnoz.realm.pokemon.attacken.Mechanics.Attacke;
import com.yagnnoz.realm.pokemon.mechanics.PokemonTyp;

/**
 *
 * @author Jens
 */
public class Tackle extends Attacke {

    public Tackle() {
        str = 30;
        acc = 100;
        typ = PokemonTyp.TYP.NORMAL;
        stdPP = 15;
        maxPP = 25;
        currPP = stdPP;
    }

    @Override
    public String toString() {
        return "Tackle";
    }

}
