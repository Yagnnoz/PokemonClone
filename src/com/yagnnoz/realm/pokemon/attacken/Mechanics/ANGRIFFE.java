package com.yagnnoz.realm.pokemon.attacken.Mechanics;

import com.yagnnoz.realm.pokemon.mechanics.Enums;

import static com.yagnnoz.realm.pokemon.mechanics.Enums.ATKTYPE.*;
import static com.yagnnoz.realm.pokemon.mechanics.Enums.TARGET.*;


public enum ANGRIFFE {
    //Name, Target (OWN / ENEMY), STR, ACC, Typ, Type, stdPP, maxPP
    TACKLE("Tackle", ENEMY, 30, 100, Enums.TYP.NORMAL, PHYSICAL, 15, 25);

    private final String NAME;
    private final Enums.TARGET TARGET;
    private final int STR, ACC, STDPP, MAXPP;
    private final Enums.TYP TYPE;
    private final Enums.ATKTYPE ATKTYPE;

    ANGRIFFE(final String name, final Enums.TARGET target, final int str, final int acc, final Enums.TYP type,
             final Enums.ATKTYPE atktype, final int stdPP, final int maxPP) {
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
