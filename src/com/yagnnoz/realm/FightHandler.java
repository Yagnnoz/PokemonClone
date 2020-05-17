package com.yagnnoz.realm;

import com.yagnnoz.realm.pokemon.Pokemon;

/**
 *
 * @author Jens
 */
public class FightHandler {

    private Pokemon opponent;
    private Pokemon ownPokemon;
    private final Game game;

    FightHandler(Game game) {
        this.game = game;
    }

    public void setOpponent(Pokemon pkmn) {
        opponent = pkmn;
    }

    public void setOwnPokemon(Pokemon pkmn) {
        ownPokemon = pkmn;
    }

    public void reset() {
        opponent = null;
        ownPokemon = null;
    }

    void update() {

    }

    public void startFight() {
        //set own pokemon
        ownPokemon = game.getTeam().get(0);
        //figure out the enemy (wild) pokemon
        double rnd = Math.random();
        for(int i = 0; i<game.getLevel().getSpawnrate().size()-1; i++){
            if(i==0){
                if(rnd <= game.getLevel().getSpawnrate().get(0)){
                    
                }
            }
        }
    }
}
