package com.yagnnoz.realm.pokemon.pokemon;

import com.yagnnoz.realm.graphics.Sprite;
import com.yagnnoz.realm.graphics.SpriteSheet;
import com.yagnnoz.realm.pokemon.mechanics.Pokemon;
import java.util.ArrayList;

/**
 *
 * @author Jens
 */
public final class Glutexo extends Pokemon {

    private final int SPRITE_SIZE_FRONT = 70;
    private final int SPRITE_SIZE_BACK = 78;

//<editor-fold desc="Sprites">
    public Sprite glutexoFront1, glutexoFront2, glutexoFront3, glutexoFront4,
            glutexoFront5, glutexoFront6, glutexoFront7, glutexoFront8,
            glutexoFront9, glutexoFront10, glutexoFront11, glutexoFront12,
            glutexoFront13, glutexoFront14, glutexoFront15, glutexoFront16,
            glutexoFront17, glutexoFront18, glutexoFront19, glutexoFront20,
            glutexoFront21, glutexoFront22, glutexoFront23, glutexoFront24,
            glutexoFront25, glutexoFront26, glutexoFront27, glutexoFront28,
            glutexoFront29, glutexoFront30, glutexoFront31, glutexoFront32,
            glutexoFront33, glutexoFront34, glutexoFront35, glutexoFront36,
            glutexoFront37, glutexoFront38, glutexoFront39, glutexoFront40,
            glutexoFront41, glutexoFront42, glutexoFront43, glutexoFront44,
            glutexoFront45, glutexoFront46, glutexoFront47, glutexoFront48,
            glutexoFront49, glutexoFront50, glutexoFront51, glutexoFront52,
            glutexoFront53, glutexoFront54, glutexoFront55, glutexoFront56,
            glutexoFront57, glutexoFront58, glutexoFront59;

    public Sprite glutexoBack1, glutexoBack2, glutexoBack3, glutexoBack4,
            glutexoBack5, glutexoBack6, glutexoBack7, glutexoBack8,
            glutexoBack9, glutexoBack10, glutexoBack11, glutexoBack12,
            glutexoBack13, glutexoBack14, glutexoBack15, glutexoBack16,
            glutexoBack17, glutexoBack18, glutexoBack19, glutexoBack20,
            glutexoBack21, glutexoBack22, glutexoBack23, glutexoBack24,
            glutexoBack25, glutexoBack26, glutexoBack27, glutexoBack28,
            glutexoBack29, glutexoBack30, glutexoBack31, glutexoBack32,
            glutexoBack33, glutexoBack34, glutexoBack35, glutexoBack36,
            glutexoBack37, glutexoBack38, glutexoBack39, glutexoBack40,
            glutexoBack41, glutexoBack42, glutexoBack43, glutexoBack44,
            glutexoBack45, glutexoBack46, glutexoBack47, glutexoBack48,
            glutexoBack49, glutexoBack50, glutexoBack51, glutexoBack52,
            glutexoBack53, glutexoBack54, glutexoBack55, glutexoBack56,
            glutexoBack57, glutexoBack58, glutexoBack59, glutexoBack60,
            glutexoBack61, glutexoBack62, glutexoBack63;
//</editor-fold>

    private SpriteSheet glutexoFront;
    private SpriteSheet glutexoBack;

    public Glutexo(int level) {
        super(level);
        setName("Glutexo");
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
        glutexoFront = new SpriteSheet("/PokemonSprites/GlutexoFront.png", 560);
        glutexoBack = new SpriteSheet("/PokemonSprites/GlutexoBack.png", 624);

//----------------------------------------------------------------------------------------------------//
//--------------------------------------------- FRONT ------------------------------------------------//
//----------------------------------------------------------------------------------------------------//
        glutexoFront1 = new Sprite(SPRITE_SIZE_FRONT, 0, 0, glutexoFront);
        glutexoFront2 = new Sprite(SPRITE_SIZE_FRONT, 1, 0, glutexoFront);
        glutexoFront3 = new Sprite(SPRITE_SIZE_FRONT, 2, 0, glutexoFront);
        glutexoFront4 = new Sprite(SPRITE_SIZE_FRONT, 3, 0, glutexoFront);
        glutexoFront5 = new Sprite(SPRITE_SIZE_FRONT, 4, 0, glutexoFront);
        glutexoFront6 = new Sprite(SPRITE_SIZE_FRONT, 5, 0, glutexoFront);
        glutexoFront7 = new Sprite(SPRITE_SIZE_FRONT, 6, 0, glutexoFront);
        glutexoFront8 = new Sprite(SPRITE_SIZE_FRONT, 7, 0, glutexoFront);
        glutexoFront9 = new Sprite(SPRITE_SIZE_FRONT, 0, 1, glutexoFront);
        glutexoFront10 = new Sprite(SPRITE_SIZE_FRONT, 1, 1, glutexoFront);
        glutexoFront11 = new Sprite(SPRITE_SIZE_FRONT, 2, 1, glutexoFront);
        glutexoFront12 = new Sprite(SPRITE_SIZE_FRONT, 3, 1, glutexoFront);
        glutexoFront13 = new Sprite(SPRITE_SIZE_FRONT, 4, 1, glutexoFront);
        glutexoFront14 = new Sprite(SPRITE_SIZE_FRONT, 5, 1, glutexoFront);
        glutexoFront15 = new Sprite(SPRITE_SIZE_FRONT, 6, 1, glutexoFront);
        glutexoFront16 = new Sprite(SPRITE_SIZE_FRONT, 7, 1, glutexoFront);
        glutexoFront17 = new Sprite(SPRITE_SIZE_FRONT, 0, 2, glutexoFront);
        glutexoFront18 = new Sprite(SPRITE_SIZE_FRONT, 1, 2, glutexoFront);
        glutexoFront19 = new Sprite(SPRITE_SIZE_FRONT, 2, 2, glutexoFront);
        glutexoFront20 = new Sprite(SPRITE_SIZE_FRONT, 3, 2, glutexoFront);
        glutexoFront21 = new Sprite(SPRITE_SIZE_FRONT, 4, 2, glutexoFront);
        glutexoFront22 = new Sprite(SPRITE_SIZE_FRONT, 5, 2, glutexoFront);
        glutexoFront23 = new Sprite(SPRITE_SIZE_FRONT, 6, 2, glutexoFront);
        glutexoFront24 = new Sprite(SPRITE_SIZE_FRONT, 7, 2, glutexoFront);
        glutexoFront25 = new Sprite(SPRITE_SIZE_FRONT, 0, 3, glutexoFront);
        glutexoFront26 = new Sprite(SPRITE_SIZE_FRONT, 1, 3, glutexoFront);
        glutexoFront27 = new Sprite(SPRITE_SIZE_FRONT, 2, 3, glutexoFront);
        glutexoFront28 = new Sprite(SPRITE_SIZE_FRONT, 3, 3, glutexoFront);
        glutexoFront29 = new Sprite(SPRITE_SIZE_FRONT, 4, 3, glutexoFront);
        glutexoFront30 = new Sprite(SPRITE_SIZE_FRONT, 5, 3, glutexoFront);
        glutexoFront31 = new Sprite(SPRITE_SIZE_FRONT, 6, 3, glutexoFront);
        glutexoFront32 = new Sprite(SPRITE_SIZE_FRONT, 7, 3, glutexoFront);
        glutexoFront33 = new Sprite(SPRITE_SIZE_FRONT, 0, 4, glutexoFront);
        glutexoFront34 = new Sprite(SPRITE_SIZE_FRONT, 1, 4, glutexoFront);
        glutexoFront35 = new Sprite(SPRITE_SIZE_FRONT, 2, 4, glutexoFront);
        glutexoFront36 = new Sprite(SPRITE_SIZE_FRONT, 3, 4, glutexoFront);
        glutexoFront37 = new Sprite(SPRITE_SIZE_FRONT, 4, 4, glutexoFront);
        glutexoFront38 = new Sprite(SPRITE_SIZE_FRONT, 5, 4, glutexoFront);
        glutexoFront39 = new Sprite(SPRITE_SIZE_FRONT, 6, 4, glutexoFront);
        glutexoFront40 = new Sprite(SPRITE_SIZE_FRONT, 7, 4, glutexoFront);
        glutexoFront41 = new Sprite(SPRITE_SIZE_FRONT, 0, 5, glutexoFront);
        glutexoFront42 = new Sprite(SPRITE_SIZE_FRONT, 1, 5, glutexoFront);
        glutexoFront43 = new Sprite(SPRITE_SIZE_FRONT, 2, 5, glutexoFront);
        glutexoFront44 = new Sprite(SPRITE_SIZE_FRONT, 3, 5, glutexoFront);
        glutexoFront45 = new Sprite(SPRITE_SIZE_FRONT, 4, 5, glutexoFront);
        glutexoFront46 = new Sprite(SPRITE_SIZE_FRONT, 5, 5, glutexoFront);
        glutexoFront47 = new Sprite(SPRITE_SIZE_FRONT, 6, 5, glutexoFront);
        glutexoFront48 = new Sprite(SPRITE_SIZE_FRONT, 7, 5, glutexoFront);
        glutexoFront49 = new Sprite(SPRITE_SIZE_FRONT, 0, 6, glutexoFront);
        glutexoFront50 = new Sprite(SPRITE_SIZE_FRONT, 1, 6, glutexoFront);
        glutexoFront51 = new Sprite(SPRITE_SIZE_FRONT, 2, 6, glutexoFront);
        glutexoFront52 = new Sprite(SPRITE_SIZE_FRONT, 3, 6, glutexoFront);
        glutexoFront53 = new Sprite(SPRITE_SIZE_FRONT, 4, 6, glutexoFront);
        glutexoFront54 = new Sprite(SPRITE_SIZE_FRONT, 5, 6, glutexoFront);
        glutexoFront55 = new Sprite(SPRITE_SIZE_FRONT, 6, 6, glutexoFront);
        glutexoFront56 = new Sprite(SPRITE_SIZE_FRONT, 7, 6, glutexoFront);
        glutexoFront57 = new Sprite(SPRITE_SIZE_FRONT, 0, 7, glutexoFront);
        glutexoFront58 = new Sprite(SPRITE_SIZE_FRONT, 1, 7, glutexoFront);
        glutexoFront59 = new Sprite(SPRITE_SIZE_FRONT, 2, 7, glutexoFront);

//----------------------------------------------------------------------------------------------------//
//--------------------------------------------- BACK -------------------------------------------------//
//----------------------------------------------------------------------------------------------------//
        glutexoBack1 = new Sprite(SPRITE_SIZE_BACK, 0, 0, glutexoBack);
        glutexoBack2 = new Sprite(SPRITE_SIZE_BACK, 1, 0, glutexoBack);
        glutexoBack3 = new Sprite(SPRITE_SIZE_BACK, 2, 0, glutexoBack);
        glutexoBack4 = new Sprite(SPRITE_SIZE_BACK, 3, 0, glutexoBack);
        glutexoBack5 = new Sprite(SPRITE_SIZE_BACK, 4, 0, glutexoBack);
        glutexoBack6 = new Sprite(SPRITE_SIZE_BACK, 5, 0, glutexoBack);
        glutexoBack7 = new Sprite(SPRITE_SIZE_BACK, 6, 0, glutexoBack);
        glutexoBack8 = new Sprite(SPRITE_SIZE_BACK, 7, 0, glutexoBack);
        glutexoBack9 = new Sprite(SPRITE_SIZE_BACK, 0, 1, glutexoBack);
        glutexoBack10 = new Sprite(SPRITE_SIZE_BACK, 1, 1, glutexoBack);
        glutexoBack11 = new Sprite(SPRITE_SIZE_BACK, 2, 1, glutexoBack);
        glutexoBack12 = new Sprite(SPRITE_SIZE_BACK, 3, 1, glutexoBack);
        glutexoBack13 = new Sprite(SPRITE_SIZE_BACK, 4, 1, glutexoBack);
        glutexoBack14 = new Sprite(SPRITE_SIZE_BACK, 5, 1, glutexoBack);
        glutexoBack15 = new Sprite(SPRITE_SIZE_BACK, 6, 1, glutexoBack);
        glutexoBack16 = new Sprite(SPRITE_SIZE_BACK, 7, 1, glutexoBack);
        glutexoBack17 = new Sprite(SPRITE_SIZE_BACK, 0, 2, glutexoBack);
        glutexoBack18 = new Sprite(SPRITE_SIZE_BACK, 1, 2, glutexoBack);
        glutexoBack19 = new Sprite(SPRITE_SIZE_BACK, 2, 2, glutexoBack);
        glutexoBack20 = new Sprite(SPRITE_SIZE_BACK, 3, 2, glutexoBack);
        glutexoBack21 = new Sprite(SPRITE_SIZE_BACK, 4, 2, glutexoBack);
        glutexoBack22 = new Sprite(SPRITE_SIZE_BACK, 5, 2, glutexoBack);
        glutexoBack23 = new Sprite(SPRITE_SIZE_BACK, 6, 2, glutexoBack);
        glutexoBack24 = new Sprite(SPRITE_SIZE_BACK, 7, 2, glutexoBack);
        glutexoBack25 = new Sprite(SPRITE_SIZE_BACK, 0, 3, glutexoBack);
        glutexoBack26 = new Sprite(SPRITE_SIZE_BACK, 1, 3, glutexoBack);
        glutexoBack27 = new Sprite(SPRITE_SIZE_BACK, 2, 3, glutexoBack);
        glutexoBack28 = new Sprite(SPRITE_SIZE_BACK, 3, 3, glutexoBack);
        glutexoBack29 = new Sprite(SPRITE_SIZE_BACK, 4, 3, glutexoBack);
        glutexoBack30 = new Sprite(SPRITE_SIZE_BACK, 5, 3, glutexoBack);
        glutexoBack31 = new Sprite(SPRITE_SIZE_BACK, 6, 3, glutexoBack);
        glutexoBack32 = new Sprite(SPRITE_SIZE_BACK, 7, 3, glutexoBack);
        glutexoBack33 = new Sprite(SPRITE_SIZE_BACK, 0, 4, glutexoBack);
        glutexoBack34 = new Sprite(SPRITE_SIZE_BACK, 1, 4, glutexoBack);
        glutexoBack35 = new Sprite(SPRITE_SIZE_BACK, 2, 4, glutexoBack);
        glutexoBack36 = new Sprite(SPRITE_SIZE_BACK, 3, 4, glutexoBack);
        glutexoBack37 = new Sprite(SPRITE_SIZE_BACK, 4, 4, glutexoBack);
        glutexoBack38 = new Sprite(SPRITE_SIZE_BACK, 5, 4, glutexoBack);
        glutexoBack39 = new Sprite(SPRITE_SIZE_BACK, 6, 4, glutexoBack);
        glutexoBack40 = new Sprite(SPRITE_SIZE_BACK, 7, 4, glutexoBack);
        glutexoBack41 = new Sprite(SPRITE_SIZE_BACK, 0, 5, glutexoBack);
        glutexoBack42 = new Sprite(SPRITE_SIZE_BACK, 1, 5, glutexoBack);
        glutexoBack43 = new Sprite(SPRITE_SIZE_BACK, 2, 5, glutexoBack);
        glutexoBack44 = new Sprite(SPRITE_SIZE_BACK, 3, 5, glutexoBack);
        glutexoBack45 = new Sprite(SPRITE_SIZE_BACK, 4, 5, glutexoBack);
        glutexoBack46 = new Sprite(SPRITE_SIZE_BACK, 5, 5, glutexoBack);
        glutexoBack47 = new Sprite(SPRITE_SIZE_BACK, 6, 5, glutexoBack);
        glutexoBack48 = new Sprite(SPRITE_SIZE_BACK, 7, 5, glutexoBack);
        glutexoBack49 = new Sprite(SPRITE_SIZE_BACK, 0, 6, glutexoBack);
        glutexoBack50 = new Sprite(SPRITE_SIZE_BACK, 1, 6, glutexoBack);
        glutexoBack51 = new Sprite(SPRITE_SIZE_BACK, 2, 6, glutexoBack);
        glutexoBack52 = new Sprite(SPRITE_SIZE_BACK, 3, 6, glutexoBack);
        glutexoBack53 = new Sprite(SPRITE_SIZE_BACK, 4, 6, glutexoBack);
        glutexoBack54 = new Sprite(SPRITE_SIZE_BACK, 5, 6, glutexoBack);
        glutexoBack55 = new Sprite(SPRITE_SIZE_BACK, 6, 6, glutexoBack);
        glutexoBack56 = new Sprite(SPRITE_SIZE_BACK, 7, 6, glutexoBack);
        glutexoBack57 = new Sprite(SPRITE_SIZE_BACK, 0, 7, glutexoBack);
        glutexoBack58 = new Sprite(SPRITE_SIZE_BACK, 1, 7, glutexoBack);
        glutexoBack59 = new Sprite(SPRITE_SIZE_BACK, 2, 7, glutexoBack);
        glutexoBack60 = new Sprite(SPRITE_SIZE_BACK, 3, 7, glutexoBack);
        glutexoBack61 = new Sprite(SPRITE_SIZE_BACK, 4, 7, glutexoBack);
        glutexoBack62 = new Sprite(SPRITE_SIZE_BACK, 5, 7, glutexoBack);
        glutexoBack63 = new Sprite(SPRITE_SIZE_BACK, 6, 7, glutexoBack);

    }

    @Override
    protected void setFrontsprites() {
        frontSprites.add(glutexoFront1);
        frontSprites.add(glutexoFront2);
        frontSprites.add(glutexoFront3);
        frontSprites.add(glutexoFront4);
        frontSprites.add(glutexoFront5);
        frontSprites.add(glutexoFront6);
        frontSprites.add(glutexoFront7);
        frontSprites.add(glutexoFront8);
        frontSprites.add(glutexoFront9);
        frontSprites.add(glutexoFront10);
        frontSprites.add(glutexoFront11);
        frontSprites.add(glutexoFront12);
        frontSprites.add(glutexoFront13);
        frontSprites.add(glutexoFront14);
        frontSprites.add(glutexoFront15);
        frontSprites.add(glutexoFront16);
        frontSprites.add(glutexoFront17);
        frontSprites.add(glutexoFront18);
        frontSprites.add(glutexoFront19);
        frontSprites.add(glutexoFront20);
        frontSprites.add(glutexoFront21);
        frontSprites.add(glutexoFront22);
        frontSprites.add(glutexoFront23);
        frontSprites.add(glutexoFront24);
        frontSprites.add(glutexoFront25);
        frontSprites.add(glutexoFront26);
        frontSprites.add(glutexoFront27);
        frontSprites.add(glutexoFront28);
        frontSprites.add(glutexoFront29);
        frontSprites.add(glutexoFront30);
        frontSprites.add(glutexoFront31);
        frontSprites.add(glutexoFront32);
        frontSprites.add(glutexoFront33);
        frontSprites.add(glutexoFront34);
        frontSprites.add(glutexoFront35);
        frontSprites.add(glutexoFront36);
        frontSprites.add(glutexoFront37);
        frontSprites.add(glutexoFront38);
        frontSprites.add(glutexoFront39);
        frontSprites.add(glutexoFront40);
        frontSprites.add(glutexoFront41);
        frontSprites.add(glutexoFront42);
        frontSprites.add(glutexoFront43);
        frontSprites.add(glutexoFront44);
        frontSprites.add(glutexoFront45);
        frontSprites.add(glutexoFront46);
        frontSprites.add(glutexoFront47);
        frontSprites.add(glutexoFront48);
        frontSprites.add(glutexoFront49);
        frontSprites.add(glutexoFront50);
        frontSprites.add(glutexoFront51);
        frontSprites.add(glutexoFront52);
        frontSprites.add(glutexoFront53);
        frontSprites.add(glutexoFront54);
        frontSprites.add(glutexoFront55);
        frontSprites.add(glutexoFront56);
        frontSprites.add(glutexoFront57);
        frontSprites.add(glutexoFront58);
        frontSprites.add(glutexoFront59);
    }

    @Override
    protected void setBacksprites() {
        backSprites.add(glutexoBack1);
        backSprites.add(glutexoBack2);
        backSprites.add(glutexoBack3);
        backSprites.add(glutexoBack4);
        backSprites.add(glutexoBack5);
        backSprites.add(glutexoBack6);
        backSprites.add(glutexoBack7);
        backSprites.add(glutexoBack8);
        backSprites.add(glutexoBack9);
        backSprites.add(glutexoBack10);
        backSprites.add(glutexoBack11);
        backSprites.add(glutexoBack12);
        backSprites.add(glutexoBack13);
        backSprites.add(glutexoBack14);
        backSprites.add(glutexoBack15);
        backSprites.add(glutexoBack16);
        backSprites.add(glutexoBack17);
        backSprites.add(glutexoBack18);
        backSprites.add(glutexoBack19);
        backSprites.add(glutexoBack20);
        backSprites.add(glutexoBack21);
        backSprites.add(glutexoBack22);
        backSprites.add(glutexoBack23);
        backSprites.add(glutexoBack24);
        backSprites.add(glutexoBack25);
        backSprites.add(glutexoBack26);
        backSprites.add(glutexoBack27);
        backSprites.add(glutexoBack28);
        backSprites.add(glutexoBack29);
        backSprites.add(glutexoBack30);
        backSprites.add(glutexoBack31);
        backSprites.add(glutexoBack32);
        backSprites.add(glutexoBack33);
        backSprites.add(glutexoBack34);
        backSprites.add(glutexoBack35);
        backSprites.add(glutexoBack36);
        backSprites.add(glutexoBack37);
        backSprites.add(glutexoBack38);
        backSprites.add(glutexoBack39);
        backSprites.add(glutexoBack40);
        backSprites.add(glutexoBack41);
        backSprites.add(glutexoBack42);
        backSprites.add(glutexoBack43);
        backSprites.add(glutexoBack44);
        backSprites.add(glutexoBack45);
        backSprites.add(glutexoBack46);
        backSprites.add(glutexoBack47);
        backSprites.add(glutexoBack48);
        backSprites.add(glutexoBack49);
        backSprites.add(glutexoBack50);
        backSprites.add(glutexoBack51);
        backSprites.add(glutexoBack52);
        backSprites.add(glutexoBack53);
        backSprites.add(glutexoBack54);
        backSprites.add(glutexoBack55);
        backSprites.add(glutexoBack56);
        backSprites.add(glutexoBack57);
        backSprites.add(glutexoBack58);
        backSprites.add(glutexoBack59);
        backSprites.add(glutexoBack60);
        backSprites.add(glutexoBack61);
        backSprites.add(glutexoBack62);
        backSprites.add(glutexoBack63);
    }

    @Override
    protected void populateAttackList() {

    }

    @Override
    protected void setBaseStats() {
        baseStats[0] = 58; //HP
        baseStats[1] = 64; //ATK
        baseStats[2] = 58; //DEF
        baseStats[3] = 80; //SpATK
        baseStats[4] = 65; //SpDEF
        baseStats[5] = 80; //SPD
    }

}
