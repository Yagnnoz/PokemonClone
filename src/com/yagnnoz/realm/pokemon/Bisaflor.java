package com.yagnnoz.realm.pokemon;

import com.yagnnoz.realm.graphics.Sprite;
import com.yagnnoz.realm.graphics.SpriteSheet;
import java.util.ArrayList;

/**
 *
 * @author Jens
 */
public class Bisaflor extends Pokemon {

    private final int SPRITE_SIZE_FRONT = 848;
    private final int SPRITE_SIZE_BACK = 760;

//<editor-fold desc="Sprites">
    public Sprite bisaflorFront1, bisaflorFront2, bisaflorFront3, bisaflorFront4,
            bisaflorFront5, bisaflorFront6, bisaflorFront7, bisaflorFront8,
            bisaflorFront9, bisaflorFront10, bisaflorFront11, bisaflorFront12,
            bisaflorFront13, bisaflorFront14, bisaflorFront15, bisaflorFront16,
            bisaflorFront17, bisaflorFront18, bisaflorFront19, bisaflorFront20,
            bisaflorFront21, bisaflorFront22, bisaflorFront23, bisaflorFront24,
            bisaflorFront25, bisaflorFront26, bisaflorFront27, bisaflorFront28,
            bisaflorFront29, bisaflorFront30, bisaflorFront31, bisaflorFront32,
            bisaflorFront33, bisaflorFront34, bisaflorFront35, bisaflorFront36,
            bisaflorFront37, bisaflorFront38, bisaflorFront39, bisaflorFront40,
            bisaflorFront41, bisaflorFront42, bisaflorFront43, bisaflorFront44,
            bisaflorFront45, bisaflorFront46, bisaflorFront47, bisaflorFront48,
            bisaflorFront49, bisaflorFront50, bisaflorFront51, bisaflorFront52,
            bisaflorFront53, bisaflorFront54, bisaflorFront55, bisaflorFront56,
            bisaflorFront57, bisaflorFront58, bisaflorFront59;

    public Sprite bisaflorBack1, bisaflorBack2, bisaflorBack3, bisaflorBack4,
            bisaflorBack5, bisaflorBack6, bisaflorBack7, bisaflorBack8,
            bisaflorBack9, bisaflorBack10, bisaflorBack11, bisaflorBack12,
            bisaflorBack13, bisaflorBack14, bisaflorBack15, bisaflorBack16,
            bisaflorBack17, bisaflorBack18, bisaflorBack19, bisaflorBack20,
            bisaflorBack21, bisaflorBack22, bisaflorBack23, bisaflorBack24,
            bisaflorBack25, bisaflorBack26, bisaflorBack27, bisaflorBack28,
            bisaflorBack29, bisaflorBack30, bisaflorBack31, bisaflorBack32,
            bisaflorBack33, bisaflorBack34, bisaflorBack35, bisaflorBack36,
            bisaflorBack37, bisaflorBack38, bisaflorBack39, bisaflorBack40,
            bisaflorBack41, bisaflorBack42, bisaflorBack43, bisaflorBack44,
            bisaflorBack45, bisaflorBack46, bisaflorBack47, bisaflorBack48,
            bisaflorBack49, bisaflorBack50, bisaflorBack51, bisaflorBack52,
            bisaflorBack53, bisaflorBack54, bisaflorBack55, bisaflorBack56,
            bisaflorBack57, bisaflorBack58, bisaflorBack59, bisaflorBack60,
            bisaflorBack61, bisaflorBack62, bisaflorBack63;
//</editor-fold>

    private SpriteSheet bisaflorFront;
    private SpriteSheet bisaflorBack;

    public Bisaflor(int level) {
        super(level);
        setName("Bisaflor");
        frontSprites = new ArrayList<>();
        backSprites = new ArrayList<>();

        setSprites();

        NUMBER_FRAMES_FRONT_ANIM = frontSprites.size();
        NUMBER_FRAMES_BACK_ANIM = backSprites.size();
    }

    @Override
    protected void initSprites() {
        bisaflorFront = new SpriteSheet("/PokemonSprites/BisaflorFront.png", 848);
        bisaflorBack = new SpriteSheet("/PokemonSprites/BisaflorBack.png", 760);

//----------------------------------------------------------------------------------------------------//
//--------------------------------------------- FRONT ------------------------------------------------//
//----------------------------------------------------------------------------------------------------//
        bisaflorFront1 = new Sprite(SPRITE_SIZE_FRONT, 0, 0, bisaflorFront);
        bisaflorFront2 = new Sprite(SPRITE_SIZE_FRONT, 1, 0, bisaflorFront);
        bisaflorFront3 = new Sprite(SPRITE_SIZE_FRONT, 2, 0, bisaflorFront);
        bisaflorFront4 = new Sprite(SPRITE_SIZE_FRONT, 3, 0, bisaflorFront);
        bisaflorFront5 = new Sprite(SPRITE_SIZE_FRONT, 4, 0, bisaflorFront);
        bisaflorFront6 = new Sprite(SPRITE_SIZE_FRONT, 5, 0, bisaflorFront);
        bisaflorFront7 = new Sprite(SPRITE_SIZE_FRONT, 6, 0, bisaflorFront);
        bisaflorFront8 = new Sprite(SPRITE_SIZE_FRONT, 7, 0, bisaflorFront);
        bisaflorFront9 = new Sprite(SPRITE_SIZE_FRONT, 0, 1, bisaflorFront);
        bisaflorFront10 = new Sprite(SPRITE_SIZE_FRONT, 1, 1, bisaflorFront);
        bisaflorFront11 = new Sprite(SPRITE_SIZE_FRONT, 2, 1, bisaflorFront);
        bisaflorFront12 = new Sprite(SPRITE_SIZE_FRONT, 3, 1, bisaflorFront);
        bisaflorFront13 = new Sprite(SPRITE_SIZE_FRONT, 4, 1, bisaflorFront);
        bisaflorFront14 = new Sprite(SPRITE_SIZE_FRONT, 5, 1, bisaflorFront);
        bisaflorFront15 = new Sprite(SPRITE_SIZE_FRONT, 6, 1, bisaflorFront);
        bisaflorFront16 = new Sprite(SPRITE_SIZE_FRONT, 7, 1, bisaflorFront);
        bisaflorFront17 = new Sprite(SPRITE_SIZE_FRONT, 0, 2, bisaflorFront);
        bisaflorFront18 = new Sprite(SPRITE_SIZE_FRONT, 1, 2, bisaflorFront);
        bisaflorFront19 = new Sprite(SPRITE_SIZE_FRONT, 2, 2, bisaflorFront);
        bisaflorFront20 = new Sprite(SPRITE_SIZE_FRONT, 3, 2, bisaflorFront);
        bisaflorFront21 = new Sprite(SPRITE_SIZE_FRONT, 4, 2, bisaflorFront);
        bisaflorFront22 = new Sprite(SPRITE_SIZE_FRONT, 5, 2, bisaflorFront);
        bisaflorFront23 = new Sprite(SPRITE_SIZE_FRONT, 6, 2, bisaflorFront);
        bisaflorFront24 = new Sprite(SPRITE_SIZE_FRONT, 7, 2, bisaflorFront);
        bisaflorFront25 = new Sprite(SPRITE_SIZE_FRONT, 0, 3, bisaflorFront);
        bisaflorFront26 = new Sprite(SPRITE_SIZE_FRONT, 1, 3, bisaflorFront);
        bisaflorFront27 = new Sprite(SPRITE_SIZE_FRONT, 2, 3, bisaflorFront);
        bisaflorFront28 = new Sprite(SPRITE_SIZE_FRONT, 3, 3, bisaflorFront);
        bisaflorFront29 = new Sprite(SPRITE_SIZE_FRONT, 4, 3, bisaflorFront);
        bisaflorFront30 = new Sprite(SPRITE_SIZE_FRONT, 5, 3, bisaflorFront);
        bisaflorFront31 = new Sprite(SPRITE_SIZE_FRONT, 6, 3, bisaflorFront);
        bisaflorFront32 = new Sprite(SPRITE_SIZE_FRONT, 7, 3, bisaflorFront);
        bisaflorFront33 = new Sprite(SPRITE_SIZE_FRONT, 0, 4, bisaflorFront);
        bisaflorFront34 = new Sprite(SPRITE_SIZE_FRONT, 1, 4, bisaflorFront);
        bisaflorFront35 = new Sprite(SPRITE_SIZE_FRONT, 2, 4, bisaflorFront);
        bisaflorFront36 = new Sprite(SPRITE_SIZE_FRONT, 3, 4, bisaflorFront);
        bisaflorFront37 = new Sprite(SPRITE_SIZE_FRONT, 4, 4, bisaflorFront);
        bisaflorFront38 = new Sprite(SPRITE_SIZE_FRONT, 5, 4, bisaflorFront);
        bisaflorFront39 = new Sprite(SPRITE_SIZE_FRONT, 6, 4, bisaflorFront);
        bisaflorFront40 = new Sprite(SPRITE_SIZE_FRONT, 7, 4, bisaflorFront);
        bisaflorFront41 = new Sprite(SPRITE_SIZE_FRONT, 0, 5, bisaflorFront);
        bisaflorFront42 = new Sprite(SPRITE_SIZE_FRONT, 1, 5, bisaflorFront);
        bisaflorFront43 = new Sprite(SPRITE_SIZE_FRONT, 2, 5, bisaflorFront);
        bisaflorFront44 = new Sprite(SPRITE_SIZE_FRONT, 3, 5, bisaflorFront);
        bisaflorFront45 = new Sprite(SPRITE_SIZE_FRONT, 4, 5, bisaflorFront);
        bisaflorFront46 = new Sprite(SPRITE_SIZE_FRONT, 5, 5, bisaflorFront);
        bisaflorFront47 = new Sprite(SPRITE_SIZE_FRONT, 6, 5, bisaflorFront);
        bisaflorFront48 = new Sprite(SPRITE_SIZE_FRONT, 7, 5, bisaflorFront);
        bisaflorFront49 = new Sprite(SPRITE_SIZE_FRONT, 0, 6, bisaflorFront);
        bisaflorFront50 = new Sprite(SPRITE_SIZE_FRONT, 1, 6, bisaflorFront);
        bisaflorFront51 = new Sprite(SPRITE_SIZE_FRONT, 2, 6, bisaflorFront);
        bisaflorFront52 = new Sprite(SPRITE_SIZE_FRONT, 3, 6, bisaflorFront);
        bisaflorFront53 = new Sprite(SPRITE_SIZE_FRONT, 4, 6, bisaflorFront);
        bisaflorFront54 = new Sprite(SPRITE_SIZE_FRONT, 5, 6, bisaflorFront);
        bisaflorFront55 = new Sprite(SPRITE_SIZE_FRONT, 6, 6, bisaflorFront);
        bisaflorFront56 = new Sprite(SPRITE_SIZE_FRONT, 7, 6, bisaflorFront);
        bisaflorFront57 = new Sprite(SPRITE_SIZE_FRONT, 0, 7, bisaflorFront);
        bisaflorFront58 = new Sprite(SPRITE_SIZE_FRONT, 1, 7, bisaflorFront);
        bisaflorFront59 = new Sprite(SPRITE_SIZE_FRONT, 2, 7, bisaflorFront);

//----------------------------------------------------------------------------------------------------//
//--------------------------------------------- BACK -------------------------------------------------//
//----------------------------------------------------------------------------------------------------//
        bisaflorBack1 = new Sprite(SPRITE_SIZE_BACK, 0, 0, bisaflorBack);
        bisaflorBack2 = new Sprite(SPRITE_SIZE_BACK, 1, 0, bisaflorBack);
        bisaflorBack3 = new Sprite(SPRITE_SIZE_BACK, 2, 0, bisaflorBack);
        bisaflorBack4 = new Sprite(SPRITE_SIZE_BACK, 3, 0, bisaflorBack);
        bisaflorBack5 = new Sprite(SPRITE_SIZE_BACK, 4, 0, bisaflorBack);
        bisaflorBack6 = new Sprite(SPRITE_SIZE_BACK, 5, 0, bisaflorBack);
        bisaflorBack7 = new Sprite(SPRITE_SIZE_BACK, 6, 0, bisaflorBack);
        bisaflorBack8 = new Sprite(SPRITE_SIZE_BACK, 7, 0, bisaflorBack);
        bisaflorBack9 = new Sprite(SPRITE_SIZE_BACK, 0, 1, bisaflorBack);
        bisaflorBack10 = new Sprite(SPRITE_SIZE_BACK, 1, 1, bisaflorBack);
        bisaflorBack11 = new Sprite(SPRITE_SIZE_BACK, 2, 1, bisaflorBack);
        bisaflorBack12 = new Sprite(SPRITE_SIZE_BACK, 3, 1, bisaflorBack);
        bisaflorBack13 = new Sprite(SPRITE_SIZE_BACK, 4, 1, bisaflorBack);
        bisaflorBack14 = new Sprite(SPRITE_SIZE_BACK, 5, 1, bisaflorBack);
        bisaflorBack15 = new Sprite(SPRITE_SIZE_BACK, 6, 1, bisaflorBack);
        bisaflorBack16 = new Sprite(SPRITE_SIZE_BACK, 7, 1, bisaflorBack);
        bisaflorBack17 = new Sprite(SPRITE_SIZE_BACK, 0, 2, bisaflorBack);
        bisaflorBack18 = new Sprite(SPRITE_SIZE_BACK, 1, 2, bisaflorBack);
        bisaflorBack19 = new Sprite(SPRITE_SIZE_BACK, 2, 2, bisaflorBack);
        bisaflorBack20 = new Sprite(SPRITE_SIZE_BACK, 3, 2, bisaflorBack);
        bisaflorBack21 = new Sprite(SPRITE_SIZE_BACK, 4, 2, bisaflorBack);
        bisaflorBack22 = new Sprite(SPRITE_SIZE_BACK, 5, 2, bisaflorBack);
        bisaflorBack23 = new Sprite(SPRITE_SIZE_BACK, 6, 2, bisaflorBack);
        bisaflorBack24 = new Sprite(SPRITE_SIZE_BACK, 7, 2, bisaflorBack);
        bisaflorBack25 = new Sprite(SPRITE_SIZE_BACK, 0, 3, bisaflorBack);
        bisaflorBack26 = new Sprite(SPRITE_SIZE_BACK, 1, 3, bisaflorBack);
        bisaflorBack27 = new Sprite(SPRITE_SIZE_BACK, 2, 3, bisaflorBack);
        bisaflorBack28 = new Sprite(SPRITE_SIZE_BACK, 3, 3, bisaflorBack);
        bisaflorBack29 = new Sprite(SPRITE_SIZE_BACK, 4, 3, bisaflorBack);
        bisaflorBack30 = new Sprite(SPRITE_SIZE_BACK, 5, 3, bisaflorBack);
        bisaflorBack31 = new Sprite(SPRITE_SIZE_BACK, 6, 3, bisaflorBack);
        bisaflorBack32 = new Sprite(SPRITE_SIZE_BACK, 7, 3, bisaflorBack);
        bisaflorBack33 = new Sprite(SPRITE_SIZE_BACK, 0, 4, bisaflorBack);
        bisaflorBack34 = new Sprite(SPRITE_SIZE_BACK, 1, 4, bisaflorBack);
        bisaflorBack35 = new Sprite(SPRITE_SIZE_BACK, 2, 4, bisaflorBack);
        bisaflorBack36 = new Sprite(SPRITE_SIZE_BACK, 3, 4, bisaflorBack);
        bisaflorBack37 = new Sprite(SPRITE_SIZE_BACK, 4, 4, bisaflorBack);
        bisaflorBack38 = new Sprite(SPRITE_SIZE_BACK, 5, 4, bisaflorBack);
        bisaflorBack39 = new Sprite(SPRITE_SIZE_BACK, 6, 4, bisaflorBack);
        bisaflorBack40 = new Sprite(SPRITE_SIZE_BACK, 7, 4, bisaflorBack);
        bisaflorBack41 = new Sprite(SPRITE_SIZE_BACK, 0, 5, bisaflorBack);
        bisaflorBack42 = new Sprite(SPRITE_SIZE_BACK, 1, 5, bisaflorBack);
        bisaflorBack43 = new Sprite(SPRITE_SIZE_BACK, 2, 5, bisaflorBack);
        bisaflorBack44 = new Sprite(SPRITE_SIZE_BACK, 3, 5, bisaflorBack);
        bisaflorBack45 = new Sprite(SPRITE_SIZE_BACK, 4, 5, bisaflorBack);
        bisaflorBack46 = new Sprite(SPRITE_SIZE_BACK, 5, 5, bisaflorBack);
        bisaflorBack47 = new Sprite(SPRITE_SIZE_BACK, 6, 5, bisaflorBack);
        bisaflorBack48 = new Sprite(SPRITE_SIZE_BACK, 7, 5, bisaflorBack);
        bisaflorBack49 = new Sprite(SPRITE_SIZE_BACK, 0, 6, bisaflorBack);
        bisaflorBack50 = new Sprite(SPRITE_SIZE_BACK, 1, 6, bisaflorBack);
        bisaflorBack51 = new Sprite(SPRITE_SIZE_BACK, 2, 6, bisaflorBack);
        bisaflorBack52 = new Sprite(SPRITE_SIZE_BACK, 3, 6, bisaflorBack);
        bisaflorBack53 = new Sprite(SPRITE_SIZE_BACK, 4, 6, bisaflorBack);
        bisaflorBack54 = new Sprite(SPRITE_SIZE_BACK, 5, 6, bisaflorBack);
        bisaflorBack55 = new Sprite(SPRITE_SIZE_BACK, 6, 6, bisaflorBack);
        bisaflorBack56 = new Sprite(SPRITE_SIZE_BACK, 7, 6, bisaflorBack);
        bisaflorBack57 = new Sprite(SPRITE_SIZE_BACK, 0, 7, bisaflorBack);
        bisaflorBack58 = new Sprite(SPRITE_SIZE_BACK, 1, 7, bisaflorBack);
        bisaflorBack59 = new Sprite(SPRITE_SIZE_BACK, 2, 7, bisaflorBack);
        bisaflorBack60 = new Sprite(SPRITE_SIZE_BACK, 3, 7, bisaflorBack);
        bisaflorBack61 = new Sprite(SPRITE_SIZE_BACK, 4, 7, bisaflorBack);
        bisaflorBack62 = new Sprite(SPRITE_SIZE_BACK, 5, 7, bisaflorBack);
        bisaflorBack63 = new Sprite(SPRITE_SIZE_BACK, 6, 7, bisaflorBack);

    }

    @Override
    protected void setFrontsprites() {
        frontSprites.add(bisaflorFront1);
        frontSprites.add(bisaflorFront2);
        frontSprites.add(bisaflorFront3);
        frontSprites.add(bisaflorFront4);
        frontSprites.add(bisaflorFront5);
        frontSprites.add(bisaflorFront6);
        frontSprites.add(bisaflorFront7);
        frontSprites.add(bisaflorFront8);
        frontSprites.add(bisaflorFront9);
        frontSprites.add(bisaflorFront10);
        frontSprites.add(bisaflorFront11);
        frontSprites.add(bisaflorFront12);
        frontSprites.add(bisaflorFront13);
        frontSprites.add(bisaflorFront14);
        frontSprites.add(bisaflorFront15);
        frontSprites.add(bisaflorFront16);
        frontSprites.add(bisaflorFront17);
        frontSprites.add(bisaflorFront18);
        frontSprites.add(bisaflorFront19);
        frontSprites.add(bisaflorFront20);
        frontSprites.add(bisaflorFront21);
        frontSprites.add(bisaflorFront22);
        frontSprites.add(bisaflorFront23);
        frontSprites.add(bisaflorFront24);
        frontSprites.add(bisaflorFront25);
        frontSprites.add(bisaflorFront26);
        frontSprites.add(bisaflorFront27);
        frontSprites.add(bisaflorFront28);
        frontSprites.add(bisaflorFront29);
        frontSprites.add(bisaflorFront30);
        frontSprites.add(bisaflorFront31);
        frontSprites.add(bisaflorFront32);
        frontSprites.add(bisaflorFront33);
        frontSprites.add(bisaflorFront34);
        frontSprites.add(bisaflorFront35);
        frontSprites.add(bisaflorFront36);
        frontSprites.add(bisaflorFront37);
        frontSprites.add(bisaflorFront38);
        frontSprites.add(bisaflorFront39);
        frontSprites.add(bisaflorFront40);
        frontSprites.add(bisaflorFront41);
        frontSprites.add(bisaflorFront42);
        frontSprites.add(bisaflorFront43);
        frontSprites.add(bisaflorFront44);
        frontSprites.add(bisaflorFront45);
        frontSprites.add(bisaflorFront46);
        frontSprites.add(bisaflorFront47);
        frontSprites.add(bisaflorFront48);
        frontSprites.add(bisaflorFront49);
        frontSprites.add(bisaflorFront50);
        frontSprites.add(bisaflorFront51);
        frontSprites.add(bisaflorFront52);
        frontSprites.add(bisaflorFront53);
        frontSprites.add(bisaflorFront54);
        frontSprites.add(bisaflorFront55);
        frontSprites.add(bisaflorFront56);
        frontSprites.add(bisaflorFront57);
        frontSprites.add(bisaflorFront58);
        frontSprites.add(bisaflorFront59);
    }

    @Override
    protected void setBacksprites() {
        backSprites.add(bisaflorBack1);
        backSprites.add(bisaflorBack2);
        backSprites.add(bisaflorBack3);
        backSprites.add(bisaflorBack4);
        backSprites.add(bisaflorBack5);
        backSprites.add(bisaflorBack6);
        backSprites.add(bisaflorBack7);
        backSprites.add(bisaflorBack8);
        backSprites.add(bisaflorBack9);
        backSprites.add(bisaflorBack10);
        backSprites.add(bisaflorBack11);
        backSprites.add(bisaflorBack12);
        backSprites.add(bisaflorBack13);
        backSprites.add(bisaflorBack14);
        backSprites.add(bisaflorBack15);
        backSprites.add(bisaflorBack16);
        backSprites.add(bisaflorBack17);
        backSprites.add(bisaflorBack18);
        backSprites.add(bisaflorBack19);
        backSprites.add(bisaflorBack20);
        backSprites.add(bisaflorBack21);
        backSprites.add(bisaflorBack22);
        backSprites.add(bisaflorBack23);
        backSprites.add(bisaflorBack24);
        backSprites.add(bisaflorBack25);
        backSprites.add(bisaflorBack26);
        backSprites.add(bisaflorBack27);
        backSprites.add(bisaflorBack28);
        backSprites.add(bisaflorBack29);
        backSprites.add(bisaflorBack30);
        backSprites.add(bisaflorBack31);
        backSprites.add(bisaflorBack32);
        backSprites.add(bisaflorBack33);
        backSprites.add(bisaflorBack34);
        backSprites.add(bisaflorBack35);
        backSprites.add(bisaflorBack36);
        backSprites.add(bisaflorBack37);
        backSprites.add(bisaflorBack38);
        backSprites.add(bisaflorBack39);
        backSprites.add(bisaflorBack40);
        backSprites.add(bisaflorBack41);
        backSprites.add(bisaflorBack42);
        backSprites.add(bisaflorBack43);
        backSprites.add(bisaflorBack44);
        backSprites.add(bisaflorBack45);
        backSprites.add(bisaflorBack46);
        backSprites.add(bisaflorBack47);
        backSprites.add(bisaflorBack48);
        backSprites.add(bisaflorBack49);
        backSprites.add(bisaflorBack50);
        backSprites.add(bisaflorBack51);
        backSprites.add(bisaflorBack52);
        backSprites.add(bisaflorBack53);
        backSprites.add(bisaflorBack54);
        backSprites.add(bisaflorBack55);
        backSprites.add(bisaflorBack56);
        backSprites.add(bisaflorBack57);
        backSprites.add(bisaflorBack58);
        backSprites.add(bisaflorBack59);
        backSprites.add(bisaflorBack60);
        backSprites.add(bisaflorBack61);
        backSprites.add(bisaflorBack62);
        backSprites.add(bisaflorBack63);
    }

    @Override
    protected void populateAttackList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
