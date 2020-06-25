package com.yagnnoz.realm.pokemon.pokemon;

import com.yagnnoz.realm.pokemon.mechanics.Pokemon;
import com.yagnnoz.realm.graphics.Sprite;
import com.yagnnoz.realm.graphics.SpriteSheet;
import java.util.ArrayList;

/**
 *
 * @author Jens
 */
public final class Bisaknosp extends Pokemon {

    private final int SPRITE_SIZE_FRONT = 84;
    private final int SPRITE_SIZE_BACK = 76;

    //<editor-fold desc="Sprites">
    public Sprite bisaknospFront1, bisaknospFront2, bisaknospFront3, bisaknospFront4,
            bisaknospFront5, bisaknospFront6, bisaknospFront7, bisaknospFront8,
            bisaknospFront9, bisaknospFront10, bisaknospFront11, bisaknospFront12,
            bisaknospFront13, bisaknospFront14, bisaknospFront15, bisaknospFront16,
            bisaknospFront17, bisaknospFront18, bisaknospFront19, bisaknospFront20,
            bisaknospFront21, bisaknospFront22, bisaknospFront23, bisaknospFront24,
            bisaknospFront25, bisaknospFront26, bisaknospFront27, bisaknospFront28,
            bisaknospFront29, bisaknospFront30, bisaknospFront31, bisaknospFront32,
            bisaknospFront33, bisaknospFront34, bisaknospFront35, bisaknospFront36,
            bisaknospFront37, bisaknospFront38, bisaknospFront39, bisaknospFront40,
            bisaknospFront41, bisaknospFront42, bisaknospFront43, bisaknospFront44,
            bisaknospFront45, bisaknospFront46, bisaknospFront47, bisaknospFront48,
            bisaknospFront49;

    public Sprite bisaknospBack1, bisaknospBack2, bisaknospBack3, bisaknospBack4,
            bisaknospBack5, bisaknospBack6, bisaknospBack7, bisaknospBack8,
            bisaknospBack9, bisaknospBack10, bisaknospBack11, bisaknospBack12,
            bisaknospBack13, bisaknospBack14, bisaknospBack15, bisaknospBack16,
            bisaknospBack17, bisaknospBack18, bisaknospBack19, bisaknospBack20,
            bisaknospBack21, bisaknospBack22, bisaknospBack23, bisaknospBack24,
            bisaknospBack25, bisaknospBack26, bisaknospBack27, bisaknospBack28,
            bisaknospBack29, bisaknospBack30, bisaknospBack31, bisaknospBack32,
            bisaknospBack33, bisaknospBack34, bisaknospBack35, bisaknospBack36,
            bisaknospBack37, bisaknospBack38, bisaknospBack39, bisaknospBack40,
            bisaknospBack41, bisaknospBack42, bisaknospBack43, bisaknospBack44,
            bisaknospBack45, bisaknospBack46, bisaknospBack47, bisaknospBack48,
            bisaknospBack49, bisaknospBack50, bisaknospBack51, bisaknospBack52,
            bisaknospBack53;

    //</editor-fold>
    public SpriteSheet bisaknospFront;
    public SpriteSheet bisaknospBack;

    public Bisaknosp(int level) {
        super(level);
        setName("Bisaknosp");
        frontSprites = new ArrayList<>();
        backSprites = new ArrayList<>();

        setSprites();

        NUMBER_FRAMES_FRONT_ANIM = frontSprites.size();
        NUMBER_FRAMES_BACK_ANIM = backSprites.size();
    }

    @Override
    protected void initSprites() {
        bisaknospFront = new SpriteSheet("/PokemonSprites/bisaknospFront.png", 343);
        bisaknospBack = new SpriteSheet("/PokemonSprites/bisaknospBack.png", 364);

        //---------------------------------------------------------------------------------------------------//
        //----------------------------------------- FRONT ---------------------------------------------------//
        //---------------------------------------------------------------------------------------------------//
        bisaknospFront1 = new Sprite(SPRITE_SIZE_FRONT, 0, 0, bisaknospFront);
        bisaknospFront2 = new Sprite(SPRITE_SIZE_FRONT, 1, 0, bisaknospFront);
        bisaknospFront3 = new Sprite(SPRITE_SIZE_FRONT, 2, 0, bisaknospFront);
        bisaknospFront4 = new Sprite(SPRITE_SIZE_FRONT, 3, 0, bisaknospFront);
        bisaknospFront5 = new Sprite(SPRITE_SIZE_FRONT, 4, 0, bisaknospFront);
        bisaknospFront6 = new Sprite(SPRITE_SIZE_FRONT, 5, 0, bisaknospFront);
        bisaknospFront7 = new Sprite(SPRITE_SIZE_FRONT, 6, 0, bisaknospFront);
        bisaknospFront8 = new Sprite(SPRITE_SIZE_FRONT, 0, 0, bisaknospFront);
        bisaknospFront9 = new Sprite(SPRITE_SIZE_FRONT, 1, 1, bisaknospFront);
        bisaknospFront10 = new Sprite(SPRITE_SIZE_FRONT, 2, 1, bisaknospFront);
        bisaknospFront11 = new Sprite(SPRITE_SIZE_FRONT, 3, 1, bisaknospFront);
        bisaknospFront12 = new Sprite(SPRITE_SIZE_FRONT, 4, 1, bisaknospFront);
        bisaknospFront13 = new Sprite(SPRITE_SIZE_FRONT, 5, 1, bisaknospFront);
        bisaknospFront14 = new Sprite(SPRITE_SIZE_FRONT, 6, 1, bisaknospFront);
        bisaknospFront15 = new Sprite(SPRITE_SIZE_FRONT, 0, 2, bisaknospFront);
        bisaknospFront16 = new Sprite(SPRITE_SIZE_FRONT, 1, 2, bisaknospFront);
        bisaknospFront17 = new Sprite(SPRITE_SIZE_FRONT, 2, 2, bisaknospFront);
        bisaknospFront18 = new Sprite(SPRITE_SIZE_FRONT, 3, 2, bisaknospFront);
        bisaknospFront19 = new Sprite(SPRITE_SIZE_FRONT, 4, 2, bisaknospFront);
        bisaknospFront20 = new Sprite(SPRITE_SIZE_FRONT, 5, 2, bisaknospFront);
        bisaknospFront21 = new Sprite(SPRITE_SIZE_FRONT, 6, 2, bisaknospFront);
        bisaknospFront22 = new Sprite(SPRITE_SIZE_FRONT, 0, 3, bisaknospFront);
        bisaknospFront23 = new Sprite(SPRITE_SIZE_FRONT, 1, 3, bisaknospFront);
        bisaknospFront24 = new Sprite(SPRITE_SIZE_FRONT, 2, 3, bisaknospFront);
        bisaknospFront25 = new Sprite(SPRITE_SIZE_FRONT, 3, 3, bisaknospFront);
        bisaknospFront26 = new Sprite(SPRITE_SIZE_FRONT, 4, 3, bisaknospFront);
        bisaknospFront27 = new Sprite(SPRITE_SIZE_FRONT, 5, 3, bisaknospFront);
        bisaknospFront28 = new Sprite(SPRITE_SIZE_FRONT, 6, 3, bisaknospFront);
        bisaknospFront29 = new Sprite(SPRITE_SIZE_FRONT, 0, 4, bisaknospFront);
        bisaknospFront30 = new Sprite(SPRITE_SIZE_FRONT, 1, 4, bisaknospFront);
        bisaknospFront31 = new Sprite(SPRITE_SIZE_FRONT, 2, 4, bisaknospFront);
        bisaknospFront32 = new Sprite(SPRITE_SIZE_FRONT, 3, 4, bisaknospFront);
        bisaknospFront33 = new Sprite(SPRITE_SIZE_FRONT, 4, 4, bisaknospFront);
        bisaknospFront34 = new Sprite(SPRITE_SIZE_FRONT, 5, 4, bisaknospFront);
        bisaknospFront35 = new Sprite(SPRITE_SIZE_FRONT, 6, 4, bisaknospFront);
        bisaknospFront36 = new Sprite(SPRITE_SIZE_FRONT, 0, 5, bisaknospFront);
        bisaknospFront37 = new Sprite(SPRITE_SIZE_FRONT, 1, 5, bisaknospFront);
        bisaknospFront38 = new Sprite(SPRITE_SIZE_FRONT, 2, 5, bisaknospFront);
        bisaknospFront39 = new Sprite(SPRITE_SIZE_FRONT, 3, 5, bisaknospFront);
        bisaknospFront40 = new Sprite(SPRITE_SIZE_FRONT, 4, 5, bisaknospFront);
        bisaknospFront41 = new Sprite(SPRITE_SIZE_FRONT, 5, 5, bisaknospFront);
        bisaknospFront42 = new Sprite(SPRITE_SIZE_FRONT, 6, 5, bisaknospFront);
        bisaknospFront43 = new Sprite(SPRITE_SIZE_FRONT, 0, 6, bisaknospFront);
        bisaknospFront44 = new Sprite(SPRITE_SIZE_FRONT, 1, 6, bisaknospFront);
        bisaknospFront45 = new Sprite(SPRITE_SIZE_FRONT, 2, 6, bisaknospFront);
        bisaknospFront46 = new Sprite(SPRITE_SIZE_FRONT, 3, 6, bisaknospFront);
        bisaknospFront47 = new Sprite(SPRITE_SIZE_FRONT, 4, 6, bisaknospFront);
        bisaknospFront48 = new Sprite(SPRITE_SIZE_FRONT, 5, 6, bisaknospFront);
        bisaknospFront49 = new Sprite(SPRITE_SIZE_FRONT, 6, 6, bisaknospFront);

        //----------------------------------------------------------------------------------------------------//
        //--------------------------------------------- BACK -------------------------------------------------//
        //----------------------------------------------------------------------------------------------------//
        bisaknospBack1 = new Sprite(SPRITE_SIZE_BACK, 0, 0, bisaknospBack);
        bisaknospBack2 = new Sprite(SPRITE_SIZE_BACK, 1, 0, bisaknospBack);
        bisaknospBack3 = new Sprite(SPRITE_SIZE_BACK, 2, 0, bisaknospBack);
        bisaknospBack4 = new Sprite(SPRITE_SIZE_BACK, 3, 0, bisaknospBack);
        bisaknospBack5 = new Sprite(SPRITE_SIZE_BACK, 4, 0, bisaknospBack);
        bisaknospBack6 = new Sprite(SPRITE_SIZE_BACK, 5, 0, bisaknospBack);
        bisaknospBack7 = new Sprite(SPRITE_SIZE_BACK, 6, 0, bisaknospBack);
        bisaknospBack8 = new Sprite(SPRITE_SIZE_BACK, 7, 0, bisaknospBack);
        bisaknospBack9 = new Sprite(SPRITE_SIZE_BACK, 0, 1, bisaknospBack);
        bisaknospBack10 = new Sprite(SPRITE_SIZE_BACK, 1, 1, bisaknospBack);
        bisaknospBack11 = new Sprite(SPRITE_SIZE_BACK, 2, 1, bisaknospBack);
        bisaknospBack12 = new Sprite(SPRITE_SIZE_BACK, 3, 1, bisaknospBack);
        bisaknospBack13 = new Sprite(SPRITE_SIZE_BACK, 4, 1, bisaknospBack);
        bisaknospBack14 = new Sprite(SPRITE_SIZE_BACK, 5, 1, bisaknospBack);
        bisaknospBack15 = new Sprite(SPRITE_SIZE_BACK, 6, 1, bisaknospBack);
        bisaknospBack16 = new Sprite(SPRITE_SIZE_BACK, 7, 1, bisaknospBack);
        bisaknospBack17 = new Sprite(SPRITE_SIZE_BACK, 0, 2, bisaknospBack);
        bisaknospBack18 = new Sprite(SPRITE_SIZE_BACK, 1, 2, bisaknospBack);
        bisaknospBack19 = new Sprite(SPRITE_SIZE_BACK, 2, 2, bisaknospBack);
        bisaknospBack20 = new Sprite(SPRITE_SIZE_BACK, 3, 2, bisaknospBack);
        bisaknospBack21 = new Sprite(SPRITE_SIZE_BACK, 4, 2, bisaknospBack);
        bisaknospBack22 = new Sprite(SPRITE_SIZE_BACK, 5, 2, bisaknospBack);
        bisaknospBack23 = new Sprite(SPRITE_SIZE_BACK, 6, 2, bisaknospBack);
        bisaknospBack24 = new Sprite(SPRITE_SIZE_BACK, 7, 2, bisaknospBack);
        bisaknospBack25 = new Sprite(SPRITE_SIZE_BACK, 0, 3, bisaknospBack);
        bisaknospBack26 = new Sprite(SPRITE_SIZE_BACK, 1, 3, bisaknospBack);
        bisaknospBack27 = new Sprite(SPRITE_SIZE_BACK, 2, 3, bisaknospBack);
        bisaknospBack28 = new Sprite(SPRITE_SIZE_BACK, 3, 3, bisaknospBack);
        bisaknospBack29 = new Sprite(SPRITE_SIZE_BACK, 4, 3, bisaknospBack);
        bisaknospBack30 = new Sprite(SPRITE_SIZE_BACK, 5, 3, bisaknospBack);
        bisaknospBack31 = new Sprite(SPRITE_SIZE_BACK, 6, 3, bisaknospBack);
        bisaknospBack32 = new Sprite(SPRITE_SIZE_BACK, 7, 3, bisaknospBack);
        bisaknospBack33 = new Sprite(SPRITE_SIZE_BACK, 0, 4, bisaknospBack);
        bisaknospBack34 = new Sprite(SPRITE_SIZE_BACK, 1, 4, bisaknospBack);
        bisaknospBack35 = new Sprite(SPRITE_SIZE_BACK, 2, 4, bisaknospBack);
        bisaknospBack36 = new Sprite(SPRITE_SIZE_BACK, 3, 4, bisaknospBack);
        bisaknospBack37 = new Sprite(SPRITE_SIZE_BACK, 4, 4, bisaknospBack);
        bisaknospBack38 = new Sprite(SPRITE_SIZE_BACK, 5, 4, bisaknospBack);
        bisaknospBack39 = new Sprite(SPRITE_SIZE_BACK, 6, 4, bisaknospBack);
        bisaknospBack40 = new Sprite(SPRITE_SIZE_BACK, 7, 4, bisaknospBack);
        bisaknospBack41 = new Sprite(SPRITE_SIZE_BACK, 0, 5, bisaknospBack);
        bisaknospBack42 = new Sprite(SPRITE_SIZE_BACK, 1, 5, bisaknospBack);
        bisaknospBack43 = new Sprite(SPRITE_SIZE_BACK, 2, 5, bisaknospBack);
        bisaknospBack44 = new Sprite(SPRITE_SIZE_BACK, 3, 5, bisaknospBack);
        bisaknospBack45 = new Sprite(SPRITE_SIZE_BACK, 4, 5, bisaknospBack);
        bisaknospBack46 = new Sprite(SPRITE_SIZE_BACK, 5, 5, bisaknospBack);
        bisaknospBack47 = new Sprite(SPRITE_SIZE_BACK, 6, 5, bisaknospBack);
        bisaknospBack48 = new Sprite(SPRITE_SIZE_BACK, 7, 5, bisaknospBack);
        bisaknospBack49 = new Sprite(SPRITE_SIZE_BACK, 0, 6, bisaknospBack);
        bisaknospBack50 = new Sprite(SPRITE_SIZE_BACK, 1, 6, bisaknospBack);
        bisaknospBack51 = new Sprite(SPRITE_SIZE_BACK, 2, 6, bisaknospBack);
        bisaknospBack52 = new Sprite(SPRITE_SIZE_BACK, 3, 6, bisaknospBack);
        bisaknospBack53 = new Sprite(SPRITE_SIZE_BACK, 4, 6, bisaknospBack);

    }

    @Override
    protected void setFrontsprites() {
        frontSprites.add(bisaknospFront1);
        frontSprites.add(bisaknospFront2);
        frontSprites.add(bisaknospFront3);
        frontSprites.add(bisaknospFront4);
        frontSprites.add(bisaknospFront5);
        frontSprites.add(bisaknospFront6);
        frontSprites.add(bisaknospFront7);
        frontSprites.add(bisaknospFront8);
        frontSprites.add(bisaknospFront9);
        frontSprites.add(bisaknospFront10);
        frontSprites.add(bisaknospFront11);
        frontSprites.add(bisaknospFront12);
        frontSprites.add(bisaknospFront13);
        frontSprites.add(bisaknospFront14);
        frontSprites.add(bisaknospFront15);
        frontSprites.add(bisaknospFront16);
        frontSprites.add(bisaknospFront17);
        frontSprites.add(bisaknospFront18);
        frontSprites.add(bisaknospFront19);
        frontSprites.add(bisaknospFront20);
        frontSprites.add(bisaknospFront21);
        frontSprites.add(bisaknospFront22);
        frontSprites.add(bisaknospFront23);
        frontSprites.add(bisaknospFront24);
        frontSprites.add(bisaknospFront25);
        frontSprites.add(bisaknospFront26);
        frontSprites.add(bisaknospFront27);
        frontSprites.add(bisaknospFront28);
        frontSprites.add(bisaknospFront29);
        frontSprites.add(bisaknospFront30);
        frontSprites.add(bisaknospFront31);
        frontSprites.add(bisaknospFront32);
        frontSprites.add(bisaknospFront33);
        frontSprites.add(bisaknospFront34);
        frontSprites.add(bisaknospFront35);
        frontSprites.add(bisaknospFront36);
        frontSprites.add(bisaknospFront37);
        frontSprites.add(bisaknospFront38);
        frontSprites.add(bisaknospFront39);
        frontSprites.add(bisaknospFront40);
        frontSprites.add(bisaknospFront41);
        frontSprites.add(bisaknospFront42);
        frontSprites.add(bisaknospFront43);
        frontSprites.add(bisaknospFront44);
        frontSprites.add(bisaknospFront45);
        frontSprites.add(bisaknospFront46);
        frontSprites.add(bisaknospFront47);
        frontSprites.add(bisaknospFront48);
        frontSprites.add(bisaknospFront49);
    }

    @Override
    protected void setBacksprites() {
        backSprites.add(bisaknospBack1);
        backSprites.add(bisaknospBack2);
        backSprites.add(bisaknospBack3);
        backSprites.add(bisaknospBack4);
        backSprites.add(bisaknospBack5);
        backSprites.add(bisaknospBack6);
        backSprites.add(bisaknospBack7);
        backSprites.add(bisaknospBack8);
        backSprites.add(bisaknospBack9);
        backSprites.add(bisaknospBack10);
        backSprites.add(bisaknospBack11);
        backSprites.add(bisaknospBack12);
        backSprites.add(bisaknospBack13);
        backSprites.add(bisaknospBack14);
        backSprites.add(bisaknospBack15);
        backSprites.add(bisaknospBack16);
        backSprites.add(bisaknospBack17);
        backSprites.add(bisaknospBack18);
        backSprites.add(bisaknospBack19);
        backSprites.add(bisaknospBack20);
        backSprites.add(bisaknospBack21);
        backSprites.add(bisaknospBack22);
        backSprites.add(bisaknospBack23);
        backSprites.add(bisaknospBack24);
        backSprites.add(bisaknospBack25);
        backSprites.add(bisaknospBack26);
        backSprites.add(bisaknospBack27);
        backSprites.add(bisaknospBack28);
        backSprites.add(bisaknospBack29);
        backSprites.add(bisaknospBack30);
        backSprites.add(bisaknospBack31);
        backSprites.add(bisaknospBack32);
        backSprites.add(bisaknospBack33);
        backSprites.add(bisaknospBack34);
        backSprites.add(bisaknospBack35);
        backSprites.add(bisaknospBack36);
        backSprites.add(bisaknospBack37);
        backSprites.add(bisaknospBack38);
        backSprites.add(bisaknospBack39);
        backSprites.add(bisaknospBack40);
        backSprites.add(bisaknospBack41);
        backSprites.add(bisaknospBack42);
        backSprites.add(bisaknospBack43);
        backSprites.add(bisaknospBack44);
        backSprites.add(bisaknospBack45);
        backSprites.add(bisaknospBack46);
        backSprites.add(bisaknospBack47);
        backSprites.add(bisaknospBack48);
        backSprites.add(bisaknospBack49);
        backSprites.add(bisaknospBack50);
        backSprites.add(bisaknospBack51);
        backSprites.add(bisaknospBack52);
        backSprites.add(bisaknospBack53);
    }

    @Override
    protected void populateAttackList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void setBaseStats() {
        baseStats[0] = 60; //HP
        baseStats[1] = 62; //ATK
        baseStats[2] = 63; //DEF
        baseStats[3] = 80; //SpATK
        baseStats[4] = 80; //SpDEF
        baseStats[5] = 60; //SPD
    }
}
