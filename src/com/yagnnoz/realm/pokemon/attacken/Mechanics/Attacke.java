package com.yagnnoz.realm.pokemon.attacken.Mechanics;

import com.yagnnoz.realm.pokemon.mechanics.Enums;

/**
 *
 * @author Jens
 */
public abstract class Attacke {

    protected int str;
    protected int acc;
    protected int maxPP;
    protected int stdPP;
    protected int currPP;
    protected Enums.TYP typ;
    protected String text;
    
    
    public abstract String toString();
}
