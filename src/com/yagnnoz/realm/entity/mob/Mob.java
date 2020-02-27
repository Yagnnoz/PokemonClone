package com.yagnnoz.realm.entity.mob;

import com.yagnnoz.realm.entity.Entity;
import com.yagnnoz.realm.graphics.Sprite;

/**
 *
 * @author Jens
 */
public abstract class Mob extends Entity{
    
    protected Sprite sprite;
    protected int dir = 0; //direction. 0 north, 1 east, 2 south, 3 west
    protected boolean moving = false;
    
    public void move(){
    }
    
    public void update(){
    }
    
    private boolean collision(){
        return false;
    }
    
}
