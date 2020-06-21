package com.yagnnoz.realm.pokemon.attacken;

/**
 *
 * @author Jens
 */
public class AttackenFactory {
    
    public static Attacke makeAttacke(String name){
        Attacke result = null;
        
        switch (name){
            case "Tackle":
                result = new Tackle();
        }
        
        return result;
    }
    
}
