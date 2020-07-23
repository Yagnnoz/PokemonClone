package com.yagnnoz.realm.pokemon.attacken.attacken;

import com.yagnnoz.realm.pokemon.attacken.Mechanics.Attacke;
import com.yagnnoz.realm.pokemon.mechanics.Enums;

/**
 *
 * @author Jens
 */
public class Tackle extends Attacke {

    public Tackle() {
        str = 30;
        acc = 100;
        typ = Enums.TYP.NORMAL;
        stdPP = 15;
        maxPP = 25;
        currPP = stdPP;
    }

    @Override
    public String toString() {
        return "Tackle";
    }

}
