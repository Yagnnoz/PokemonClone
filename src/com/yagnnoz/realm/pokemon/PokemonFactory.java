package com.yagnnoz.realm.pokemon;

/**
 *
 * @author Jens
 */
public class PokemonFactory {
    
    public static Pokemon makePokemon(String name, int Lvl){
        Pokemon result = null;
        
        switch (name){
            case "Hornliu":
                result = new Hornliu(Lvl);
                break;
            case "Pikachu":
                result = new Pikachu(Lvl);
                break;
            case "Rattfratz":
                result = new Rattfratz(Lvl);
                break;
        }
        
        return result;
    }
    
}
