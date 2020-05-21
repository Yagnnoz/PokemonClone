package com.yagnnoz.realm.pokemon;

/**
 *
 * @author Jens
 */
public abstract class Pokemon {
    
    int level;
    String name;
    
    
    Pokemon(int level){
        this.level = level;
    }
    
    public int getLevel(){
        return level;
    }
    
    /**
     *
     * @return
     * Name of the Pokemon
     */
    @Override
    public String toString(){
        if (name != null){
            return name;
        }else{
            return null;
        }
    }
    
    protected void setName(String name){
        this.name = name;
    }
    
}
