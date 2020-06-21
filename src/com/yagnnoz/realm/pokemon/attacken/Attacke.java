package com.yagnnoz.realm.pokemon.attacken;

import com.yagnnoz.realm.pokemon.mechanics.PokemonTyp;

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
    protected PokemonTyp.TYP typ;
    protected String text;
    
    
    public abstract String toString();
}
