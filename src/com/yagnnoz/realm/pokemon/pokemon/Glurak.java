package com.yagnnoz.realm.pokemon.pokemon;

import com.yagnnoz.realm.graphics.Sprite;
import com.yagnnoz.realm.graphics.SpriteSheet;
import com.yagnnoz.realm.pokemon.mechanics.Pokemon;
import java.util.ArrayList;

/**
 *
 * @author Jens
 */
public final class Glurak extends Pokemon {

    private final int SPRITE_SIZE_FRONT = 140;
    private final int SPRITE_SIZE_BACK = 172;

//<editor-fold desc="Sprites">
    public Sprite glurakFront1, glurakFront2, glurakFront3, glurakFront4,
            glurakFront5, glurakFront6, glurakFront7, glurakFront8,
            glurakFront9, glurakFront10, glurakFront11, glurakFront12,
            glurakFront13, glurakFront14, glurakFront15, glurakFront16,
            glurakFront17, glurakFront18, glurakFront19, glurakFront20,
            glurakFront21, glurakFront22, glurakFront23, glurakFront24,
            glurakFront25, glurakFront26, glurakFront27, glurakFront28,
            glurakFront29, glurakFront30, glurakFront31, glurakFront32,
            glurakFront33, glurakFront34, glurakFront35, glurakFront36,
            glurakFront37, glurakFront38, glurakFront39, glurakFront40,
            glurakFront41, glurakFront42, glurakFront43, glurakFront44,
            glurakFront45, glurakFront46, glurakFront47;

    public Sprite glurakBack1, glurakBack2, glurakBack3, glurakBack4,
            glurakBack5, glurakBack6, glurakBack7, glurakBack8,
            glurakBack9, glurakBack10, glurakBack11, glurakBack12,
            glurakBack13, glurakBack14, glurakBack15, glurakBack16,
            glurakBack17, glurakBack18, glurakBack19, glurakBack20,
            glurakBack21, glurakBack22, glurakBack23, glurakBack24,
            glurakBack25, glurakBack26, glurakBack27, glurakBack28,
            glurakBack29, glurakBack30, glurakBack31, glurakBack32,
            glurakBack33, glurakBack34, glurakBack35, glurakBack36,
            glurakBack37, glurakBack38, glurakBack39, glurakBack40,
            glurakBack41, glurakBack42, glurakBack43, glurakBack44,
            glurakBack45, glurakBack46, glurakBack47, glurakBack48,
            glurakBack49, glurakBack50, glurakBack51;
//</editor-fold>

    private SpriteSheet glurakFront;
    private SpriteSheet glurakBack;

    public Glurak(int level) {
        super(level);
        setName("Glurak");
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
        glurakFront = new SpriteSheet("/PokemonSprites/GlurakFront.png", 980);
        glurakBack = new SpriteSheet("/PokemonSprites/GlurakBack.png", 1376);

//----------------------------------------------------------------------------------------------------//
//--------------------------------------------- FRONT ------------------------------------------------//
//----------------------------------------------------------------------------------------------------//
        glurakFront1 = new Sprite(SPRITE_SIZE_FRONT, 0, 0, glurakFront);
        glurakFront2 = new Sprite(SPRITE_SIZE_FRONT, 1, 0, glurakFront);
        glurakFront3 = new Sprite(SPRITE_SIZE_FRONT, 2, 0, glurakFront);
        glurakFront4 = new Sprite(SPRITE_SIZE_FRONT, 3, 0, glurakFront);
        glurakFront5 = new Sprite(SPRITE_SIZE_FRONT, 4, 0, glurakFront);
        glurakFront6 = new Sprite(SPRITE_SIZE_FRONT, 5, 0, glurakFront);
        glurakFront7 = new Sprite(SPRITE_SIZE_FRONT, 6, 0, glurakFront);
        glurakFront8 = new Sprite(SPRITE_SIZE_FRONT, 0, 1, glurakFront);
        glurakFront9 = new Sprite(SPRITE_SIZE_FRONT, 1, 1, glurakFront);
        glurakFront10 = new Sprite(SPRITE_SIZE_FRONT, 2, 1, glurakFront);
        glurakFront11 = new Sprite(SPRITE_SIZE_FRONT, 3, 1, glurakFront);
        glurakFront12 = new Sprite(SPRITE_SIZE_FRONT, 4, 1, glurakFront);
        glurakFront13 = new Sprite(SPRITE_SIZE_FRONT, 5, 1, glurakFront);
        glurakFront14 = new Sprite(SPRITE_SIZE_FRONT, 6, 1, glurakFront);
        glurakFront15 = new Sprite(SPRITE_SIZE_FRONT, 0, 2, glurakFront);
        glurakFront16 = new Sprite(SPRITE_SIZE_FRONT, 1, 2, glurakFront);
        glurakFront17 = new Sprite(SPRITE_SIZE_FRONT, 2, 2, glurakFront);
        glurakFront18 = new Sprite(SPRITE_SIZE_FRONT, 3, 2, glurakFront);
        glurakFront19 = new Sprite(SPRITE_SIZE_FRONT, 4, 2, glurakFront);
        glurakFront20 = new Sprite(SPRITE_SIZE_FRONT, 5, 2, glurakFront);
        glurakFront21 = new Sprite(SPRITE_SIZE_FRONT, 6, 2, glurakFront);
        glurakFront22 = new Sprite(SPRITE_SIZE_FRONT, 0, 3, glurakFront);
        glurakFront23 = new Sprite(SPRITE_SIZE_FRONT, 1, 3, glurakFront);
        glurakFront24 = new Sprite(SPRITE_SIZE_FRONT, 2, 3, glurakFront);
        glurakFront25 = new Sprite(SPRITE_SIZE_FRONT, 3, 3, glurakFront);
        glurakFront26 = new Sprite(SPRITE_SIZE_FRONT, 4, 3, glurakFront);
        glurakFront27 = new Sprite(SPRITE_SIZE_FRONT, 5, 3, glurakFront);
        glurakFront28 = new Sprite(SPRITE_SIZE_FRONT, 6, 3, glurakFront);
        glurakFront29 = new Sprite(SPRITE_SIZE_FRONT, 0, 4, glurakFront);
        glurakFront30 = new Sprite(SPRITE_SIZE_FRONT, 1, 4, glurakFront);
        glurakFront31 = new Sprite(SPRITE_SIZE_FRONT, 2, 4, glurakFront);
        glurakFront32 = new Sprite(SPRITE_SIZE_FRONT, 3, 4, glurakFront);
        glurakFront33 = new Sprite(SPRITE_SIZE_FRONT, 4, 4, glurakFront);
        glurakFront34 = new Sprite(SPRITE_SIZE_FRONT, 5, 4, glurakFront);
        glurakFront35 = new Sprite(SPRITE_SIZE_FRONT, 6, 4, glurakFront);
        glurakFront36 = new Sprite(SPRITE_SIZE_FRONT, 0, 5, glurakFront);
        glurakFront37 = new Sprite(SPRITE_SIZE_FRONT, 1, 5, glurakFront);
        glurakFront38 = new Sprite(SPRITE_SIZE_FRONT, 2, 5, glurakFront);
        glurakFront39 = new Sprite(SPRITE_SIZE_FRONT, 3, 5, glurakFront);
        glurakFront40 = new Sprite(SPRITE_SIZE_FRONT, 4, 5, glurakFront);
        glurakFront41 = new Sprite(SPRITE_SIZE_FRONT, 5, 5, glurakFront);
        glurakFront42 = new Sprite(SPRITE_SIZE_FRONT, 6, 5, glurakFront);
        glurakFront43 = new Sprite(SPRITE_SIZE_FRONT, 0, 6, glurakFront);
        glurakFront44 = new Sprite(SPRITE_SIZE_FRONT, 1, 6, glurakFront);
        glurakFront45 = new Sprite(SPRITE_SIZE_FRONT, 2, 6, glurakFront);
        glurakFront46 = new Sprite(SPRITE_SIZE_FRONT, 3, 6, glurakFront);
        glurakFront47 = new Sprite(SPRITE_SIZE_FRONT, 4, 6, glurakFront);

//----------------------------------------------------------------------------------------------------//
//--------------------------------------------- BACK -------------------------------------------------//
//----------------------------------------------------------------------------------------------------//
        glurakBack1 = new Sprite(SPRITE_SIZE_BACK, 0, 0, glurakBack);
        glurakBack2 = new Sprite(SPRITE_SIZE_BACK, 1, 0, glurakBack);
        glurakBack3 = new Sprite(SPRITE_SIZE_BACK, 2, 0, glurakBack);
        glurakBack4 = new Sprite(SPRITE_SIZE_BACK, 3, 0, glurakBack);
        glurakBack5 = new Sprite(SPRITE_SIZE_BACK, 4, 0, glurakBack);
        glurakBack6 = new Sprite(SPRITE_SIZE_BACK, 5, 0, glurakBack);
        glurakBack7 = new Sprite(SPRITE_SIZE_BACK, 6, 0, glurakBack);
        glurakBack8 = new Sprite(SPRITE_SIZE_BACK, 7, 0, glurakBack);
        glurakBack9 = new Sprite(SPRITE_SIZE_BACK, 0, 1, glurakBack);
        glurakBack10 = new Sprite(SPRITE_SIZE_BACK, 1, 1, glurakBack);
        glurakBack11 = new Sprite(SPRITE_SIZE_BACK, 2, 1, glurakBack);
        glurakBack12 = new Sprite(SPRITE_SIZE_BACK, 3, 1, glurakBack);
        glurakBack13 = new Sprite(SPRITE_SIZE_BACK, 4, 1, glurakBack);
        glurakBack14 = new Sprite(SPRITE_SIZE_BACK, 5, 1, glurakBack);
        glurakBack15 = new Sprite(SPRITE_SIZE_BACK, 6, 1, glurakBack);
        glurakBack16 = new Sprite(SPRITE_SIZE_BACK, 7, 1, glurakBack);
        glurakBack17 = new Sprite(SPRITE_SIZE_BACK, 0, 2, glurakBack);
        glurakBack18 = new Sprite(SPRITE_SIZE_BACK, 1, 2, glurakBack);
        glurakBack19 = new Sprite(SPRITE_SIZE_BACK, 2, 2, glurakBack);
        glurakBack20 = new Sprite(SPRITE_SIZE_BACK, 3, 2, glurakBack);
        glurakBack21 = new Sprite(SPRITE_SIZE_BACK, 4, 2, glurakBack);
        glurakBack22 = new Sprite(SPRITE_SIZE_BACK, 5, 2, glurakBack);
        glurakBack23 = new Sprite(SPRITE_SIZE_BACK, 6, 2, glurakBack);
        glurakBack24 = new Sprite(SPRITE_SIZE_BACK, 7, 2, glurakBack);
        glurakBack25 = new Sprite(SPRITE_SIZE_BACK, 0, 3, glurakBack);
        glurakBack26 = new Sprite(SPRITE_SIZE_BACK, 1, 3, glurakBack);
        glurakBack27 = new Sprite(SPRITE_SIZE_BACK, 2, 3, glurakBack);
        glurakBack28 = new Sprite(SPRITE_SIZE_BACK, 3, 3, glurakBack);
        glurakBack29 = new Sprite(SPRITE_SIZE_BACK, 4, 3, glurakBack);
        glurakBack30 = new Sprite(SPRITE_SIZE_BACK, 5, 3, glurakBack);
        glurakBack31 = new Sprite(SPRITE_SIZE_BACK, 6, 3, glurakBack);
        glurakBack32 = new Sprite(SPRITE_SIZE_BACK, 7, 3, glurakBack);
        glurakBack33 = new Sprite(SPRITE_SIZE_BACK, 0, 4, glurakBack);
        glurakBack34 = new Sprite(SPRITE_SIZE_BACK, 1, 4, glurakBack);
        glurakBack35 = new Sprite(SPRITE_SIZE_BACK, 2, 4, glurakBack);
        glurakBack36 = new Sprite(SPRITE_SIZE_BACK, 3, 4, glurakBack);
        glurakBack37 = new Sprite(SPRITE_SIZE_BACK, 4, 4, glurakBack);
        glurakBack38 = new Sprite(SPRITE_SIZE_BACK, 5, 4, glurakBack);
        glurakBack39 = new Sprite(SPRITE_SIZE_BACK, 6, 4, glurakBack);
        glurakBack40 = new Sprite(SPRITE_SIZE_BACK, 7, 4, glurakBack);
        glurakBack41 = new Sprite(SPRITE_SIZE_BACK, 0, 5, glurakBack);
        glurakBack42 = new Sprite(SPRITE_SIZE_BACK, 1, 5, glurakBack);
        glurakBack43 = new Sprite(SPRITE_SIZE_BACK, 2, 5, glurakBack);
        glurakBack44 = new Sprite(SPRITE_SIZE_BACK, 3, 5, glurakBack);
        glurakBack45 = new Sprite(SPRITE_SIZE_BACK, 4, 5, glurakBack);
        glurakBack46 = new Sprite(SPRITE_SIZE_BACK, 5, 5, glurakBack);
        glurakBack47 = new Sprite(SPRITE_SIZE_BACK, 6, 5, glurakBack);
        glurakBack48 = new Sprite(SPRITE_SIZE_BACK, 7, 5, glurakBack);
        glurakBack49 = new Sprite(SPRITE_SIZE_BACK, 0, 6, glurakBack);
        glurakBack50 = new Sprite(SPRITE_SIZE_BACK, 1, 6, glurakBack);
        glurakBack51 = new Sprite(SPRITE_SIZE_BACK, 2, 6, glurakBack);

    }

    @Override
    protected void setFrontsprites() {
        frontSprites.add(glurakFront1);
        frontSprites.add(glurakFront2);
        frontSprites.add(glurakFront3);
        frontSprites.add(glurakFront4);
        frontSprites.add(glurakFront5);
        frontSprites.add(glurakFront6);
        frontSprites.add(glurakFront7);
        frontSprites.add(glurakFront8);
        frontSprites.add(glurakFront9);
        frontSprites.add(glurakFront10);
        frontSprites.add(glurakFront11);
        frontSprites.add(glurakFront12);
        frontSprites.add(glurakFront13);
        frontSprites.add(glurakFront14);
        frontSprites.add(glurakFront15);
        frontSprites.add(glurakFront16);
        frontSprites.add(glurakFront17);
        frontSprites.add(glurakFront18);
        frontSprites.add(glurakFront19);
        frontSprites.add(glurakFront20);
        frontSprites.add(glurakFront21);
        frontSprites.add(glurakFront22);
        frontSprites.add(glurakFront23);
        frontSprites.add(glurakFront24);
        frontSprites.add(glurakFront25);
        frontSprites.add(glurakFront26);
        frontSprites.add(glurakFront27);
        frontSprites.add(glurakFront28);
        frontSprites.add(glurakFront29);
        frontSprites.add(glurakFront30);
        frontSprites.add(glurakFront31);
        frontSprites.add(glurakFront32);
        frontSprites.add(glurakFront33);
        frontSprites.add(glurakFront34);
        frontSprites.add(glurakFront35);
        frontSprites.add(glurakFront36);
        frontSprites.add(glurakFront37);
        frontSprites.add(glurakFront38);
        frontSprites.add(glurakFront39);
        frontSprites.add(glurakFront40);
        frontSprites.add(glurakFront41);
        frontSprites.add(glurakFront42);
        frontSprites.add(glurakFront43);
        frontSprites.add(glurakFront44);
        frontSprites.add(glurakFront45);
        frontSprites.add(glurakFront46);
        frontSprites.add(glurakFront47);
    }

    @Override
    protected void setBacksprites() {
        backSprites.add(glurakBack1);
        backSprites.add(glurakBack2);
        backSprites.add(glurakBack3);
        backSprites.add(glurakBack4);
        backSprites.add(glurakBack5);
        backSprites.add(glurakBack6);
        backSprites.add(glurakBack7);
        backSprites.add(glurakBack8);
        backSprites.add(glurakBack9);
        backSprites.add(glurakBack10);
        backSprites.add(glurakBack11);
        backSprites.add(glurakBack12);
        backSprites.add(glurakBack13);
        backSprites.add(glurakBack14);
        backSprites.add(glurakBack15);
        backSprites.add(glurakBack16);
        backSprites.add(glurakBack17);
        backSprites.add(glurakBack18);
        backSprites.add(glurakBack19);
        backSprites.add(glurakBack20);
        backSprites.add(glurakBack21);
        backSprites.add(glurakBack22);
        backSprites.add(glurakBack23);
        backSprites.add(glurakBack24);
        backSprites.add(glurakBack25);
        backSprites.add(glurakBack26);
        backSprites.add(glurakBack27);
        backSprites.add(glurakBack28);
        backSprites.add(glurakBack29);
        backSprites.add(glurakBack30);
        backSprites.add(glurakBack31);
        backSprites.add(glurakBack32);
        backSprites.add(glurakBack33);
        backSprites.add(glurakBack34);
        backSprites.add(glurakBack35);
        backSprites.add(glurakBack36);
        backSprites.add(glurakBack37);
        backSprites.add(glurakBack38);
        backSprites.add(glurakBack39);
        backSprites.add(glurakBack40);
        backSprites.add(glurakBack41);
        backSprites.add(glurakBack42);
        backSprites.add(glurakBack43);
        backSprites.add(glurakBack44);
        backSprites.add(glurakBack45);
        backSprites.add(glurakBack46);
        backSprites.add(glurakBack47);
        backSprites.add(glurakBack48);
        backSprites.add(glurakBack49);
        backSprites.add(glurakBack50);
        backSprites.add(glurakBack51);
    }

    @Override
    protected void populateAttackList() {

    }

    @Override
    protected void setBaseStats() {
        baseStats[0] = 78; //HP
        baseStats[1] = 84; //ATK
        baseStats[2] = 78; //DEF
        baseStats[3] = 109; //SpATK
        baseStats[4] = 85; //SpDEF
        baseStats[5] = 100; //SPD
    }
}
