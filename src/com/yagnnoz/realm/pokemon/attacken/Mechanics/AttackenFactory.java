package com.yagnnoz.realm.pokemon.attacken.Mechanics;

import com.yagnnoz.realm.pokemon.attacken.attacken.Tackle;
import com.yagnnoz.realm.pokemon.attacken.attacken.Feuersturm;
import com.yagnnoz.realm.pokemon.attacken.attacken.Fadenschuss;

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
                
        }
        
        return result;
    }
    
}
