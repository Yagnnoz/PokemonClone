package com.yagnnoz.realm;

import com.yagnnoz.realm.entity.mob.Player;
import com.yagnnoz.realm.entity.mob.Trainer;
import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.pokemon.mechanics.Enums;
import com.yagnnoz.realm.pokemon.mechanics.Pokemon;
import com.yagnnoz.realm.pokemon.mechanics.PokemonFactory;

import java.awt.*;

/**
 *
 * @author Jens
 */
public class FightHandler {

    private Pokemon opponent;
    private Pokemon ownPokemon;
    private final Game game;
    private Player player;
    private Enums.PLAYERACTIONS state;
    private Enums.TURN turn;

    private final Rectangle fightButton = new Rectangle((Game.width * Game.scale) / 2 - 50, 200, 100, 50);
    private final Rectangle itemButton = new Rectangle((Game.width * Game.scale) / 2 - 50, 300, 100, 50);
    private final Rectangle fleeButton = new Rectangle((Game.width * Game.scale) / 2 - 50, 400, 100, 50);
    private final Rectangle pkmnButton = new Rectangle((Game.width * Game.scale) / 2 - 50, 400, 100, 50);

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

    public void render(Screen screen, Graphics g) {
        Rectangle border = new Rectangle(screen.width-250, screen.height-100, 350,150);
        Rectangle fightButton = new Rectangle(screen.width-253, screen.height-103, );


      //  screen.renderBigRectangle(screen.width-353, screen.height-153, 350, 150, 0xFF0000);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.draw(border);
       // screen.renderRectangle(screen.width-345, screen.height-150, 80, 40, 0x000000);
    }

    public void setPlayer(Player pc) {
        this.player = pc;
    }

    private void determineStartTurn() {
        if (ownPokemon.getSpd() > opponent.getSpd()) {
            turn = Enums.TURN.PLAYER;
            state = Enums.PLAYERACTIONS.AUSWAHL;
            System.out.println("PLAYER STARTS");
        } else {
            turn = Enums.TURN.ENEMY;
            state = Enums.PLAYERACTIONS.WAITING;
            System.out.println("ENEMY STARTS");
        }

    }

}
