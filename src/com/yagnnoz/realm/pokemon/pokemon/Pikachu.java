package com.yagnnoz.realm.pokemon.pokemon;

import com.yagnnoz.realm.pokemon.mechanics.Pokemon;
import com.yagnnoz.realm.graphics.Sprite;
import com.yagnnoz.realm.graphics.SpriteSheet;

import java.util.ArrayList;

/**
 * @author Jens
 */
public final class Pikachu extends Pokemon {

    private final int SPRITE_SIZE_FRONT = 64;
    private final int SPRITE_SIZE_BACK = 65;

    //<editor-fold desc="Sprites">
    public Sprite pikachuFront1, pikachuFront2, pikachuFront3, pikachuFront4,
            pikachuFront5, pikachuFront6, pikachuFront7, pikachuFront8,
            pikachuFront9, pikachuFront10, pikachuFront11, pikachuFront12,
            pikachuFront13, pikachuFront14, pikachuFront15, pikachuFront16,
            pikachuFront17, pikachuFront18, pikachuFront19, pikachuFront20,
            pikachuFront21, pikachuFront22, pikachuFront23, pikachuFront24,
            pikachuFront25, pikachuFront26, pikachuFront27, pikachuFront28,
            pikachuFront29, pikachuFront30, pikachuFront31, pikachuFront32,
            pikachuFront33;

    public Sprite pikachuBack1, pikachuBack2, pikachuBack3, pikachuBack4,
            pikachuBack5, pikachuBack6, pikachuBack7, pikachuBack8,
            pikachuBack9, pikachuBack10, pikachuBack11, pikachuBack12,
            pikachuBack13, pikachuBack14, pikachuBack15, pikachuBack16,
            pikachuBack17, pikachuBack18, pikachuBack19, pikachuBack20,
            pikachuBack21, pikachuBack22, pikachuBack23, pikachuBack24,
            pikachuBack25, pikachuBack26, pikachuBack27, pikachuBack28,
            pikachuBack29, pikachuBack30, pikachuBack31, pikachuBack32,
            pikachuBack33, pikachuBack34, pikachuBack35;
//</editor-fold>

    private SpriteSheet pikachuFront;
    private SpriteSheet pikachuBack;

    public Pikachu(int level) {
        super(level);
        setName("Pikachu");
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
        pikachuFront = new SpriteSheet("/PokemonSprites/PikachuFront.png", 512);
        pikachuBack = new SpriteSheet("/PokemonSprites/PikachuBack.png", 520);


//----------------------------------------------------------------------------------------------------//
//--------------------------------------------- FRONT ------------------------------------------------//
//----------------------------------------------------------------------------------------------------//

        pikachuFront1 = new Sprite(SPRITE_SIZE_FRONT, 0, 0, pikachuFront);
        pikachuFront2 = new Sprite(SPRITE_SIZE_FRONT, 1, 0, pikachuFront);
        pikachuFront3 = new Sprite(SPRITE_SIZE_FRONT, 2, 0, pikachuFront);
        pikachuFront4 = new Sprite(SPRITE_SIZE_FRONT, 3, 0, pikachuFront);
        pikachuFront5 = new Sprite(SPRITE_SIZE_FRONT, 4, 0, pikachuFront);
        pikachuFront6 = new Sprite(SPRITE_SIZE_FRONT, 5, 0, pikachuFront);
        pikachuFront7 = new Sprite(SPRITE_SIZE_FRONT, 6, 0, pikachuFront);
        pikachuFront8 = new Sprite(SPRITE_SIZE_FRONT, 7, 0, pikachuFront);
        pikachuFront9 = new Sprite(SPRITE_SIZE_FRONT, 0, 1, pikachuFront);
        pikachuFront10 = new Sprite(SPRITE_SIZE_FRONT, 1, 1, pikachuFront);
        pikachuFront11 = new Sprite(SPRITE_SIZE_FRONT, 2, 1, pikachuFront);
        pikachuFront12 = new Sprite(SPRITE_SIZE_FRONT, 3, 1, pikachuFront);
        pikachuFront13 = new Sprite(SPRITE_SIZE_FRONT, 4, 1, pikachuFront);
        pikachuFront14 = new Sprite(SPRITE_SIZE_FRONT, 5, 1, pikachuFront);
        pikachuFront15 = new Sprite(SPRITE_SIZE_FRONT, 6, 1, pikachuFront);
        pikachuFront16 = new Sprite(SPRITE_SIZE_FRONT, 7, 1, pikachuFront);
        pikachuFront17 = new Sprite(SPRITE_SIZE_FRONT, 0, 2, pikachuFront);
        pikachuFront18 = new Sprite(SPRITE_SIZE_FRONT, 1, 2, pikachuFront);
        pikachuFront19 = new Sprite(SPRITE_SIZE_FRONT, 2, 2, pikachuFront);
        pikachuFront20 = new Sprite(SPRITE_SIZE_FRONT, 3, 2, pikachuFront);
        pikachuFront21 = new Sprite(SPRITE_SIZE_FRONT, 4, 2, pikachuFront);
        pikachuFront22 = new Sprite(SPRITE_SIZE_FRONT, 5, 2, pikachuFront);
        pikachuFront23 = new Sprite(SPRITE_SIZE_FRONT, 6, 2, pikachuFront);
        pikachuFront24 = new Sprite(SPRITE_SIZE_FRONT, 7, 2, pikachuFront);
        pikachuFront25 = new Sprite(SPRITE_SIZE_FRONT, 0, 3, pikachuFront);
        pikachuFront26 = new Sprite(SPRITE_SIZE_FRONT, 1, 3, pikachuFront);
        pikachuFront27 = new Sprite(SPRITE_SIZE_FRONT, 2, 3, pikachuFront);
        pikachuFront28 = new Sprite(SPRITE_SIZE_FRONT, 3, 3, pikachuFront);
        pikachuFront29 = new Sprite(SPRITE_SIZE_FRONT, 4, 3, pikachuFront);
        pikachuFront30 = new Sprite(SPRITE_SIZE_FRONT, 5, 3, pikachuFront);
        pikachuFront31 = new Sprite(SPRITE_SIZE_FRONT, 6, 3, pikachuFront);
        pikachuFront32 = new Sprite(SPRITE_SIZE_FRONT, 7, 3, pikachuFront);
        pikachuFront33 = new Sprite(SPRITE_SIZE_FRONT, 0, 4, pikachuFront);
//----------------------------------------------------------------------------------------------------//
//--------------------------------------------- BACK -------------------------------------------------//
//----------------------------------------------------------------------------------------------------//

        pikachuBack1 = new Sprite(SPRITE_SIZE_BACK, 0, 0, pikachuBack);
        pikachuBack2 = new Sprite(SPRITE_SIZE_BACK, 1, 0, pikachuBack);
        pikachuBack3 = new Sprite(SPRITE_SIZE_BACK, 2, 0, pikachuBack);
        pikachuBack4 = new Sprite(SPRITE_SIZE_BACK, 3, 0, pikachuBack);
        pikachuBack5 = new Sprite(SPRITE_SIZE_BACK, 4, 0, pikachuBack);
        pikachuBack6 = new Sprite(SPRITE_SIZE_BACK, 5, 0, pikachuBack);
        pikachuBack7 = new Sprite(SPRITE_SIZE_BACK, 6, 0, pikachuBack);
        pikachuBack8 = new Sprite(SPRITE_SIZE_BACK, 7, 0, pikachuBack);
        pikachuBack9 = new Sprite(SPRITE_SIZE_BACK, 0, 1, pikachuBack);
        pikachuBack10 = new Sprite(SPRITE_SIZE_BACK, 1, 1, pikachuBack);
        pikachuBack11 = new Sprite(SPRITE_SIZE_BACK, 2, 1, pikachuBack);
        pikachuBack12 = new Sprite(SPRITE_SIZE_BACK, 3, 1, pikachuBack);
        pikachuBack13 = new Sprite(SPRITE_SIZE_BACK, 4, 1, pikachuBack);
        pikachuBack14 = new Sprite(SPRITE_SIZE_BACK, 5, 1, pikachuBack);
        pikachuBack15 = new Sprite(SPRITE_SIZE_BACK, 6, 1, pikachuBack);
        pikachuBack16 = new Sprite(SPRITE_SIZE_BACK, 7, 1, pikachuBack);
        pikachuBack17 = new Sprite(SPRITE_SIZE_BACK, 0, 2, pikachuBack);
        pikachuBack18 = new Sprite(SPRITE_SIZE_BACK, 1, 2, pikachuBack);
        pikachuBack19 = new Sprite(SPRITE_SIZE_BACK, 2, 2, pikachuBack);
        pikachuBack20 = new Sprite(SPRITE_SIZE_BACK, 3, 2, pikachuBack);
        pikachuBack21 = new Sprite(SPRITE_SIZE_BACK, 4, 2, pikachuBack);
        pikachuBack22 = new Sprite(SPRITE_SIZE_BACK, 5, 2, pikachuBack);
        pikachuBack23 = new Sprite(SPRITE_SIZE_BACK, 6, 2, pikachuBack);
        pikachuBack24 = new Sprite(SPRITE_SIZE_BACK, 7, 2, pikachuBack);
        pikachuBack25 = new Sprite(SPRITE_SIZE_BACK, 0, 3, pikachuBack);
        pikachuBack26 = new Sprite(SPRITE_SIZE_BACK, 1, 3, pikachuBack);
        pikachuBack27 = new Sprite(SPRITE_SIZE_BACK, 2, 3, pikachuBack);
        pikachuBack28 = new Sprite(SPRITE_SIZE_BACK, 3, 3, pikachuBack);
        pikachuBack29 = new Sprite(SPRITE_SIZE_BACK, 4, 3, pikachuBack);
        pikachuBack30 = new Sprite(SPRITE_SIZE_BACK, 5, 3, pikachuBack);
        pikachuBack31 = new Sprite(SPRITE_SIZE_BACK, 6, 3, pikachuBack);
        pikachuBack32 = new Sprite(SPRITE_SIZE_BACK, 7, 3, pikachuBack);
        pikachuBack33 = new Sprite(SPRITE_SIZE_BACK, 0, 4, pikachuBack);
        pikachuBack34 = new Sprite(SPRITE_SIZE_BACK, 1, 4, pikachuBack);
        pikachuBack35 = new Sprite(SPRITE_SIZE_BACK, 2, 4, pikachuBack);

    }

    @Override
    protected void setFrontsprites() {
        frontSprites.add(pikachuFront1);
        frontSprites.add(pikachuFront2);
        frontSprites.add(pikachuFront3);
        frontSprites.add(pikachuFront4);
        frontSprites.add(pikachuFront5);
        frontSprites.add(pikachuFront6);
        frontSprites.add(pikachuFront7);
        frontSprites.add(pikachuFront8);
        frontSprites.add(pikachuFront9);
        frontSprites.add(pikachuFront10);
        frontSprites.add(pikachuFront11);
        frontSprites.add(pikachuFront12);
        frontSprites.add(pikachuFront13);
        frontSprites.add(pikachuFront14);
        frontSprites.add(pikachuFront15);
        frontSprites.add(pikachuFront16);
        frontSprites.add(pikachuFront17);
        frontSprites.add(pikachuFront18);
        frontSprites.add(pikachuFront19);
        frontSprites.add(pikachuFront20);
        frontSprites.add(pikachuFront21);
        frontSprites.add(pikachuFront22);
        frontSprites.add(pikachuFront23);
        frontSprites.add(pikachuFront24);
        frontSprites.add(pikachuFront25);
        frontSprites.add(pikachuFront26);
        frontSprites.add(pikachuFront27);
        frontSprites.add(pikachuFront28);
        frontSprites.add(pikachuFront29);
        frontSprites.add(pikachuFront30);
        frontSprites.add(pikachuFront31);
        frontSprites.add(pikachuFront32);
        frontSprites.add(pikachuFront33);
    }

    @Override
    protected void setBacksprites() {
        backSprites.add(pikachuBack1);
        backSprites.add(pikachuBack2);
        backSprites.add(pikachuBack3);
        backSprites.add(pikachuBack4);
        backSprites.add(pikachuBack5);
        backSprites.add(pikachuBack6);
        backSprites.add(pikachuBack7);
        backSprites.add(pikachuBack8);
        backSprites.add(pikachuBack9);
        backSprites.add(pikachuBack10);
        backSprites.add(pikachuBack11);
        backSprites.add(pikachuBack12);
        backSprites.add(pikachuBack13);
        backSprites.add(pikachuBack14);
        backSprites.add(pikachuBack15);
        backSprites.add(pikachuBack16);
        backSprites.add(pikachuBack17);
        backSprites.add(pikachuBack18);
        backSprites.add(pikachuBack19);
        backSprites.add(pikachuBack20);
        backSprites.add(pikachuBack21);
        backSprites.add(pikachuBack22);
        backSprites.add(pikachuBack23);
        backSprites.add(pikachuBack24);
        backSprites.add(pikachuBack25);
        backSprites.add(pikachuBack26);
        backSprites.add(pikachuBack27);
        backSprites.add(pikachuBack28);
        backSprites.add(pikachuBack29);
        backSprites.add(pikachuBack30);
        backSprites.add(pikachuBack31);
        backSprites.add(pikachuBack32);
        backSprites.add(pikachuBack33);
        backSprites.add(pikachuBack34);
        backSprites.add(pikachuBack35);
    }

    @Override
    protected void populateAttackList() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void setBaseStats() {
        baseStats[0] = 35; //HP
        baseStats[1] = 55; //ATK
        baseStats[2] = 40; //DEF
        baseStats[3] = 50; //SpATK
        baseStats[4] = 50; //SpDEF
        baseStats[5] = 90; //SPD
    }
}
