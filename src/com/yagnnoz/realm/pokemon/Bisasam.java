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
    public Sprite BisasamFront1, BisasamFront2, BisasamFront3, BisasamFront4,
            BisasamFront5, BisasamFront6, BisasamFront7, BisasamFront8,
            BisasamFront9, BisasamFront10, BisasamFront11, BisasamFront12,
            BisasamFront13, BisasamFront14, BisasamFront15, BisasamFront16,
            BisasamFront17, BisasamFront18, BisasamFront19, BisasamFront20,
            BisasamFront21, BisasamFront22, BisasamFront23, BisasamFront24,
            BisasamFront25, BisasamFront26, BisasamFront27, BisasamFront28,
            BisasamFront29, BisasamFront30, BisasamFront31, BisasamFront32,
            BisasamFront33, BisasamFront34, BisasamFront35, BisasamFront36,
            BisasamFront37, BisasamFront38, BisasamFront39, BisasamFront40,
            BisasamFront41;
    
    public Sprite BisasamBack1, BisasamBack2, BisasamBack3, BisasamBack4,
            BisasamBack5, BisasamBack6, BisasamBack7, BisasamBack8,
            BisasamBack9, BisasamBack10, BisasamBack11, BisasamBack12, 
            BisasamBack13, BisasamBack14, BisasamBack15, BisasamBack16,
            BisasamBack17, BisasamBack18, BisasamBack19, BisasamBack20,
            BisasamBack21, BisasamBack22, BisasamBack23, BisasamBack24,
            BisasamBack25, BisasamBack26, BisasamBack27, BisasamBack28,
            BisasamBack29, BisasamBack30, BisasamBack31, BisasamBack32,
            BisasamBack33, BisasamBack34, BisasamBack35, BisasamBack36,
            BisasamBack37, BisasamBack38, BisasamBack39, BisasamBack40,
            BisasamBack41, BisasamBack42, BisasamBack43, BisasamBack44,
            BisasamBack45;
    //</editor-fold>
    
    public SpriteSheet BisasamFront;
    public SpriteSheet BisasamBack;

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
        frontSprites.add(BisasamFront1);
        frontSprites.add(BisasamFront2);
        frontSprites.add(BisasamFront3);
        frontSprites.add(BisasamFront4);
        frontSprites.add(BisasamFront5);
        frontSprites.add(BisasamFront6);
        frontSprites.add(BisasamFront7);
        frontSprites.add(BisasamFront8);
        frontSprites.add(BisasamFront9);

        frontSprites.add(BisasamFront10);
        frontSprites.add(BisasamFront11);
        frontSprites.add(BisasamFront12);
        frontSprites.add(BisasamFront13);
        frontSprites.add(BisasamFront14);
        frontSprites.add(BisasamFront15);
        frontSprites.add(BisasamFront16);
        frontSprites.add(BisasamFront17);
        frontSprites.add(BisasamFront18);
        frontSprites.add(BisasamFront19);

        frontSprites.add(BisasamFront20);
        frontSprites.add(BisasamFront21);
        frontSprites.add(BisasamFront22);
        frontSprites.add(BisasamFront23);
        frontSprites.add(BisasamFront24);
        frontSprites.add(BisasamFront25);
        frontSprites.add(BisasamFront26);
        frontSprites.add(BisasamFront27);
        frontSprites.add(BisasamFront28);
        frontSprites.add(BisasamFront29);

        frontSprites.add(BisasamFront30);
        frontSprites.add(BisasamFront31);
        frontSprites.add(BisasamFront32);
        frontSprites.add(BisasamFront33);
        frontSprites.add(BisasamFront34);
        frontSprites.add(BisasamFront35);
        frontSprites.add(BisasamFront36);
        frontSprites.add(BisasamFront37);
        frontSprites.add(BisasamFront38);
        frontSprites.add(BisasamFront39);

        frontSprites.add(BisasamFront40);
        frontSprites.add(BisasamFront41);
    }

    @Override
    protected void setBacksprites() {
        backSprites.add(BisasamBack1);
        backSprites.add(BisasamBack2);
        backSprites.add(BisasamBack3);
        backSprites.add(BisasamBack4);
        backSprites.add(BisasamBack5);
        backSprites.add(BisasamBack6);
        backSprites.add(BisasamBack7);
        backSprites.add(BisasamBack8);
        backSprites.add(BisasamBack9);
        backSprites.add(BisasamBack10);
        backSprites.add(BisasamBack11);
        backSprites.add(BisasamBack12);
        backSprites.add(BisasamBack13);
        backSprites.add(BisasamBack14);
        backSprites.add(BisasamBack15);
        backSprites.add(BisasamBack16);
        backSprites.add(BisasamBack17);
        backSprites.add(BisasamBack18);
        backSprites.add(BisasamBack19);
        backSprites.add(BisasamBack20);
        backSprites.add(BisasamBack21);
        backSprites.add(BisasamBack22);
        backSprites.add(BisasamBack23);
        backSprites.add(BisasamBack24);
        backSprites.add(BisasamBack25);
        backSprites.add(BisasamBack26);
        backSprites.add(BisasamBack27);
        backSprites.add(BisasamBack28);
        backSprites.add(BisasamBack29);
        backSprites.add(BisasamBack30);
        backSprites.add(BisasamBack31);
        backSprites.add(BisasamBack32);
        backSprites.add(BisasamBack33);
        backSprites.add(BisasamBack34);
        backSprites.add(BisasamBack35);
        backSprites.add(BisasamBack36);
        backSprites.add(BisasamBack37);
        backSprites.add(BisasamBack38);
        backSprites.add(BisasamBack39);
        backSprites.add(BisasamBack40);
        backSprites.add(BisasamBack41);
        backSprites.add(BisasamBack42);
        backSprites.add(BisasamBack43);
        backSprites.add(BisasamBack44);
        backSprites.add(BisasamBack45);
    }

    @Override
    protected void initSprites() {
        BisasamFront = new SpriteSheet("/PokemonSprites/BisasamFront.png", 343);
        BisasamBack = new SpriteSheet("/PokemonSprites/BisasamBack.png", 364);
    //---------------------------------------------------------------------------------------------------//
    //----------------------------------------- FRONT ---------------------------------------------------//
    //---------------------------------------------------------------------------------------------------//
        BisasamFront1 = new Sprite(SPRITE_SIZE_FRONT, 0, 0, BisasamFront);
        BisasamFront2 = new Sprite(SPRITE_SIZE_FRONT, 1, 0, BisasamFront);
        BisasamFront3 = new Sprite(SPRITE_SIZE_FRONT, 2, 0, BisasamFront);
        BisasamFront4 = new Sprite(SPRITE_SIZE_FRONT, 3, 0, BisasamFront);
        BisasamFront5 = new Sprite(SPRITE_SIZE_FRONT, 4, 0, BisasamFront);
        BisasamFront6 = new Sprite(SPRITE_SIZE_FRONT, 5, 0, BisasamFront);
        BisasamFront7 = new Sprite(SPRITE_SIZE_FRONT, 6, 0, BisasamFront);
        BisasamFront8 = new Sprite(SPRITE_SIZE_FRONT, 0, 1, BisasamFront);
        BisasamFront9 = new Sprite(SPRITE_SIZE_FRONT, 1, 1, BisasamFront);
        BisasamFront10 = new Sprite(SPRITE_SIZE_FRONT, 2, 1, BisasamFront);
        BisasamFront11 = new Sprite(SPRITE_SIZE_FRONT, 3, 1, BisasamFront);
        BisasamFront12 = new Sprite(SPRITE_SIZE_FRONT, 4, 1, BisasamFront);
        BisasamFront13 = new Sprite(SPRITE_SIZE_FRONT, 5, 1, BisasamFront);
        BisasamFront14 = new Sprite(SPRITE_SIZE_FRONT, 6, 1, BisasamFront);
        BisasamFront15 = new Sprite(SPRITE_SIZE_FRONT, 0, 2, BisasamFront);
        BisasamFront16 = new Sprite(SPRITE_SIZE_FRONT, 1, 2, BisasamFront);
        BisasamFront17 = new Sprite(SPRITE_SIZE_FRONT, 2, 2, BisasamFront);
        BisasamFront18 = new Sprite(SPRITE_SIZE_FRONT, 3, 2, BisasamFront);
        BisasamFront19 = new Sprite(SPRITE_SIZE_FRONT, 4, 2, BisasamFront);
        BisasamFront20 = new Sprite(SPRITE_SIZE_FRONT, 5, 2, BisasamFront);
        BisasamFront21 = new Sprite(SPRITE_SIZE_FRONT, 6, 2, BisasamFront);
        BisasamFront22 = new Sprite(SPRITE_SIZE_FRONT, 0, 3, BisasamFront);
        BisasamFront23 = new Sprite(SPRITE_SIZE_FRONT, 1, 3, BisasamFront);
        BisasamFront24 = new Sprite(SPRITE_SIZE_FRONT, 2, 3, BisasamFront);
        BisasamFront25 = new Sprite(SPRITE_SIZE_FRONT, 3, 3, BisasamFront);
        BisasamFront26 = new Sprite(SPRITE_SIZE_FRONT, 4, 3, BisasamFront);
        BisasamFront27 = new Sprite(SPRITE_SIZE_FRONT, 5, 3, BisasamFront);
        BisasamFront28 = new Sprite(SPRITE_SIZE_FRONT, 6, 3, BisasamFront);
        BisasamFront29 = new Sprite(SPRITE_SIZE_FRONT, 0, 4, BisasamFront);
        BisasamFront30 = new Sprite(SPRITE_SIZE_FRONT, 1, 4, BisasamFront);
        BisasamFront31 = new Sprite(SPRITE_SIZE_FRONT, 2, 4, BisasamFront);
        BisasamFront32 = new Sprite(SPRITE_SIZE_FRONT, 3, 4, BisasamFront);
        BisasamFront33 = new Sprite(SPRITE_SIZE_FRONT, 4, 4, BisasamFront);
        BisasamFront34 = new Sprite(SPRITE_SIZE_FRONT, 5, 4, BisasamFront);
        BisasamFront35 = new Sprite(SPRITE_SIZE_FRONT, 6, 4, BisasamFront);
        BisasamFront36 = new Sprite(SPRITE_SIZE_FRONT, 0, 5, BisasamFront);
        BisasamFront37 = new Sprite(SPRITE_SIZE_FRONT, 1, 5, BisasamFront);
        BisasamFront38 = new Sprite(SPRITE_SIZE_FRONT, 2, 5, BisasamFront);
        BisasamFront39 = new Sprite(SPRITE_SIZE_FRONT, 3, 5, BisasamFront);
        BisasamFront40 = new Sprite(SPRITE_SIZE_FRONT, 4, 5, BisasamFront);
        BisasamFront41 = new Sprite(SPRITE_SIZE_FRONT, 5, 5, BisasamFront);
        
    //----------------------------------------------------------------------------------------------------//
    //--------------------------------------------- BACK -------------------------------------------------//
    //----------------------------------------------------------------------------------------------------//
        BisasamBack1 = new Sprite(SPRITE_SIZE_BACK, 0, 0, BisasamBack);
        BisasamBack2 = new Sprite(SPRITE_SIZE_BACK, 1, 0, BisasamBack);
        BisasamBack3 = new Sprite(SPRITE_SIZE_BACK, 2, 0, BisasamBack);
        BisasamBack4 = new Sprite(SPRITE_SIZE_BACK, 3, 0, BisasamBack);
        BisasamBack5 = new Sprite(SPRITE_SIZE_BACK, 4, 0, BisasamBack);
        BisasamBack6 = new Sprite(SPRITE_SIZE_BACK, 5, 0, BisasamBack);
        BisasamBack7 = new Sprite(SPRITE_SIZE_BACK, 6, 0, BisasamBack);
        BisasamBack8 = new Sprite(SPRITE_SIZE_BACK, 0, 1, BisasamBack);
        BisasamBack9 = new Sprite(SPRITE_SIZE_BACK, 1, 1, BisasamBack);
        BisasamBack10 = new Sprite(SPRITE_SIZE_BACK, 2, 1, BisasamBack);
        BisasamBack11 = new Sprite(SPRITE_SIZE_BACK, 3, 1, BisasamBack);
        BisasamBack12 = new Sprite(SPRITE_SIZE_BACK, 4, 1, BisasamBack);
        BisasamBack13 = new Sprite(SPRITE_SIZE_BACK, 5, 1, BisasamBack);
        BisasamBack14 = new Sprite(SPRITE_SIZE_BACK, 6, 1, BisasamBack);
        BisasamBack15 = new Sprite(SPRITE_SIZE_BACK, 0, 2, BisasamBack);
        BisasamBack16 = new Sprite(SPRITE_SIZE_BACK, 1, 2, BisasamBack);
        BisasamBack17 = new Sprite(SPRITE_SIZE_BACK, 2, 2, BisasamBack);
        BisasamBack18 = new Sprite(SPRITE_SIZE_BACK, 3, 2, BisasamBack);
        BisasamBack19 = new Sprite(SPRITE_SIZE_BACK, 4, 2, BisasamBack);
        BisasamBack20 = new Sprite(SPRITE_SIZE_BACK, 5, 2, BisasamBack);
        BisasamBack21 = new Sprite(SPRITE_SIZE_BACK, 6, 2, BisasamBack);
        BisasamBack22 = new Sprite(SPRITE_SIZE_BACK, 0, 3, BisasamBack);
        BisasamBack23 = new Sprite(SPRITE_SIZE_BACK, 1, 3, BisasamBack);
        BisasamBack24 = new Sprite(SPRITE_SIZE_BACK, 2, 3, BisasamBack);
        BisasamBack25 = new Sprite(SPRITE_SIZE_BACK, 3, 3, BisasamBack);
        BisasamBack26 = new Sprite(SPRITE_SIZE_BACK, 4, 3, BisasamBack);
        BisasamBack27 = new Sprite(SPRITE_SIZE_BACK, 5, 3, BisasamBack);
        BisasamBack28 = new Sprite(SPRITE_SIZE_BACK, 6, 3, BisasamBack);
        BisasamBack29 = new Sprite(SPRITE_SIZE_BACK, 0, 4, BisasamBack);
        BisasamBack30 = new Sprite(SPRITE_SIZE_BACK, 1, 4, BisasamBack);
        BisasamBack31 = new Sprite(SPRITE_SIZE_BACK, 2, 4, BisasamBack);
        BisasamBack32 = new Sprite(SPRITE_SIZE_BACK, 3, 4, BisasamBack);
        BisasamBack33 = new Sprite(SPRITE_SIZE_BACK, 4, 4, BisasamBack);
        BisasamBack34 = new Sprite(SPRITE_SIZE_BACK, 5, 4, BisasamBack);
        BisasamBack35 = new Sprite(SPRITE_SIZE_BACK, 6, 4, BisasamBack);
        BisasamBack36 = new Sprite(SPRITE_SIZE_BACK, 0, 5, BisasamBack);
        BisasamBack37 = new Sprite(SPRITE_SIZE_BACK, 1, 5, BisasamBack);
        BisasamBack38 = new Sprite(SPRITE_SIZE_BACK, 2, 5, BisasamBack);
        BisasamBack39 = new Sprite(SPRITE_SIZE_BACK, 3, 5, BisasamBack);
        BisasamBack40 = new Sprite(SPRITE_SIZE_BACK, 4, 5, BisasamBack);
        BisasamBack41 = new Sprite(SPRITE_SIZE_BACK, 5, 5, BisasamBack);
        BisasamBack42 = new Sprite(SPRITE_SIZE_BACK, 6, 5, BisasamBack);
        BisasamBack43 = new Sprite(SPRITE_SIZE_BACK, 0, 6, BisasamBack);
        BisasamBack44 = new Sprite(SPRITE_SIZE_BACK, 1, 6, BisasamBack);
        BisasamBack45 = new Sprite(SPRITE_SIZE_BACK, 2, 6, BisasamBack);
        
        

    }

}
