package com.yagnnoz.realm.pokemon.attacken.Mechanics;

import com.yagnnoz.realm.pokemon.attacken.attacken.*;

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
                break;
            case "Fadenschuss":
                result = new Fadenschuss();
                break;
            case "Feuersturm":
                result = new Feuersturm();
                break;
            case "Giftstachel":
                result = new Giftstachel();
                break;
            case "Hydropumpe":
                result = new Hydropumpe();
                break;
            case "Heuler":
                result = new Heuler();
                break;
        }
        
        return result;
    }
    
}
