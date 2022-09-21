package com.yagnnoz.realm;

import com.yagnnoz.realm.entity.mob.Player;
import com.yagnnoz.realm.entity.mob.Trainer;
import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.input.Mouse;
import com.yagnnoz.realm.pokemon.mechanics.Enums;
import com.yagnnoz.realm.pokemon.mechanics.Pokemon;
import com.yagnnoz.realm.pokemon.mechanics.PokemonFactory;

import java.awt.*;

/**
 * @author Jens
 */
public class FightHandler {
    private final Screen screen;
    private final Game game;
    private Pokemon opponent;
    private Pokemon ownPokemon;

    private Player player;
    private Enums.PLAYERACTIONS state;
    private Enums.TURN turn;

    Rectangle border, fightButton, pkmnButton, itemButton, fleeButton;

    FightHandler(Game game, Screen fightScreen) {
        this.game = game;
        this.screen = fightScreen;
        init();
    }

    private void init() {
        border = new Rectangle(this.screen.width - 250, this.screen.height - 100, 350, 150);
        fightButton = new Rectangle(this.screen.width - 245, this.screen.height - 95, 170, 70);
        pkmnButton = new Rectangle(this.screen.width - 75, this.screen.height - 95, 170, 70);
        itemButton = new Rectangle(this.screen.width - 245, this.screen.height - 25, 170, 70);
        fleeButton = new Rectangle(this.screen.width - 75, this.screen.height - 25, 170, 70);
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

        if (Mouse.getButton() == 1) {
            if ((Mouse.getX() > fightButton.x) && (Mouse.getX() < fightButton.x + fightButton.width) && (Mouse.getY() > fightButton.y) && (Mouse.getY() < fightButton.y + fightButton.height)) {
                System.out.println("pressed FightButton");
            } else if ((Mouse.getX() > pkmnButton.x) && (Mouse.getX() < pkmnButton.x + pkmnButton.width) && (Mouse.getY() > pkmnButton.y) && (Mouse.getY() < pkmnButton.y + pkmnButton.height)) {
                System.out.println("pressed pkmnButton");
            } else if ((Mouse.getX() > itemButton.x) && (Mouse.getX() < itemButton.x + itemButton.width) && (Mouse.getY() > itemButton.y) && (Mouse.getY() < itemButton.y + itemButton.height)) {
                System.out.println("pressed itemButton");
            } else if ((Mouse.getX() > fleeButton.x) && (Mouse.getX() < fleeButton.x + fleeButton.width) && (Mouse.getY() > fleeButton.y) && (Mouse.getY() < fleeButton.y + fleeButton.height)) {
                System.out.println("pressed fleeButton");
            }
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
        Graphics2D g2d = (Graphics2D) g;
        this.renderButtons(screen, g2d);

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


    /**
     * Renders the Buttons in the bottom left to the screen
     *
     * @param screen - reference to the screen
     * @param g      - Graphics2D object, both passed in from the render() method
     */
    private void renderButtons(Screen screen, Graphics2D g) {
        g.setColor(Color.RED);
        g.draw(border);
        g.setColor(Color.BLACK);
        g.draw(fightButton);
        g.draw(pkmnButton);
        g.draw(itemButton);
        g.draw(fleeButton);

        g.setFont(new Font("Calibri", Font.PLAIN, 25));

        switch (state) {
            case AUSWAHL -> {
                g.drawString("Kampf", fightButton.x + 20, fightButton.y + 40);
                g.drawString("Pokémon", pkmnButton.x + 20, pkmnButton.y + 40);
                g.drawString("Beutel", itemButton.x + 20, itemButton.y + 40);
                g.drawString("Flucht", fleeButton.x + 20, fleeButton.y + 40);
                break;
            }/*
            case ATTACKEN -> {
                g.drawString("Kampf", fightButton.x + 20, fightButton.y + 40);
                g.drawString("Pokémon", pkmnButton.x + 20, pkmnButton.y + 40);
                g.drawString("Beutel", itemButton.x + 20, itemButton.y + 40);
                g.drawString("Flucht", fleeButton.x + 20, fleeButton.y + 40);
            }*/
        }

    }

    private void pressedFightButton(){

    }

    private void pressedItemButton(){

    }

    private void pressedPkmnButton(){

    }

    private void pressedFleeButton(){

    }


}
