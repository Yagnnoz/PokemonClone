package com.yagnnoz.realm.pokemon.pokemon;

import com.yagnnoz.realm.pokemon.attacken.Mechanics.AttackenEntry;
import com.yagnnoz.realm.pokemon.mechanics.Pokemon;
import com.yagnnoz.realm.graphics.Sprite;
import com.yagnnoz.realm.graphics.SpriteSheet;

import java.util.ArrayList;

/**
 * @author Jens
 */
public class Rattfratz extends Pokemon {

    private final int SPRITE_SIZE_FRONT = 64;
    private final int SPRITE_SIZE_BACK = 64;

    //<editor-fold desc="Sprites">
    public Sprite rattfratzFront1, rattfratzFront2, rattfratzFront3, rattfratzFront4,
            rattfratzFront5, rattfratzFront6, rattfratzFront7, rattfratzFront8,
            rattfratzFront9, rattfratzFront10, rattfratzFront11, rattfratzFront12,
            rattfratzFront13, rattfratzFront14, rattfratzFront15, rattfratzFront16,
            rattfratzFront17, rattfratzFront18, rattfratzFront19, rattfratzFront20,
            rattfratzFront21, rattfratzFront22, rattfratzFront23, rattfratzFront24,
            rattfratzFront25;


    public Sprite rattfratzBack1, rattfratzBack2, rattfratzBack3, rattfratzBack4,
            rattfratzBack5, rattfratzBack6, rattfratzBack7, rattfratzBack8,
            rattfratzBack9, rattfratzBack10, rattfratzBack11, rattfratzBack12,
            rattfratzBack13, rattfratzBack14, rattfratzBack15, rattfratzBack16,
            rattfratzBack17, rattfratzBack18, rattfratzBack19, rattfratzBack20,
            rattfratzBack21, rattfratzBack22, rattfratzBack23, rattfratzBack24,
            rattfratzBack25;
//</editor-fold>

    private SpriteSheet rattfratzFront;
    private SpriteSheet rattfratzBack;

    public Rattfratz(int level) {
        super(level);
        setName("Rattfratz");
        frontSprites = new ArrayList<>();
        backSprites = new ArrayList<>();

        setSprites();

        NUMBER_FRAMES_FRONT_ANIM = frontSprites.size();
        NUMBER_FRAMES_BACK_ANIM = backSprites.size();

        populateAttackList();
        setAttacks(level);
    }

    @Override
    protected void initSprites() {
        rattfratzFront = new SpriteSheet("/PokemonSprites/RattfratzFront.png", 512);
        rattfratzBack = new SpriteSheet("/PokemonSprites/RattfratzBack.png", 512);


//----------------------------------------------------------------------------------------------------//
//--------------------------------------------- FRONT ------------------------------------------------//
//----------------------------------------------------------------------------------------------------//

        rattfratzFront1 = new Sprite(SPRITE_SIZE_FRONT, 0, 0, rattfratzFront);
        rattfratzFront2 = new Sprite(SPRITE_SIZE_FRONT, 1, 0, rattfratzFront);
        rattfratzFront3 = new Sprite(SPRITE_SIZE_FRONT, 2, 0, rattfratzFront);
        rattfratzFront4 = new Sprite(SPRITE_SIZE_FRONT, 3, 0, rattfratzFront);
        rattfratzFront5 = new Sprite(SPRITE_SIZE_FRONT, 4, 0, rattfratzFront);
        rattfratzFront6 = new Sprite(SPRITE_SIZE_FRONT, 5, 0, rattfratzFront);
        rattfratzFront7 = new Sprite(SPRITE_SIZE_FRONT, 6, 0, rattfratzFront);
        rattfratzFront8 = new Sprite(SPRITE_SIZE_FRONT, 7, 0, rattfratzFront);
        rattfratzFront9 = new Sprite(SPRITE_SIZE_FRONT, 0, 1, rattfratzFront);
        rattfratzFront10 = new Sprite(SPRITE_SIZE_FRONT, 1, 1, rattfratzFront);
        rattfratzFront11 = new Sprite(SPRITE_SIZE_FRONT, 2, 1, rattfratzFront);
        rattfratzFront12 = new Sprite(SPRITE_SIZE_FRONT, 3, 1, rattfratzFront);
        rattfratzFront13 = new Sprite(SPRITE_SIZE_FRONT, 4, 1, rattfratzFront);
        rattfratzFront14 = new Sprite(SPRITE_SIZE_FRONT, 5, 1, rattfratzFront);
        rattfratzFront15 = new Sprite(SPRITE_SIZE_FRONT, 6, 1, rattfratzFront);
        rattfratzFront16 = new Sprite(SPRITE_SIZE_FRONT, 7, 1, rattfratzFront);
        rattfratzFront17 = new Sprite(SPRITE_SIZE_FRONT, 0, 2, rattfratzFront);
        rattfratzFront18 = new Sprite(SPRITE_SIZE_FRONT, 1, 2, rattfratzFront);
        rattfratzFront19 = new Sprite(SPRITE_SIZE_FRONT, 2, 2, rattfratzFront);
        rattfratzFront20 = new Sprite(SPRITE_SIZE_FRONT, 3, 2, rattfratzFront);
        rattfratzFront21 = new Sprite(SPRITE_SIZE_FRONT, 4, 2, rattfratzFront);
        rattfratzFront22 = new Sprite(SPRITE_SIZE_FRONT, 5, 2, rattfratzFront);
        rattfratzFront23 = new Sprite(SPRITE_SIZE_FRONT, 6, 2, rattfratzFront);
        rattfratzFront24 = new Sprite(SPRITE_SIZE_FRONT, 7, 2, rattfratzFront);
        rattfratzFront25 = new Sprite(SPRITE_SIZE_FRONT, 0, 3, rattfratzFront);

//----------------------------------------------------------------------------------------------------//
//--------------------------------------------- BACK -------------------------------------------------//
//----------------------------------------------------------------------------------------------------//

        rattfratzBack1 = new Sprite(SPRITE_SIZE_BACK, 0, 0, rattfratzBack);
        rattfratzBack2 = new Sprite(SPRITE_SIZE_BACK, 1, 0, rattfratzBack);
        rattfratzBack3 = new Sprite(SPRITE_SIZE_BACK, 2, 0, rattfratzBack);
        rattfratzBack4 = new Sprite(SPRITE_SIZE_BACK, 3, 0, rattfratzBack);
        rattfratzBack5 = new Sprite(SPRITE_SIZE_BACK, 4, 0, rattfratzBack);
        rattfratzBack6 = new Sprite(SPRITE_SIZE_BACK, 5, 0, rattfratzBack);
        rattfratzBack7 = new Sprite(SPRITE_SIZE_BACK, 6, 0, rattfratzBack);
        rattfratzBack8 = new Sprite(SPRITE_SIZE_BACK, 7, 0, rattfratzBack);
        rattfratzBack9 = new Sprite(SPRITE_SIZE_BACK, 0, 1, rattfratzBack);
        rattfratzBack10 = new Sprite(SPRITE_SIZE_BACK, 1, 1, rattfratzBack);
        rattfratzBack11 = new Sprite(SPRITE_SIZE_BACK, 2, 1, rattfratzBack);
        rattfratzBack12 = new Sprite(SPRITE_SIZE_BACK, 3, 1, rattfratzBack);
        rattfratzBack13 = new Sprite(SPRITE_SIZE_BACK, 4, 1, rattfratzBack);
        rattfratzBack14 = new Sprite(SPRITE_SIZE_BACK, 5, 1, rattfratzBack);
        rattfratzBack15 = new Sprite(SPRITE_SIZE_BACK, 6, 1, rattfratzBack);
        rattfratzBack16 = new Sprite(SPRITE_SIZE_BACK, 7, 1, rattfratzBack);
        rattfratzBack17 = new Sprite(SPRITE_SIZE_BACK, 0, 2, rattfratzBack);
        rattfratzBack18 = new Sprite(SPRITE_SIZE_BACK, 1, 2, rattfratzBack);
        rattfratzBack19 = new Sprite(SPRITE_SIZE_BACK, 2, 2, rattfratzBack);
        rattfratzBack20 = new Sprite(SPRITE_SIZE_BACK, 3, 2, rattfratzBack);
        rattfratzBack21 = new Sprite(SPRITE_SIZE_BACK, 4, 2, rattfratzBack);
        rattfratzBack22 = new Sprite(SPRITE_SIZE_BACK, 5, 2, rattfratzBack);
        rattfratzBack23 = new Sprite(SPRITE_SIZE_BACK, 6, 2, rattfratzBack);
        rattfratzBack24 = new Sprite(SPRITE_SIZE_BACK, 7, 2, rattfratzBack);
        rattfratzBack25 = new Sprite(SPRITE_SIZE_BACK, 0, 3, rattfratzBack);
    }

    @Override
    protected void setFrontsprites() {
        frontSprites.add(rattfratzFront1);
        frontSprites.add(rattfratzFront2);
        frontSprites.add(rattfratzFront3);
        frontSprites.add(rattfratzFront4);
        frontSprites.add(rattfratzFront5);
        frontSprites.add(rattfratzFront6);
        frontSprites.add(rattfratzFront7);
        frontSprites.add(rattfratzFront8);
        frontSprites.add(rattfratzFront9);
        frontSprites.add(rattfratzFront10);
        frontSprites.add(rattfratzFront11);
        frontSprites.add(rattfratzFront12);
        frontSprites.add(rattfratzFront13);
        frontSprites.add(rattfratzFront14);
        frontSprites.add(rattfratzFront15);
        frontSprites.add(rattfratzFront16);
        frontSprites.add(rattfratzFront17);
        frontSprites.add(rattfratzFront18);
        frontSprites.add(rattfratzFront19);
        frontSprites.add(rattfratzFront20);
        frontSprites.add(rattfratzFront21);
        frontSprites.add(rattfratzFront22);
        frontSprites.add(rattfratzFront23);
        frontSprites.add(rattfratzFront24);
    }

    @Override
    protected void setBacksprites() {
        backSprites.add(rattfratzBack1);
        backSprites.add(rattfratzBack2);
        backSprites.add(rattfratzBack3);
        backSprites.add(rattfratzBack4);
        backSprites.add(rattfratzBack5);
        backSprites.add(rattfratzBack6);
        backSprites.add(rattfratzBack7);
        backSprites.add(rattfratzBack8);
        backSprites.add(rattfratzBack9);
        backSprites.add(rattfratzBack10);
        backSprites.add(rattfratzBack11);
        backSprites.add(rattfratzBack12);
        backSprites.add(rattfratzBack13);
        backSprites.add(rattfratzBack14);
        backSprites.add(rattfratzBack15);
        backSprites.add(rattfratzBack16);
        backSprites.add(rattfratzBack17);
        backSprites.add(rattfratzBack18);
        backSprites.add(rattfratzBack19);
        backSprites.add(rattfratzBack20);
        backSprites.add(rattfratzBack21);
        backSprites.add(rattfratzBack22);
        backSprites.add(rattfratzBack23);
        backSprites.add(rattfratzBack24);
    }


    @Override
    protected void populateAttackList() {
        AtkPerLvl.add(new AttackenEntry("Tackle", 2));
        AtkPerLvl.add(new AttackenEntry("Rutenschlag", 2));
        AtkPerLvl.add(new AttackenEntry("Hyperzahn", 10));
    }

    @Override
    protected void setBaseStats() {
        baseStats[0] = 30; //HP
        baseStats[1] = 56; //ATK
        baseStats[2] = 35; //DEF
        baseStats[3] = 25; //SpATK
        baseStats[4] = 35; //SpDEF
        baseStats[5] = 72; //SPD
    }
}

