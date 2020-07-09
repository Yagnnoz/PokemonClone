package com.yagnnoz.realm;

import com.yagnnoz.realm.entity.mob.Player;
import com.yagnnoz.realm.entity.mob.Trainer;
import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.pokemon.mechanics.Pokemon;
import com.yagnnoz.realm.pokemon.mechanics.PokemonFactory;

/**
 *
 * @author Jens
 */
public class FightHandler {

    public enum PLAYERACTIONS {
        AUSWAHL, ATTACKEN, FLUCHT, WAITING
    };

    public enum TURN {
        PLAYER, ENEMY
    };

    private Pokemon opponent;
    private Pokemon ownPokemon;
    private final Game game;
    private Player player;
    private PLAYERACTIONS state;
    private TURN turn;

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
        if (opponent == null && ownPokemon == null) {
            startWildPkmnFight();
        } else {
            opponent.update();
            ownPokemon.update();
        }

    }

    public void startWildPkmnFight() {
        //set own pokemon
        ownPokemon = player.getPokemonFromTeam(0);
        //figure out the enemy (wild) pokemon
        double rnd = Math.random();
        System.out.println(rnd);
        for (int i = 0; i < game.getLevel().getSpawnrate().size(); i++) {
            if (i == 0) {
                if (rnd <= game.getLevel().getSpawnrate().get(0)) {
                    opponent = PokemonFactory.makePokemon(game.getLevel().getSpawns().get(i), 2);

                }
            } else {
                if (rnd <= game.getLevel().getSpawnrate().get(i) && (rnd > game.getLevel().getSpawnrate().get(i - 1))) {
                    opponent = PokemonFactory.makePokemon(game.getLevel().getSpawns().get(i), 2);
                }
            }
        }

        System.out.println(opponent.toString() + " LvL: " + opponent.getLevel());
        //figuring out whose turn it is
        determineStartTurn();
    }

    public void startTrainerFight(Trainer t1) {
        //own PKMN: 
        ownPokemon = player.getPokemonFromTeam(0);
        //enemy Pokemon:
        opponent = t1.getPokemonFromTeam(0);
        System.out.println(opponent.toString() + " LvL: " + opponent.getLevel());
        determineStartTurn();
    }

    public Pokemon getOpponent() {
        return opponent;
    }

    public Pokemon getOwn() {
        return ownPokemon;
    }

    public void render(Screen screen) {
        screen.renderRectangle(50, 50, 100, 150, 0xFF0000);
        screen.renderBigRectangle(50, 300, 50, 50, 0xFF00FF);
    }

    public void setPlayer(Player pc) {
        this.player = pc;
    }

    private void determineStartTurn() {
        if (ownPokemon.getSpd() > opponent.getSpd()) {
            turn = TURN.PLAYER;
            state = PLAYERACTIONS.AUSWAHL;
            System.out.println("PLAYER STARTS");
        } else {
            turn = TURN.ENEMY;
            state = PLAYERACTIONS.WAITING;
            System.out.println("ENEMY STARTS");
        }

    }

}
