package com.yagnnoz.realm.pokemon.attacken.Mechanics;

import com.yagnnoz.realm.pokemon.attacken.attacken.Tackle;
import com.yagnnoz.realm.pokemon.attacken.attacken.Feuersturm;
import com.yagnnoz.realm.pokemon.attacken.attacken.Fadenschuss;
import com.yagnnoz.realm.pokemon.attacken.attacken.Giftstachel;
import com.yagnnoz.realm.pokemon.attacken.attacken.Hydropumpe;

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
        }
        
        return result;
    }
    
}
