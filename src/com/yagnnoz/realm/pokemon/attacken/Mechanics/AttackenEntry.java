package com.yagnnoz.realm.pokemon.attacken.Mechanics;

/**
 *
 * @author Jens
 */
public class AttackenEntry {

    public String name;
    public int reqLevel;

    public AttackenEntry(String name, int reqLvl) {
        this.name = name;
        this.reqLevel = reqLvl;
    }

    public int getReqLvl() {
        if (reqLevel == 0) {
            return 0;
        } else {
            return reqLevel;
        }

    }

}
