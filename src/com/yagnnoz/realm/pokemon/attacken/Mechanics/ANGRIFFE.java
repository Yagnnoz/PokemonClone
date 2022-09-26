package com.yagnnoz.realm.pokemon.attacken.Mechanics;

import com.yagnnoz.realm.pokemon.mechanics.Enums;

import static com.yagnnoz.realm.pokemon.mechanics.Enums.ATKTYPE.*;
import static com.yagnnoz.realm.pokemon.mechanics.Enums.TARGET.*;
import static com.yagnnoz.realm.pokemon.mechanics.Enums.TYP.*;
import static com.yagnnoz.realm.pokemon.mechanics.Enums.*;


public enum ANGRIFFE {
    //Name, Target (OWN / ENEMY), STR, ACC, Typ, Type, stdPP, maxPP
    TACKLE("Tackle", ENEMY, 30, 100, NORMAL, PHYSICAL, 15, 25),
    FADENSCHUSS("Fadenschuss",ENEMY, -1,100,KAEFER, STATUS, 15, 25),
    FEUERSTURM("Feuersturm",ENEMY, 90, 75, FEUER, PHYSICAL, 5, 8),
    GIFTSTACHEL("Giftstachel",ENEMY, 15,95, GIFT,PHYSICAL,15,25),
    HEULER("Heuler",ENEMY,-1,100,NORMAL, STATUS, 15,25),
    HYDROPUMPE("Hydropumpe", ENEMY,120, 70, WASSER, PHYSICAL, 15,25);

    private final String NAME;
    private final Enums.TARGET TARGET;
    private final int STR, ACC, STDPP, MAXPP;
    private final Enums.TYP TYPE;
    private final Enums.ATKTYPE ATKTYPE;

    ANGRIFFE(final String name, final TARGET target, final int str, final int acc, final TYP type,
             final ATKTYPE atktype, final int stdPP, final int maxPP) {
        NAME = name;
        TARGET = target;
        STR = str;
        ACC = acc;
        TYPE = type;
        ATKTYPE = atktype;
        STDPP = stdPP;
        MAXPP = maxPP;

    }

    public String toString() {
        return NAME;
    }
}
