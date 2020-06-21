package com.yagnnoz.realm.pokemon;

import com.yagnnoz.realm.graphics.Sprite;
import com.yagnnoz.realm.graphics.SpriteSheet;
import java.util.ArrayList;

/**
 *
 * @author Jens
 */
public class Bisasam extends Pokemon {

    private final int SPRITE_SIZE_FRONT = 49;
    private final int SPRITE_SIZE_BACK = 52;

    //<editor-fold desc="Sprites">
    public Sprite bisasamFront1, bisasamFront2, bisasamFront3, bisasamFront4,
            bisasamFront5, bisasamFront6, bisasamFront7, bisasamFront8,
            bisasamFront9, bisasamFront10, bisasamFront11, bisasamFront12,
            bisasamFront13, bisasamFront14, bisasamFront15, bisasamFront16,
            bisasamFront17, bisasamFront18, bisasamFront19, bisasamFront20,
            bisasamFront21, bisasamFront22, bisasamFront23, bisasamFront24,
            bisasamFront25, bisasamFront26, bisasamFront27, bisasamFront28,
            bisasamFront29, bisasamFront30, bisasamFront31, bisasamFront32,
            bisasamFront33, bisasamFront34, bisasamFront35, bisasamFront36,
            bisasamFront37, bisasamFront38, bisasamFront39, bisasamFront40,
            bisasamFront41;

    public Sprite bisasamBack1, bisasamBack2, bisasamBack3, bisasamBack4,
            bisasamBack5, bisasamBack6, bisasamBack7, bisasamBack8,
            bisasamBack9, bisasamBack10, bisasamBack11, bisasamBack12,
            bisasamBack13, bisasamBack14, bisasamBack15, bisasamBack16,
            bisasamBack17, bisasamBack18, bisasamBack19, bisasamBack20,
            bisasamBack21, bisasamBack22, bisasamBack23, bisasamBack24,
            bisasamBack25, bisasamBack26, bisasamBack27, bisasamBack28,
            bisasamBack29, bisasamBack30, bisasamBack31, bisasamBack32,
            bisasamBack33, bisasamBack34, bisasamBack35, bisasamBack36,
            bisasamBack37, bisasamBack38, bisasamBack39, bisasamBack40,
            bisasamBack41, bisasamBack42, bisasamBack43, bisasamBack44,
            bisasamBack45;
    //</editor-fold>

    public SpriteSheet bisasamFront;
    public SpriteSheet bisasamBack;

    public Bisasam(int level) {
        super(level);
        setName("Bisasam");
        frontSprites = new ArrayList<>();
        backSprites = new ArrayList<>();

        setSprites();

        NUMBER_FRAMES_FRONT_ANIM = frontSprites.size();
        NUMBER_FRAMES_BACK_ANIM = backSprites.size();
    }

    @Override
    protected void setFrontsprites() {
        frontSprites.add(bisasamFront1);
        frontSprites.add(bisasamFront2);
        frontSprites.add(bisasamFront3);
        frontSprites.add(bisasamFront4);
        frontSprites.add(bisasamFront5);
        frontSprites.add(bisasamFront6);
        frontSprites.add(bisasamFront7);
        frontSprites.add(bisasamFront8);
        frontSprites.add(bisasamFront9);

        frontSprites.add(bisasamFront10);
        frontSprites.add(bisasamFront11);
        frontSprites.add(bisasamFront12);
        frontSprites.add(bisasamFront13);
        frontSprites.add(bisasamFront14);
        frontSprites.add(bisasamFront15);
        frontSprites.add(bisasamFront16);
        frontSprites.add(bisasamFront17);
        frontSprites.add(bisasamFront18);
        frontSprites.add(bisasamFront19);

        frontSprites.add(bisasamFront20);
        frontSprites.add(bisasamFront21);
        frontSprites.add(bisasamFront22);
        frontSprites.add(bisasamFront23);
        frontSprites.add(bisasamFront24);
        frontSprites.add(bisasamFront25);
        frontSprites.add(bisasamFront26);
        frontSprites.add(bisasamFront27);
        frontSprites.add(bisasamFront28);
        frontSprites.add(bisasamFront29);

        frontSprites.add(bisasamFront30);
        frontSprites.add(bisasamFront31);
        frontSprites.add(bisasamFront32);
        frontSprites.add(bisasamFront33);
        frontSprites.add(bisasamFront34);
        frontSprites.add(bisasamFront35);
        frontSprites.add(bisasamFront36);
        frontSprites.add(bisasamFront37);
        frontSprites.add(bisasamFront38);
        frontSprites.add(bisasamFront39);

        frontSprites.add(bisasamFront40);
        frontSprites.add(bisasamFront41);
    }

    @Override
    protected void setBacksprites() {
        backSprites.add(bisasamBack1);
        backSprites.add(bisasamBack2);
        backSprites.add(bisasamBack3);
        backSprites.add(bisasamBack4);
        backSprites.add(bisasamBack5);
        backSprites.add(bisasamBack6);
        backSprites.add(bisasamBack7);
        backSprites.add(bisasamBack8);
        backSprites.add(bisasamBack9);
        backSprites.add(bisasamBack10);
        backSprites.add(bisasamBack11);
        backSprites.add(bisasamBack12);
        backSprites.add(bisasamBack13);
        backSprites.add(bisasamBack14);
        backSprites.add(bisasamBack15);
        backSprites.add(bisasamBack16);
        backSprites.add(bisasamBack17);
        backSprites.add(bisasamBack18);
        backSprites.add(bisasamBack19);
        backSprites.add(bisasamBack20);
        backSprites.add(bisasamBack21);
        backSprites.add(bisasamBack22);
        backSprites.add(bisasamBack23);
        backSprites.add(bisasamBack24);
        backSprites.add(bisasamBack25);
        backSprites.add(bisasamBack26);
        backSprites.add(bisasamBack27);
        backSprites.add(bisasamBack28);
        backSprites.add(bisasamBack29);
        backSprites.add(bisasamBack30);
        backSprites.add(bisasamBack31);
        backSprites.add(bisasamBack32);
        backSprites.add(bisasamBack33);
        backSprites.add(bisasamBack34);
        backSprites.add(bisasamBack35);
        backSprites.add(bisasamBack36);
        backSprites.add(bisasamBack37);
        backSprites.add(bisasamBack38);
        backSprites.add(bisasamBack39);
        backSprites.add(bisasamBack40);
        backSprites.add(bisasamBack41);
        backSprites.add(bisasamBack42);
        backSprites.add(bisasamBack43);
        backSprites.add(bisasamBack44);
        backSprites.add(bisasamBack45);
    }

    @Override
    protected void initSprites() {
        bisasamFront = new SpriteSheet("/PokemonSprites/BisasamFront.png", 343);
        bisasamBack = new SpriteSheet("/PokemonSprites/BisasamBack.png", 364);
        //---------------------------------------------------------------------------------------------------//
        //----------------------------------------- FRONT ---------------------------------------------------//
        //---------------------------------------------------------------------------------------------------//
        bisasamFront1 = new Sprite(SPRITE_SIZE_FRONT, 0, 0, bisasamFront);
        bisasamFront2 = new Sprite(SPRITE_SIZE_FRONT, 1, 0, bisasamFront);
        bisasamFront3 = new Sprite(SPRITE_SIZE_FRONT, 2, 0, bisasamFront);
        bisasamFront4 = new Sprite(SPRITE_SIZE_FRONT, 3, 0, bisasamFront);
        bisasamFront5 = new Sprite(SPRITE_SIZE_FRONT, 4, 0, bisasamFront);
        bisasamFront6 = new Sprite(SPRITE_SIZE_FRONT, 5, 0, bisasamFront);
        bisasamFront7 = new Sprite(SPRITE_SIZE_FRONT, 6, 0, bisasamFront);
        bisasamFront8 = new Sprite(SPRITE_SIZE_FRONT, 0, 1, bisasamFront);
        bisasamFront9 = new Sprite(SPRITE_SIZE_FRONT, 1, 1, bisasamFront);
        bisasamFront10 = new Sprite(SPRITE_SIZE_FRONT, 2, 1, bisasamFront);
        bisasamFront11 = new Sprite(SPRITE_SIZE_FRONT, 3, 1, bisasamFront);
        bisasamFront12 = new Sprite(SPRITE_SIZE_FRONT, 4, 1, bisasamFront);
        bisasamFront13 = new Sprite(SPRITE_SIZE_FRONT, 5, 1, bisasamFront);
        bisasamFront14 = new Sprite(SPRITE_SIZE_FRONT, 6, 1, bisasamFront);
        bisasamFront15 = new Sprite(SPRITE_SIZE_FRONT, 0, 2, bisasamFront);
        bisasamFront16 = new Sprite(SPRITE_SIZE_FRONT, 1, 2, bisasamFront);
        bisasamFront17 = new Sprite(SPRITE_SIZE_FRONT, 2, 2, bisasamFront);
        bisasamFront18 = new Sprite(SPRITE_SIZE_FRONT, 3, 2, bisasamFront);
        bisasamFront19 = new Sprite(SPRITE_SIZE_FRONT, 4, 2, bisasamFront);
        bisasamFront20 = new Sprite(SPRITE_SIZE_FRONT, 5, 2, bisasamFront);
        bisasamFront21 = new Sprite(SPRITE_SIZE_FRONT, 6, 2, bisasamFront);
        bisasamFront22 = new Sprite(SPRITE_SIZE_FRONT, 0, 3, bisasamFront);
        bisasamFront23 = new Sprite(SPRITE_SIZE_FRONT, 1, 3, bisasamFront);
        bisasamFront24 = new Sprite(SPRITE_SIZE_FRONT, 2, 3, bisasamFront);
        bisasamFront25 = new Sprite(SPRITE_SIZE_FRONT, 3, 3, bisasamFront);
        bisasamFront26 = new Sprite(SPRITE_SIZE_FRONT, 4, 3, bisasamFront);
        bisasamFront27 = new Sprite(SPRITE_SIZE_FRONT, 5, 3, bisasamFront);
        bisasamFront28 = new Sprite(SPRITE_SIZE_FRONT, 6, 3, bisasamFront);
        bisasamFront29 = new Sprite(SPRITE_SIZE_FRONT, 0, 4, bisasamFront);
        bisasamFront30 = new Sprite(SPRITE_SIZE_FRONT, 1, 4, bisasamFront);
        bisasamFront31 = new Sprite(SPRITE_SIZE_FRONT, 2, 4, bisasamFront);
        bisasamFront32 = new Sprite(SPRITE_SIZE_FRONT, 3, 4, bisasamFront);
        bisasamFront33 = new Sprite(SPRITE_SIZE_FRONT, 4, 4, bisasamFront);
        bisasamFront34 = new Sprite(SPRITE_SIZE_FRONT, 5, 4, bisasamFront);
        bisasamFront35 = new Sprite(SPRITE_SIZE_FRONT, 6, 4, bisasamFront);
        bisasamFront36 = new Sprite(SPRITE_SIZE_FRONT, 0, 5, bisasamFront);
        bisasamFront37 = new Sprite(SPRITE_SIZE_FRONT, 1, 5, bisasamFront);
        bisasamFront38 = new Sprite(SPRITE_SIZE_FRONT, 2, 5, bisasamFront);
        bisasamFront39 = new Sprite(SPRITE_SIZE_FRONT, 3, 5, bisasamFront);
        bisasamFront40 = new Sprite(SPRITE_SIZE_FRONT, 4, 5, bisasamFront);
        bisasamFront41 = new Sprite(SPRITE_SIZE_FRONT, 5, 5, bisasamFront);

        //----------------------------------------------------------------------------------------------------//
        //--------------------------------------------- BACK -------------------------------------------------//
        //----------------------------------------------------------------------------------------------------//
        bisasamBack1 = new Sprite(SPRITE_SIZE_BACK, 0, 0, bisasamBack);
        bisasamBack2 = new Sprite(SPRITE_SIZE_BACK, 1, 0, bisasamBack);
        bisasamBack3 = new Sprite(SPRITE_SIZE_BACK, 2, 0, bisasamBack);
        bisasamBack4 = new Sprite(SPRITE_SIZE_BACK, 3, 0, bisasamBack);
        bisasamBack5 = new Sprite(SPRITE_SIZE_BACK, 4, 0, bisasamBack);
        bisasamBack6 = new Sprite(SPRITE_SIZE_BACK, 5, 0, bisasamBack);
        bisasamBack7 = new Sprite(SPRITE_SIZE_BACK, 6, 0, bisasamBack);
        bisasamBack8 = new Sprite(SPRITE_SIZE_BACK, 0, 1, bisasamBack);
        bisasamBack9 = new Sprite(SPRITE_SIZE_BACK, 1, 1, bisasamBack);
        bisasamBack10 = new Sprite(SPRITE_SIZE_BACK, 2, 1, bisasamBack);
        bisasamBack11 = new Sprite(SPRITE_SIZE_BACK, 3, 1, bisasamBack);
        bisasamBack12 = new Sprite(SPRITE_SIZE_BACK, 4, 1, bisasamBack);
        bisasamBack13 = new Sprite(SPRITE_SIZE_BACK, 5, 1, bisasamBack);
        bisasamBack14 = new Sprite(SPRITE_SIZE_BACK, 6, 1, bisasamBack);
        bisasamBack15 = new Sprite(SPRITE_SIZE_BACK, 0, 2, bisasamBack);
        bisasamBack16 = new Sprite(SPRITE_SIZE_BACK, 1, 2, bisasamBack);
        bisasamBack17 = new Sprite(SPRITE_SIZE_BACK, 2, 2, bisasamBack);
        bisasamBack18 = new Sprite(SPRITE_SIZE_BACK, 3, 2, bisasamBack);
        bisasamBack19 = new Sprite(SPRITE_SIZE_BACK, 4, 2, bisasamBack);
        bisasamBack20 = new Sprite(SPRITE_SIZE_BACK, 5, 2, bisasamBack);
        bisasamBack21 = new Sprite(SPRITE_SIZE_BACK, 6, 2, bisasamBack);
        bisasamBack22 = new Sprite(SPRITE_SIZE_BACK, 0, 3, bisasamBack);
        bisasamBack23 = new Sprite(SPRITE_SIZE_BACK, 1, 3, bisasamBack);
        bisasamBack24 = new Sprite(SPRITE_SIZE_BACK, 2, 3, bisasamBack);
        bisasamBack25 = new Sprite(SPRITE_SIZE_BACK, 3, 3, bisasamBack);
        bisasamBack26 = new Sprite(SPRITE_SIZE_BACK, 4, 3, bisasamBack);
        bisasamBack27 = new Sprite(SPRITE_SIZE_BACK, 5, 3, bisasamBack);
        bisasamBack28 = new Sprite(SPRITE_SIZE_BACK, 6, 3, bisasamBack);
        bisasamBack29 = new Sprite(SPRITE_SIZE_BACK, 0, 4, bisasamBack);
        bisasamBack30 = new Sprite(SPRITE_SIZE_BACK, 1, 4, bisasamBack);
        bisasamBack31 = new Sprite(SPRITE_SIZE_BACK, 2, 4, bisasamBack);
        bisasamBack32 = new Sprite(SPRITE_SIZE_BACK, 3, 4, bisasamBack);
        bisasamBack33 = new Sprite(SPRITE_SIZE_BACK, 4, 4, bisasamBack);
        bisasamBack34 = new Sprite(SPRITE_SIZE_BACK, 5, 4, bisasamBack);
        bisasamBack35 = new Sprite(SPRITE_SIZE_BACK, 6, 4, bisasamBack);
        bisasamBack36 = new Sprite(SPRITE_SIZE_BACK, 0, 5, bisasamBack);
        bisasamBack37 = new Sprite(SPRITE_SIZE_BACK, 1, 5, bisasamBack);
        bisasamBack38 = new Sprite(SPRITE_SIZE_BACK, 2, 5, bisasamBack);
        bisasamBack39 = new Sprite(SPRITE_SIZE_BACK, 3, 5, bisasamBack);
        bisasamBack40 = new Sprite(SPRITE_SIZE_BACK, 4, 5, bisasamBack);
        bisasamBack41 = new Sprite(SPRITE_SIZE_BACK, 5, 5, bisasamBack);
        bisasamBack42 = new Sprite(SPRITE_SIZE_BACK, 6, 5, bisasamBack);
        bisasamBack43 = new Sprite(SPRITE_SIZE_BACK, 0, 6, bisasamBack);
        bisasamBack44 = new Sprite(SPRITE_SIZE_BACK, 1, 6, bisasamBack);
        bisasamBack45 = new Sprite(SPRITE_SIZE_BACK, 2, 6, bisasamBack);

    }

    @Override
    protected void populateAttackList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
