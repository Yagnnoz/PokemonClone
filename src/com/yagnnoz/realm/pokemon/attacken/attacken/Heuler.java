package com.yagnnoz.realm.pokemon.attacken.attacken;

import com.yagnnoz.realm.pokemon.attacken.Mechanics.Attacke;
import com.yagnnoz.realm.pokemon.mechanics.Enums;

public class Heuler extends Attacke {

    public Heuler(){
        str = 0;
        acc = 100;
        typ = Enums.TYP.NORMAL;
        stdPP = 15;
        maxPP = 25;
        currPP = stdPP;
    }


    @Override
    public String toString() {
        return "Heuler";
    }
}
