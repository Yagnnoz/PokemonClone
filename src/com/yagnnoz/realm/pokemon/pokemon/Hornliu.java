package com.yagnnoz.realm.pokemon.pokemon;

import com.yagnnoz.realm.pokemon.mechanics.Pokemon;
import com.yagnnoz.realm.graphics.Sprite;
import com.yagnnoz.realm.graphics.SpriteSheet;
import com.yagnnoz.realm.pokemon.attacken.Mechanics.AttackenEntry;
import java.util.ArrayList;

/**
 *
 * @author Jens
 */
public final class Hornliu extends Pokemon {

    private static final int SPRITE_SIZE = 64;

    //<editor-fold desc="Sprites">
    //---------------------------------------------------------------------------------------------------//
    //----------------------------------------- FRONT ---------------------------------------------------//
    //---------------------------------------------------------------------------------------------------//
    public Sprite hornliuFront1, hornliuFront2, hornliuFront3, hornliuFront4,
            hornliuFront5, hornliuFront6, hornliuFront7, hornliuFront8,
            hornliuFront9, hornliuFront10, hornliuFront11, hornliuFront12,
            hornliuFront13, hornliuFront14, hornliuFront15, hornliuFront16,
            hornliuFront17, hornliuFront18, hornliuFront19, hornliuFront20,
            hornliuFront21, hornliuFront22, hornliuFront23, hornliuFront24,
            hornliuFront25, hornliuFront26, hornliuFront27, hornliuFront28,
            hornliuFront29, hornliuFront30, hornliuFront31, hornliuFront32,
            hornliuFront33, hornliuFront34, hornliuFront35, hornliuFront36,
            hornliuFront37, hornliuFront38, hornliuFront39, hornliuFront40,
            hornliuFront41, hornliuFront42, hornliuFront43, hornliuFront44,
            hornliuFront45, hornliuFront46, hornliuFront47, hornliuFront48,
            hornliuFront49, hornliuFront50, hornliuFront51, hornliuFront52,
            hornliuFront53, hornliuFront54, hornliuFront55, hornliuFront56,
            hornliuFront57, hornliuFront58, hornliuFront59;

    //----------------------------------------------------------------------------------------------------//
    //--------------------------------------------- BACK -------------------------------------------------//
    //----------------------------------------------------------------------------------------------------//
    public static Sprite hornliuBack1 = new Sprite(SPRITE_SIZE, 0, 0, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack2 = new Sprite(SPRITE_SIZE, 1, 0, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack3 = new Sprite(SPRITE_SIZE, 2, 0, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack4 = new Sprite(SPRITE_SIZE, 3, 0, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack5 = new Sprite(SPRITE_SIZE, 4, 0, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack6 = new Sprite(SPRITE_SIZE, 5, 0, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack7 = new Sprite(SPRITE_SIZE, 6, 0, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack8 = new Sprite(SPRITE_SIZE, 7, 0, SpriteSheet.HornliuBack);

    public static Sprite hornliuBack9 = new Sprite(SPRITE_SIZE, 0, 1, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack10 = new Sprite(SPRITE_SIZE, 1, 1, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack11 = new Sprite(SPRITE_SIZE, 2, 1, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack12 = new Sprite(SPRITE_SIZE, 3, 1, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack13 = new Sprite(SPRITE_SIZE, 4, 1, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack14 = new Sprite(SPRITE_SIZE, 5, 1, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack15 = new Sprite(SPRITE_SIZE, 6, 1, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack16 = new Sprite(SPRITE_SIZE, 7, 1, SpriteSheet.HornliuBack);

    public static Sprite hornliuBack17 = new Sprite(SPRITE_SIZE, 0, 2, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack18 = new Sprite(SPRITE_SIZE, 1, 2, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack19 = new Sprite(SPRITE_SIZE, 2, 2, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack20 = new Sprite(SPRITE_SIZE, 3, 2, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack21 = new Sprite(SPRITE_SIZE, 4, 2, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack22 = new Sprite(SPRITE_SIZE, 5, 2, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack23 = new Sprite(SPRITE_SIZE, 6, 2, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack24 = new Sprite(SPRITE_SIZE, 7, 2, SpriteSheet.HornliuBack);

    public static Sprite hornliuBack25 = new Sprite(SPRITE_SIZE, 0, 3, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack26 = new Sprite(SPRITE_SIZE, 1, 3, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack27 = new Sprite(SPRITE_SIZE, 2, 3, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack28 = new Sprite(SPRITE_SIZE, 3, 3, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack29 = new Sprite(SPRITE_SIZE, 4, 3, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack30 = new Sprite(SPRITE_SIZE, 5, 3, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack31 = new Sprite(SPRITE_SIZE, 6, 3, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack32 = new Sprite(SPRITE_SIZE, 7, 3, SpriteSheet.HornliuBack);

    public static Sprite hornliuBack33 = new Sprite(SPRITE_SIZE, 0, 4, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack34 = new Sprite(SPRITE_SIZE, 1, 4, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack35 = new Sprite(SPRITE_SIZE, 2, 4, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack36 = new Sprite(SPRITE_SIZE, 3, 4, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack37 = new Sprite(SPRITE_SIZE, 4, 4, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack38 = new Sprite(SPRITE_SIZE, 5, 4, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack39 = new Sprite(SPRITE_SIZE, 6, 4, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack40 = new Sprite(SPRITE_SIZE, 7, 4, SpriteSheet.HornliuBack);

    public static Sprite hornliuBack41 = new Sprite(SPRITE_SIZE, 0, 5, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack42 = new Sprite(SPRITE_SIZE, 1, 5, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack43 = new Sprite(SPRITE_SIZE, 2, 5, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack44 = new Sprite(SPRITE_SIZE, 3, 5, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack45 = new Sprite(SPRITE_SIZE, 4, 5, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack46 = new Sprite(SPRITE_SIZE, 5, 5, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack47 = new Sprite(SPRITE_SIZE, 6, 5, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack48 = new Sprite(SPRITE_SIZE, 7, 5, SpriteSheet.HornliuBack);

    public static Sprite hornliuBack49 = new Sprite(SPRITE_SIZE, 0, 6, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack50 = new Sprite(SPRITE_SIZE, 1, 6, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack51 = new Sprite(SPRITE_SIZE, 2, 6, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack52 = new Sprite(SPRITE_SIZE, 3, 6, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack53 = new Sprite(SPRITE_SIZE, 4, 6, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack54 = new Sprite(SPRITE_SIZE, 5, 6, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack55 = new Sprite(SPRITE_SIZE, 6, 6, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack56 = new Sprite(SPRITE_SIZE, 7, 6, SpriteSheet.HornliuBack);

    public static Sprite hornliuBack57 = new Sprite(SPRITE_SIZE, 0, 7, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack58 = new Sprite(SPRITE_SIZE, 1, 7, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack59 = new Sprite(SPRITE_SIZE, 2, 7, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack60 = new Sprite(SPRITE_SIZE, 3, 7, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack61 = new Sprite(SPRITE_SIZE, 4, 7, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack62 = new Sprite(SPRITE_SIZE, 5, 7, SpriteSheet.HornliuBack);
    public static Sprite hornliuBack63 = new Sprite(SPRITE_SIZE, 6, 7, SpriteSheet.HornliuBack);

    //</editor-fold>
    public Hornliu(int level) {
        super(level);
        setName("Hornliu");
        frontSprites = new ArrayList<>();
        backSprites = new ArrayList<>();
        setSprites();

        NUMBER_FRAMES_FRONT_ANIM = frontSprites.size();
        NUMBER_FRAMES_BACK_ANIM = backSprites.size();
        populateAttackList();
        setAttacks(level);
    }

    @Override
    protected void setFrontsprites() {
        frontSprites.add(hornliuFront1);
        frontSprites.add(hornliuFront2);
        frontSprites.add(hornliuFront3);
        frontSprites.add(hornliuFront4);
        frontSprites.add(hornliuFront5);
        frontSprites.add(hornliuFront6);
        frontSprites.add(hornliuFront7);
        frontSprites.add(hornliuFront8);
        frontSprites.add(hornliuFront9);
        frontSprites.add(hornliuFront10);
        frontSprites.add(hornliuFront11);
        frontSprites.add(hornliuFront12);
        frontSprites.add(hornliuFront13);
        frontSprites.add(hornliuFront14);
        frontSprites.add(hornliuFront15);
        frontSprites.add(hornliuFront16);
        frontSprites.add(hornliuFront17);
        frontSprites.add(hornliuFront18);
        frontSprites.add(hornliuFront19);
        frontSprites.add(hornliuFront20);
        frontSprites.add(hornliuFront21);
        frontSprites.add(hornliuFront22);
        frontSprites.add(hornliuFront23);
        frontSprites.add(hornliuFront24);
        frontSprites.add(hornliuFront25);
        frontSprites.add(hornliuFront26);
        frontSprites.add(hornliuFront27);
        frontSprites.add(hornliuFront28);
        frontSprites.add(hornliuFront29);
        frontSprites.add(hornliuFront30);
        frontSprites.add(hornliuFront31);
        frontSprites.add(hornliuFront32);
        frontSprites.add(hornliuFront33);
        frontSprites.add(hornliuFront34);
        frontSprites.add(hornliuFront35);
        frontSprites.add(hornliuFront36);
        frontSprites.add(hornliuFront37);
        frontSprites.add(hornliuFront38);
        frontSprites.add(hornliuFront39);
        frontSprites.add(hornliuFront40);
        frontSprites.add(hornliuFront41);
        frontSprites.add(hornliuFront42);
        frontSprites.add(hornliuFront43);
        frontSprites.add(hornliuFront44);
        frontSprites.add(hornliuFront45);
        frontSprites.add(hornliuFront46);
        frontSprites.add(hornliuFront47);
        frontSprites.add(hornliuFront48);
        frontSprites.add(hornliuFront49);
        frontSprites.add(hornliuFront50);
        frontSprites.add(hornliuFront51);
        frontSprites.add(hornliuFront52);
        frontSprites.add(hornliuFront53);
        frontSprites.add(hornliuFront54);
        frontSprites.add(hornliuFront55);
        frontSprites.add(hornliuFront56);
        frontSprites.add(hornliuFront57);
        frontSprites.add(hornliuFront58);
        frontSprites.add(hornliuFront59);
    }

    @Override
    protected void setBacksprites() {
        backSprites.add(hornliuBack1);
        backSprites.add(hornliuBack2);
        backSprites.add(hornliuBack3);
        backSprites.add(hornliuBack4);
        backSprites.add(hornliuBack5);
        backSprites.add(hornliuBack6);
        backSprites.add(hornliuBack7);
        backSprites.add(hornliuBack8);
        backSprites.add(hornliuBack9);
        backSprites.add(hornliuBack10);
        backSprites.add(hornliuBack11);
        backSprites.add(hornliuBack12);
        backSprites.add(hornliuBack13);
        backSprites.add(hornliuBack14);
        backSprites.add(hornliuBack15);
        backSprites.add(hornliuBack16);
        backSprites.add(hornliuBack17);
        backSprites.add(hornliuBack18);
        backSprites.add(hornliuBack19);
        backSprites.add(hornliuBack20);
        backSprites.add(hornliuBack21);
        backSprites.add(hornliuBack22);
        backSprites.add(hornliuBack23);
        backSprites.add(hornliuBack24);
        backSprites.add(hornliuBack25);
        backSprites.add(hornliuBack26);
        backSprites.add(hornliuBack27);
        backSprites.add(hornliuBack28);
        backSprites.add(hornliuBack29);
        backSprites.add(hornliuBack30);
        backSprites.add(hornliuBack30);
        backSprites.add(hornliuBack31);
        backSprites.add(hornliuBack32);
        backSprites.add(hornliuBack33);
        backSprites.add(hornliuBack34);
        backSprites.add(hornliuBack35);
        backSprites.add(hornliuBack36);
        backSprites.add(hornliuBack37);
        backSprites.add(hornliuBack38);
        backSprites.add(hornliuBack40);
        backSprites.add(hornliuBack41);
        backSprites.add(hornliuBack42);
        backSprites.add(hornliuBack43);
        backSprites.add(hornliuBack44);
        backSprites.add(hornliuBack45);
        backSprites.add(hornliuBack46);
        backSprites.add(hornliuBack47);
        backSprites.add(hornliuBack48);
        backSprites.add(hornliuBack49);
        backSprites.add(hornliuBack50);
        backSprites.add(hornliuBack51);
        backSprites.add(hornliuBack52);
        backSprites.add(hornliuBack53);
        backSprites.add(hornliuBack54);
        backSprites.add(hornliuBack55);
        backSprites.add(hornliuBack56);
        backSprites.add(hornliuBack57);
        backSprites.add(hornliuBack58);
        backSprites.add(hornliuBack59);
        backSprites.add(hornliuBack60);
        backSprites.add(hornliuBack61);
        backSprites.add(hornliuBack62);
        backSprites.add(hornliuBack63);
    }

    @Override
    protected void initSprites() {
        // FRONT
        hornliuFront1 = new Sprite(SPRITE_SIZE, 0, 0, SpriteSheet.HornliuFront);
        hornliuFront2 = new Sprite(SPRITE_SIZE, 1, 0, SpriteSheet.HornliuFront);
        hornliuFront3 = new Sprite(SPRITE_SIZE, 2, 0, SpriteSheet.HornliuFront);
        hornliuFront4 = new Sprite(SPRITE_SIZE, 3, 0, SpriteSheet.HornliuFront);
        hornliuFront5 = new Sprite(SPRITE_SIZE, 4, 0, SpriteSheet.HornliuFront);
        hornliuFront6 = new Sprite(SPRITE_SIZE, 5, 0, SpriteSheet.HornliuFront);
        hornliuFront7 = new Sprite(SPRITE_SIZE, 6, 0, SpriteSheet.HornliuFront);
        hornliuFront8 = new Sprite(SPRITE_SIZE, 7, 0, SpriteSheet.HornliuFront);

        hornliuFront9 = new Sprite(SPRITE_SIZE, 0, 1, SpriteSheet.HornliuFront);
        hornliuFront10 = new Sprite(SPRITE_SIZE, 1, 1, SpriteSheet.HornliuFront);
        hornliuFront11 = new Sprite(SPRITE_SIZE, 2, 1, SpriteSheet.HornliuFront);
        hornliuFront12 = new Sprite(SPRITE_SIZE, 3, 1, SpriteSheet.HornliuFront);
        hornliuFront13 = new Sprite(SPRITE_SIZE, 4, 1, SpriteSheet.HornliuFront);
        hornliuFront14 = new Sprite(SPRITE_SIZE, 5, 1, SpriteSheet.HornliuFront);
        hornliuFront15 = new Sprite(SPRITE_SIZE, 6, 1, SpriteSheet.HornliuFront);
        hornliuFront16 = new Sprite(SPRITE_SIZE, 7, 1, SpriteSheet.HornliuFront);

        hornliuFront17 = new Sprite(SPRITE_SIZE, 0, 2, SpriteSheet.HornliuFront);
        hornliuFront18 = new Sprite(SPRITE_SIZE, 1, 2, SpriteSheet.HornliuFront);
        hornliuFront19 = new Sprite(SPRITE_SIZE, 2, 2, SpriteSheet.HornliuFront);
        hornliuFront20 = new Sprite(SPRITE_SIZE, 3, 2, SpriteSheet.HornliuFront);
        hornliuFront21 = new Sprite(SPRITE_SIZE, 4, 2, SpriteSheet.HornliuFront);
        hornliuFront22 = new Sprite(SPRITE_SIZE, 5, 2, SpriteSheet.HornliuFront);
        hornliuFront23 = new Sprite(SPRITE_SIZE, 6, 2, SpriteSheet.HornliuFront);
        hornliuFront24 = new Sprite(SPRITE_SIZE, 7, 2, SpriteSheet.HornliuFront);

        hornliuFront25 = new Sprite(SPRITE_SIZE, 0, 3, SpriteSheet.HornliuFront);
        hornliuFront26 = new Sprite(SPRITE_SIZE, 1, 3, SpriteSheet.HornliuFront);
        hornliuFront27 = new Sprite(SPRITE_SIZE, 2, 3, SpriteSheet.HornliuFront);
        hornliuFront28 = new Sprite(SPRITE_SIZE, 3, 3, SpriteSheet.HornliuFront);
        hornliuFront29 = new Sprite(SPRITE_SIZE, 4, 3, SpriteSheet.HornliuFront);
        hornliuFront30 = new Sprite(SPRITE_SIZE, 5, 3, SpriteSheet.HornliuFront);
        hornliuFront31 = new Sprite(SPRITE_SIZE, 6, 3, SpriteSheet.HornliuFront);
        hornliuFront32 = new Sprite(SPRITE_SIZE, 7, 3, SpriteSheet.HornliuFront);

        hornliuFront33 = new Sprite(SPRITE_SIZE, 0, 4, SpriteSheet.HornliuFront);
        hornliuFront34 = new Sprite(SPRITE_SIZE, 1, 4, SpriteSheet.HornliuFront);
        hornliuFront35 = new Sprite(SPRITE_SIZE, 2, 4, SpriteSheet.HornliuFront);
        hornliuFront36 = new Sprite(SPRITE_SIZE, 3, 4, SpriteSheet.HornliuFront);
        hornliuFront37 = new Sprite(SPRITE_SIZE, 4, 4, SpriteSheet.HornliuFront);
        hornliuFront38 = new Sprite(SPRITE_SIZE, 5, 4, SpriteSheet.HornliuFront);
        hornliuFront39 = new Sprite(SPRITE_SIZE, 6, 4, SpriteSheet.HornliuFront);
        hornliuFront40 = new Sprite(SPRITE_SIZE, 7, 4, SpriteSheet.HornliuFront);

        hornliuFront41 = new Sprite(SPRITE_SIZE, 0, 5, SpriteSheet.HornliuFront);
        hornliuFront42 = new Sprite(SPRITE_SIZE, 1, 5, SpriteSheet.HornliuFront);
        hornliuFront43 = new Sprite(SPRITE_SIZE, 2, 5, SpriteSheet.HornliuFront);
        hornliuFront44 = new Sprite(SPRITE_SIZE, 3, 5, SpriteSheet.HornliuFront);
        hornliuFront45 = new Sprite(SPRITE_SIZE, 4, 5, SpriteSheet.HornliuFront);
        hornliuFront46 = new Sprite(SPRITE_SIZE, 5, 5, SpriteSheet.HornliuFront);
        hornliuFront47 = new Sprite(SPRITE_SIZE, 6, 5, SpriteSheet.HornliuFront);
        hornliuFront48 = new Sprite(SPRITE_SIZE, 7, 5, SpriteSheet.HornliuFront);

        hornliuFront49 = new Sprite(SPRITE_SIZE, 0, 6, SpriteSheet.HornliuFront);
        hornliuFront50 = new Sprite(SPRITE_SIZE, 1, 6, SpriteSheet.HornliuFront);
        hornliuFront51 = new Sprite(SPRITE_SIZE, 2, 6, SpriteSheet.HornliuFront);
        hornliuFront52 = new Sprite(SPRITE_SIZE, 3, 6, SpriteSheet.HornliuFront);
        hornliuFront53 = new Sprite(SPRITE_SIZE, 4, 6, SpriteSheet.HornliuFront);
        hornliuFront54 = new Sprite(SPRITE_SIZE, 5, 6, SpriteSheet.HornliuFront);
        hornliuFront55 = new Sprite(SPRITE_SIZE, 6, 6, SpriteSheet.HornliuFront);
        hornliuFront56 = new Sprite(SPRITE_SIZE, 7, 6, SpriteSheet.HornliuFront);

        hornliuFront57 = new Sprite(SPRITE_SIZE, 0, 7, SpriteSheet.HornliuFront);
        hornliuFront58 = new Sprite(SPRITE_SIZE, 1, 7, SpriteSheet.HornliuFront);
        hornliuFront59 = new Sprite(SPRITE_SIZE, 2, 7, SpriteSheet.HornliuFront);
    }

    @Override
    protected void populateAttackList() {

        AtkPerLvl.add(new AttackenEntry("Tackle", 2));
        AtkPerLvl.add(new AttackenEntry("Fadenschuss", 2));
        AtkPerLvl.add(new AttackenEntry("Giftstachel", 7));
        AtkPerLvl.add(new AttackenEntry("Feuersturm", 10));
        AtkPerLvl.add(new AttackenEntry("Hydropumpe", 14));

    }

    @Override
    protected void setBaseStats() {
        baseStats[0] = 40; //HP
        baseStats[1] = 35; //ATK
        baseStats[2] = 30; //DEF
        baseStats[3] = 20; //SpATK
        baseStats[4] = 20; //SpDEF
        baseStats[5] = 50; //SPD
    }

}
