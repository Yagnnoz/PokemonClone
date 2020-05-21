package com.yagnnoz.realm;

import com.yagnnoz.realm.pokemon.Pokemon;
import com.yagnnoz.realm.pokemon.PokemonFactory;

/**
 *
 * @author Jens
 */
public class FightHandler {

    private Pokemon opponent;
    private Pokemon ownPokemon;
    private final Game game;
    private PokemonFactory factory;

    FightHandler(Game game) {
        this.game = game;
        factory = new PokemonFactory();
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
        if(opponent == null && ownPokemon == null){
            startFight();
        }
    }

    public void startFight() {
        //set own pokemon
        ownPokemon = game.getTeam().get(0);
        //figure out the enemy (wild) pokemon
        double rnd = Math.random();
        System.out.println(rnd);
        for(int i = 0; i<game.getLevel().getSpawnrate().size(); i++){
            if(i==0){
                if(rnd <= game.getLevel().getSpawnrate().get(0)){
                    opponent = factory.makePokemon(game.getLevel().getSpawns().get(i), 2);
                }
            }else{
                if(rnd <= game.getLevel().getSpawnrate().get(i)  && (rnd > game.getLevel().getSpawnrate().get(i-1))){
                    opponent = factory.makePokemon(game.getLevel().getSpawns().get(i), 2);
                }
            }
        }
        
        System.out.println(opponent.toString() + " LvL: "+ opponent.getLevel()); //sollte Hornliu lvl 2 sein
    }
}
