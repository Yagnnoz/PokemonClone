package com.yagnnoz.realm;

import com.yagnnoz.realm.entity.mob.Player;
import com.yagnnoz.realm.entity.mob.Trainer;
import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.pokemon.Pokemon;
import com.yagnnoz.realm.pokemon.PokemonFactory;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author Jens
 */
public class FightHandler {

    private Pokemon opponent;
    private Pokemon ownPokemon;
    private final Game game;
    private Player player;
    private final Rectangle Kampf = new Rectangle((Game.width * Game.scale) - 150, 300, 100, 50);

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
            startFight();
        } else {
            opponent.update();
            ownPokemon.update();
        }

    }

    public void startFight() {
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
    }
    
    public void startTrainerFight(Trainer t1){
        //own PKMN: 
        ownPokemon = player.getPokemonFromTeam(0);
        //enemy Pokemon:
        opponent = t1.getPokemonFromTeam(0);
        System.out.println(opponent.toString() + " LvL: " + opponent.getLevel());
    }

    public Pokemon getOpponent() {
        return opponent;
    }

    public Pokemon getOwn() {
        return ownPokemon;
    }
    
    public void render(Screen screen, Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.draw(Kampf);
    }
    
    public void setPlayer(Player pc){
        this.player = pc;
    }
}
