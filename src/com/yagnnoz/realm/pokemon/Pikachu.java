package com.yagnnoz.realm.pokemon;

import com.yagnnoz.realm.graphics.Sprite;
import com.yagnnoz.realm.graphics.SpriteSheet;
import java.util.ArrayList;

/**
 *
 * @author Jens
 */
public class Pikachu extends Pokemon {

    private static final int SPRITE_SIZE = 64;

    //<editor-fold desc="Sprites">
    //---------------------------------------------------------------------------------------------------//
    //----------------------------------------- FRONT ---------------------------------------------------//
    //---------------------------------------------------------------------------------------------------//
    public static Sprite PikachuFront1 = new Sprite(SPRITE_SIZE, 0, 0, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront2 = new Sprite(SPRITE_SIZE, 1, 0, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront3 = new Sprite(SPRITE_SIZE, 2, 0, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront4 = new Sprite(SPRITE_SIZE, 3, 0, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront5 = new Sprite(SPRITE_SIZE, 4, 0, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront6 = new Sprite(SPRITE_SIZE, 5, 0, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront7 = new Sprite(SPRITE_SIZE, 6, 0, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront8 = new Sprite(SPRITE_SIZE, 7, 0, SpriteSheet.PikachuFront);

    public static Sprite PikachuFront9 = new Sprite(SPRITE_SIZE, 0, 1, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront10 = new Sprite(SPRITE_SIZE, 1, 1, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront11 = new Sprite(SPRITE_SIZE, 2, 1, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront12 = new Sprite(SPRITE_SIZE, 3, 1, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront13 = new Sprite(SPRITE_SIZE, 4, 1, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront14 = new Sprite(SPRITE_SIZE, 5, 1, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront15 = new Sprite(SPRITE_SIZE, 6, 1, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront16 = new Sprite(SPRITE_SIZE, 7, 1, SpriteSheet.PikachuFront);

    public static Sprite PikachuFront17 = new Sprite(SPRITE_SIZE, 0, 2, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront18 = new Sprite(SPRITE_SIZE, 1, 2, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront19 = new Sprite(SPRITE_SIZE, 2, 2, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront20 = new Sprite(SPRITE_SIZE, 3, 2, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront21 = new Sprite(SPRITE_SIZE, 4, 2, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront22 = new Sprite(SPRITE_SIZE, 5, 2, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront23 = new Sprite(SPRITE_SIZE, 6, 2, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront24 = new Sprite(SPRITE_SIZE, 7, 2, SpriteSheet.PikachuFront);

    public static Sprite PikachuFront25 = new Sprite(SPRITE_SIZE, 0, 3, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront26 = new Sprite(SPRITE_SIZE, 1, 3, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront27 = new Sprite(SPRITE_SIZE, 2, 3, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront28 = new Sprite(SPRITE_SIZE, 3, 3, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront29 = new Sprite(SPRITE_SIZE, 4, 3, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront30 = new Sprite(SPRITE_SIZE, 5, 3, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront31 = new Sprite(SPRITE_SIZE, 6, 3, SpriteSheet.PikachuFront);
    public static Sprite PikachuFront32 = new Sprite(SPRITE_SIZE, 7, 3, SpriteSheet.PikachuFront);

    public static Sprite PikachuFront33 = new Sprite(SPRITE_SIZE, 0, 4, SpriteSheet.PikachuFront);

    //----------------------------------------------------------------------------------------------------//
    //--------------------------------------------- BACK -------------------------------------------------//
    //----------------------------------------------------------------------------------------------------//
    public static Sprite PikachuBack1 = new Sprite(SPRITE_SIZE + 1, 0, 0, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack2 = new Sprite(SPRITE_SIZE + 1, 1, 0, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack3 = new Sprite(SPRITE_SIZE + 1, 2, 0, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack4 = new Sprite(SPRITE_SIZE + 1, 3, 0, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack5 = new Sprite(SPRITE_SIZE + 1, 4, 0, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack6 = new Sprite(SPRITE_SIZE + 1, 5, 0, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack7 = new Sprite(SPRITE_SIZE + 1, 6, 0, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack8 = new Sprite(SPRITE_SIZE + 1, 7, 0, SpriteSheet.PikachuBack);

    public static Sprite PikachuBack9 = new Sprite(SPRITE_SIZE + 1, 0, 1, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack10 = new Sprite(SPRITE_SIZE + 1, 1, 1, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack11 = new Sprite(SPRITE_SIZE + 1, 2, 1, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack12 = new Sprite(SPRITE_SIZE + 1, 3, 1, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack13 = new Sprite(SPRITE_SIZE + 1, 4, 1, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack14 = new Sprite(SPRITE_SIZE + 1, 5, 1, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack15 = new Sprite(SPRITE_SIZE + 1, 6, 1, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack16 = new Sprite(SPRITE_SIZE + 1, 7, 1, SpriteSheet.PikachuBack);

    public static Sprite PikachuBack17 = new Sprite(SPRITE_SIZE + 1, 0, 2, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack18 = new Sprite(SPRITE_SIZE + 1, 1, 2, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack19 = new Sprite(SPRITE_SIZE + 1, 2, 2, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack20 = new Sprite(SPRITE_SIZE + 1, 3, 2, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack21 = new Sprite(SPRITE_SIZE + 1, 4, 2, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack22 = new Sprite(SPRITE_SIZE + 1, 5, 2, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack23 = new Sprite(SPRITE_SIZE + 1, 6, 2, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack24 = new Sprite(SPRITE_SIZE + 1, 7, 2, SpriteSheet.PikachuBack);

    public static Sprite PikachuBack25 = new Sprite(SPRITE_SIZE + 1, 0, 3, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack26 = new Sprite(SPRITE_SIZE + 1, 1, 3, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack27 = new Sprite(SPRITE_SIZE + 1, 2, 3, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack28 = new Sprite(SPRITE_SIZE + 1, 3, 3, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack29 = new Sprite(SPRITE_SIZE + 1, 4, 3, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack30 = new Sprite(SPRITE_SIZE + 1, 5, 3, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack31 = new Sprite(SPRITE_SIZE + 1, 6, 3, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack32 = new Sprite(SPRITE_SIZE + 1, 7, 3, SpriteSheet.PikachuBack);

    public static Sprite PikachuBack33 = new Sprite(SPRITE_SIZE + 1, 0, 4, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack34 = new Sprite(SPRITE_SIZE + 1, 1, 4, SpriteSheet.PikachuBack);
    public static Sprite PikachuBack35 = new Sprite(SPRITE_SIZE + 1, 2, 4, SpriteSheet.PikachuBack);

    //</editor-fold>
    public Pikachu(int level) {
        super(level);
        setName("Pikachu");
        frontSprites = new ArrayList<>();
        backSprites = new ArrayList<>();

        setSprites();

        NUMBER_FRAMES_FRONT_ANIM = frontSprites.size();
        NUMBER_FRAMES_BACK_ANIM = backSprites.size();
    }

    @Override
    protected void setFrontsprites() {
        frontSprites.add(PikachuFront1);
        frontSprites.add(PikachuFront2);
        frontSprites.add(PikachuFront3);
        frontSprites.add(PikachuFront4);
        frontSprites.add(PikachuFront5);
        frontSprites.add(PikachuFront6);
        frontSprites.add(PikachuFront7);
        frontSprites.add(PikachuFront8);
        frontSprites.add(PikachuFront9);
        frontSprites.add(PikachuFront10);
        frontSprites.add(PikachuFront11);
        frontSprites.add(PikachuFront12);
        frontSprites.add(PikachuFront13);
        frontSprites.add(PikachuFront14);
        frontSprites.add(PikachuFront15);
        frontSprites.add(PikachuFront16);
        frontSprites.add(PikachuFront17);
        frontSprites.add(PikachuFront18);
        frontSprites.add(PikachuFront19);
        frontSprites.add(PikachuFront20);
        frontSprites.add(PikachuFront21);
        frontSprites.add(PikachuFront22);
        frontSprites.add(PikachuFront23);
        frontSprites.add(PikachuFront24);
        frontSprites.add(PikachuFront25);
        frontSprites.add(PikachuFront26);
        frontSprites.add(PikachuFront27);
        frontSprites.add(PikachuFront28);
        frontSprites.add(PikachuFront29);
        frontSprites.add(PikachuFront30);
        frontSprites.add(PikachuFront31);
        frontSprites.add(PikachuFront32);
        frontSprites.add(PikachuFront33);

    }

    @Override
    protected void setBacksprites() {
        backSprites.add(PikachuBack1);
        backSprites.add(PikachuBack2);
        backSprites.add(PikachuBack3);
        backSprites.add(PikachuBack4);
        backSprites.add(PikachuBack5);
        backSprites.add(PikachuBack6);
        backSprites.add(PikachuBack7);
        backSprites.add(PikachuBack8);
        backSprites.add(PikachuBack9);
        backSprites.add(PikachuBack10);
        backSprites.add(PikachuBack11);
        backSprites.add(PikachuBack12);
        backSprites.add(PikachuBack13);
        backSprites.add(PikachuBack14);
        backSprites.add(PikachuBack15);
        backSprites.add(PikachuBack16);
        backSprites.add(PikachuBack17);
        backSprites.add(PikachuBack18);
        backSprites.add(PikachuBack19);
        backSprites.add(PikachuBack20);
        backSprites.add(PikachuBack21);
        backSprites.add(PikachuBack22);
        backSprites.add(PikachuBack23);
        backSprites.add(PikachuBack24);
        backSprites.add(PikachuBack25);
        backSprites.add(PikachuBack26);
        backSprites.add(PikachuBack27);
        backSprites.add(PikachuBack28);
        backSprites.add(PikachuBack29);
        backSprites.add(PikachuBack30);
        backSprites.add(PikachuBack31);
        backSprites.add(PikachuBack32);
        backSprites.add(PikachuBack33);
        backSprites.add(PikachuBack34);
        backSprites.add(PikachuBack35);
    }

    @Override
    protected void initSprites() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void populateAttackList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
