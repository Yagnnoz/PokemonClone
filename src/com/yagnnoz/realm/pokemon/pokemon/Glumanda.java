package com.yagnnoz.realm.pokemon.pokemon;

import com.yagnnoz.realm.graphics.Sprite;
import com.yagnnoz.realm.graphics.SpriteSheet;
import com.yagnnoz.realm.pokemon.mechanics.Pokemon;
import java.util.ArrayList;

/**
 *
 * @author Jens
 */
public final class Glumanda extends Pokemon {

    private final int SPRITE_SIZE_FRONT = 57;
    private final int SPRITE_SIZE_BACK = 64;

//<editor-fold desc="Sprites">
    public Sprite glumandaFront1, glumandaFront2, glumandaFront3, glumandaFront4,
            glumandaFront5, glumandaFront6, glumandaFront7, glumandaFront8,
            glumandaFront9, glumandaFront10, glumandaFront11, glumandaFront12,
            glumandaFront13, glumandaFront14, glumandaFront15, glumandaFront16,
            glumandaFront17, glumandaFront18, glumandaFront19, glumandaFront20,
            glumandaFront21, glumandaFront22, glumandaFront23, glumandaFront24,
            glumandaFront25, glumandaFront26, glumandaFront27, glumandaFront28,
            glumandaFront29, glumandaFront30, glumandaFront31, glumandaFront32,
            glumandaFront33, glumandaFront34, glumandaFront35, glumandaFront36,
            glumandaFront37, glumandaFront38, glumandaFront39, glumandaFront40,
            glumandaFront41, glumandaFront42, glumandaFront43, glumandaFront44,
            glumandaFront45, glumandaFront46, glumandaFront47, glumandaFront48,
            glumandaFront49, glumandaFront50, glumandaFront51, glumandaFront52,
            glumandaFront53, glumandaFront54, glumandaFront55, glumandaFront56,
            glumandaFront57, glumandaFront58, glumandaFront59, glumandaFront60,
            glumandaFront61, glumandaFront62, glumandaFront63, glumandaFront64,
            glumandaFront65, glumandaFront66, glumandaFront67, glumandaFront68,
            glumandaFront69;

    public Sprite glumandaBack1, glumandaBack2, glumandaBack3, glumandaBack4,
            glumandaBack5, glumandaBack6, glumandaBack7, glumandaBack8,
            glumandaBack9, glumandaBack10, glumandaBack11, glumandaBack12,
            glumandaBack13, glumandaBack14, glumandaBack15, glumandaBack16,
            glumandaBack17, glumandaBack18, glumandaBack19, glumandaBack20,
            glumandaBack21, glumandaBack22, glumandaBack23, glumandaBack24,
            glumandaBack25, glumandaBack26, glumandaBack27, glumandaBack28,
            glumandaBack29, glumandaBack30, glumandaBack31, glumandaBack32,
            glumandaBack33, glumandaBack34, glumandaBack35, glumandaBack36,
            glumandaBack37, glumandaBack38;
//</editor-fold>

    private SpriteSheet glumandaFront;
    private SpriteSheet glumandaBack;

    public Glumanda(int level) {
        super(level);
        setName("Glumanda");
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
        glumandaFront = new SpriteSheet("/PokemonSprites/GlumandaFront.png", 513);
        glumandaBack = new SpriteSheet("/PokemonSprites/GlumandaBack.png", 448);

//----------------------------------------------------------------------------------------------------//
//--------------------------------------------- FRONT ------------------------------------------------//
//----------------------------------------------------------------------------------------------------//
        glumandaFront1 = new Sprite(SPRITE_SIZE_FRONT, 0, 0, glumandaFront);
        glumandaFront2 = new Sprite(SPRITE_SIZE_FRONT, 1, 0, glumandaFront);
        glumandaFront3 = new Sprite(SPRITE_SIZE_FRONT, 2, 0, glumandaFront);
        glumandaFront4 = new Sprite(SPRITE_SIZE_FRONT, 3, 0, glumandaFront);
        glumandaFront5 = new Sprite(SPRITE_SIZE_FRONT, 4, 0, glumandaFront);
        glumandaFront6 = new Sprite(SPRITE_SIZE_FRONT, 5, 0, glumandaFront);
        glumandaFront7 = new Sprite(SPRITE_SIZE_FRONT, 6, 0, glumandaFront);
        glumandaFront8 = new Sprite(SPRITE_SIZE_FRONT, 7, 0, glumandaFront);
        glumandaFront9 = new Sprite(SPRITE_SIZE_FRONT, 8, 0, glumandaFront);
        glumandaFront10 = new Sprite(SPRITE_SIZE_FRONT, 0, 1, glumandaFront);
        glumandaFront11 = new Sprite(SPRITE_SIZE_FRONT, 1, 1, glumandaFront);
        glumandaFront12 = new Sprite(SPRITE_SIZE_FRONT, 2, 1, glumandaFront);
        glumandaFront13 = new Sprite(SPRITE_SIZE_FRONT, 3, 1, glumandaFront);
        glumandaFront14 = new Sprite(SPRITE_SIZE_FRONT, 4, 1, glumandaFront);
        glumandaFront15 = new Sprite(SPRITE_SIZE_FRONT, 5, 1, glumandaFront);
        glumandaFront16 = new Sprite(SPRITE_SIZE_FRONT, 6, 1, glumandaFront);
        glumandaFront17 = new Sprite(SPRITE_SIZE_FRONT, 7, 1, glumandaFront);
        glumandaFront18 = new Sprite(SPRITE_SIZE_FRONT, 8, 1, glumandaFront);
        glumandaFront19 = new Sprite(SPRITE_SIZE_FRONT, 0, 2, glumandaFront);
        glumandaFront20 = new Sprite(SPRITE_SIZE_FRONT, 1, 2, glumandaFront);
        glumandaFront21 = new Sprite(SPRITE_SIZE_FRONT, 2, 2, glumandaFront);
        glumandaFront22 = new Sprite(SPRITE_SIZE_FRONT, 3, 2, glumandaFront);
        glumandaFront23 = new Sprite(SPRITE_SIZE_FRONT, 4, 2, glumandaFront);
        glumandaFront24 = new Sprite(SPRITE_SIZE_FRONT, 5, 2, glumandaFront);
        glumandaFront25 = new Sprite(SPRITE_SIZE_FRONT, 6, 2, glumandaFront);
        glumandaFront26 = new Sprite(SPRITE_SIZE_FRONT, 7, 2, glumandaFront);
        glumandaFront27 = new Sprite(SPRITE_SIZE_FRONT, 8, 2, glumandaFront);
        glumandaFront28 = new Sprite(SPRITE_SIZE_FRONT, 0, 3, glumandaFront);
        glumandaFront29 = new Sprite(SPRITE_SIZE_FRONT, 1, 3, glumandaFront);
        glumandaFront30 = new Sprite(SPRITE_SIZE_FRONT, 2, 3, glumandaFront);
        glumandaFront31 = new Sprite(SPRITE_SIZE_FRONT, 3, 3, glumandaFront);
        glumandaFront32 = new Sprite(SPRITE_SIZE_FRONT, 4, 3, glumandaFront);
        glumandaFront33 = new Sprite(SPRITE_SIZE_FRONT, 5, 3, glumandaFront);
        glumandaFront34 = new Sprite(SPRITE_SIZE_FRONT, 6, 3, glumandaFront);
        glumandaFront35 = new Sprite(SPRITE_SIZE_FRONT, 7, 3, glumandaFront);
        glumandaFront36 = new Sprite(SPRITE_SIZE_FRONT, 8, 3, glumandaFront);
        glumandaFront37 = new Sprite(SPRITE_SIZE_FRONT, 0, 4, glumandaFront);
        glumandaFront38 = new Sprite(SPRITE_SIZE_FRONT, 1, 4, glumandaFront);
        glumandaFront39 = new Sprite(SPRITE_SIZE_FRONT, 2, 4, glumandaFront);
        glumandaFront40 = new Sprite(SPRITE_SIZE_FRONT, 3, 4, glumandaFront);
        glumandaFront41 = new Sprite(SPRITE_SIZE_FRONT, 4, 4, glumandaFront);
        glumandaFront42 = new Sprite(SPRITE_SIZE_FRONT, 5, 4, glumandaFront);
        glumandaFront43 = new Sprite(SPRITE_SIZE_FRONT, 6, 4, glumandaFront);
        glumandaFront44 = new Sprite(SPRITE_SIZE_FRONT, 7, 4, glumandaFront);
        glumandaFront45 = new Sprite(SPRITE_SIZE_FRONT, 8, 4, glumandaFront);
        glumandaFront46 = new Sprite(SPRITE_SIZE_FRONT, 0, 5, glumandaFront);
        glumandaFront47 = new Sprite(SPRITE_SIZE_FRONT, 1, 5, glumandaFront);
        glumandaFront48 = new Sprite(SPRITE_SIZE_FRONT, 2, 5, glumandaFront);
        glumandaFront49 = new Sprite(SPRITE_SIZE_FRONT, 3, 5, glumandaFront);
        glumandaFront50 = new Sprite(SPRITE_SIZE_FRONT, 4, 5, glumandaFront);
        glumandaFront51 = new Sprite(SPRITE_SIZE_FRONT, 5, 5, glumandaFront);
        glumandaFront52 = new Sprite(SPRITE_SIZE_FRONT, 6, 5, glumandaFront);
        glumandaFront53 = new Sprite(SPRITE_SIZE_FRONT, 7, 5, glumandaFront);
        glumandaFront54 = new Sprite(SPRITE_SIZE_FRONT, 8, 5, glumandaFront);
        glumandaFront55 = new Sprite(SPRITE_SIZE_FRONT, 0, 6, glumandaFront);
        glumandaFront56 = new Sprite(SPRITE_SIZE_FRONT, 1, 6, glumandaFront);
        glumandaFront57 = new Sprite(SPRITE_SIZE_FRONT, 2, 6, glumandaFront);
        glumandaFront58 = new Sprite(SPRITE_SIZE_FRONT, 3, 6, glumandaFront);
        glumandaFront59 = new Sprite(SPRITE_SIZE_FRONT, 4, 6, glumandaFront);
        glumandaFront60 = new Sprite(SPRITE_SIZE_FRONT, 5, 6, glumandaFront);
        glumandaFront61 = new Sprite(SPRITE_SIZE_FRONT, 6, 6, glumandaFront);
        glumandaFront62 = new Sprite(SPRITE_SIZE_FRONT, 7, 6, glumandaFront);
        glumandaFront63 = new Sprite(SPRITE_SIZE_FRONT, 8, 6, glumandaFront);
        glumandaFront64 = new Sprite(SPRITE_SIZE_FRONT, 0, 7, glumandaFront);
        glumandaFront65 = new Sprite(SPRITE_SIZE_FRONT, 1, 7, glumandaFront);
        glumandaFront66 = new Sprite(SPRITE_SIZE_FRONT, 2, 7, glumandaFront);
        glumandaFront67 = new Sprite(SPRITE_SIZE_FRONT, 3, 7, glumandaFront);
        glumandaFront68 = new Sprite(SPRITE_SIZE_FRONT, 4, 7, glumandaFront);
        glumandaFront69 = new Sprite(SPRITE_SIZE_FRONT, 5, 7, glumandaFront);

//----------------------------------------------------------------------------------------------------//
//--------------------------------------------- BACK -------------------------------------------------//
//----------------------------------------------------------------------------------------------------//
        glumandaBack1 = new Sprite(SPRITE_SIZE_BACK, 0, 0, glumandaBack);
        glumandaBack2 = new Sprite(SPRITE_SIZE_BACK, 1, 0, glumandaBack);
        glumandaBack3 = new Sprite(SPRITE_SIZE_BACK, 2, 0, glumandaBack);
        glumandaBack4 = new Sprite(SPRITE_SIZE_BACK, 3, 0, glumandaBack);
        glumandaBack5 = new Sprite(SPRITE_SIZE_BACK, 4, 0, glumandaBack);
        glumandaBack6 = new Sprite(SPRITE_SIZE_BACK, 5, 0, glumandaBack);
        glumandaBack7 = new Sprite(SPRITE_SIZE_BACK, 6, 0, glumandaBack);
        glumandaBack8 = new Sprite(SPRITE_SIZE_BACK, 0, 1, glumandaBack);
        glumandaBack9 = new Sprite(SPRITE_SIZE_BACK, 1, 1, glumandaBack);
        glumandaBack10 = new Sprite(SPRITE_SIZE_BACK, 2, 1, glumandaBack);
        glumandaBack11 = new Sprite(SPRITE_SIZE_BACK, 3, 1, glumandaBack);
        glumandaBack12 = new Sprite(SPRITE_SIZE_BACK, 4, 1, glumandaBack);
        glumandaBack13 = new Sprite(SPRITE_SIZE_BACK, 5, 1, glumandaBack);
        glumandaBack14 = new Sprite(SPRITE_SIZE_BACK, 6, 1, glumandaBack);
        glumandaBack15 = new Sprite(SPRITE_SIZE_BACK, 0, 2, glumandaBack);
        glumandaBack16 = new Sprite(SPRITE_SIZE_BACK, 1, 2, glumandaBack);
        glumandaBack17 = new Sprite(SPRITE_SIZE_BACK, 2, 2, glumandaBack);
        glumandaBack18 = new Sprite(SPRITE_SIZE_BACK, 3, 2, glumandaBack);
        glumandaBack19 = new Sprite(SPRITE_SIZE_BACK, 4, 2, glumandaBack);
        glumandaBack20 = new Sprite(SPRITE_SIZE_BACK, 5, 2, glumandaBack);
        glumandaBack21 = new Sprite(SPRITE_SIZE_BACK, 6, 2, glumandaBack);
        glumandaBack22 = new Sprite(SPRITE_SIZE_BACK, 0, 3, glumandaBack);
        glumandaBack23 = new Sprite(SPRITE_SIZE_BACK, 1, 3, glumandaBack);
        glumandaBack24 = new Sprite(SPRITE_SIZE_BACK, 2, 3, glumandaBack);
        glumandaBack25 = new Sprite(SPRITE_SIZE_BACK, 3, 3, glumandaBack);
        glumandaBack26 = new Sprite(SPRITE_SIZE_BACK, 4, 3, glumandaBack);
        glumandaBack27 = new Sprite(SPRITE_SIZE_BACK, 5, 3, glumandaBack);
        glumandaBack28 = new Sprite(SPRITE_SIZE_BACK, 6, 3, glumandaBack);
        glumandaBack29 = new Sprite(SPRITE_SIZE_BACK, 0, 4, glumandaBack);
        glumandaBack30 = new Sprite(SPRITE_SIZE_BACK, 1, 4, glumandaBack);
        glumandaBack31 = new Sprite(SPRITE_SIZE_BACK, 2, 4, glumandaBack);
        glumandaBack32 = new Sprite(SPRITE_SIZE_BACK, 3, 4, glumandaBack);
        glumandaBack33 = new Sprite(SPRITE_SIZE_BACK, 4, 4, glumandaBack);
        glumandaBack34 = new Sprite(SPRITE_SIZE_BACK, 5, 4, glumandaBack);
        glumandaBack35 = new Sprite(SPRITE_SIZE_BACK, 6, 4, glumandaBack);
        glumandaBack36 = new Sprite(SPRITE_SIZE_BACK, 0, 5, glumandaBack);
        glumandaBack37 = new Sprite(SPRITE_SIZE_BACK, 1, 5, glumandaBack);
        glumandaBack38 = new Sprite(SPRITE_SIZE_BACK, 2, 5, glumandaBack);

    }

    @Override
    protected void setFrontsprites() {
        frontSprites.add(glumandaFront1);
        frontSprites.add(glumandaFront2);
        frontSprites.add(glumandaFront3);
        frontSprites.add(glumandaFront4);
        frontSprites.add(glumandaFront5);
        frontSprites.add(glumandaFront6);
        frontSprites.add(glumandaFront7);
        frontSprites.add(glumandaFront8);
        frontSprites.add(glumandaFront9);
        frontSprites.add(glumandaFront10);
        frontSprites.add(glumandaFront11);
        frontSprites.add(glumandaFront12);
        frontSprites.add(glumandaFront13);
        frontSprites.add(glumandaFront14);
        frontSprites.add(glumandaFront15);
        frontSprites.add(glumandaFront16);
        frontSprites.add(glumandaFront17);
        frontSprites.add(glumandaFront18);
        frontSprites.add(glumandaFront19);
        frontSprites.add(glumandaFront20);
        frontSprites.add(glumandaFront21);
        frontSprites.add(glumandaFront22);
        frontSprites.add(glumandaFront23);
        frontSprites.add(glumandaFront24);
        frontSprites.add(glumandaFront25);
        frontSprites.add(glumandaFront26);
        frontSprites.add(glumandaFront27);
        frontSprites.add(glumandaFront28);
        frontSprites.add(glumandaFront29);
        frontSprites.add(glumandaFront30);
        frontSprites.add(glumandaFront31);
        frontSprites.add(glumandaFront32);
        frontSprites.add(glumandaFront33);
        frontSprites.add(glumandaFront34);
        frontSprites.add(glumandaFront35);
        frontSprites.add(glumandaFront36);
        frontSprites.add(glumandaFront37);
        frontSprites.add(glumandaFront38);
        frontSprites.add(glumandaFront39);
        frontSprites.add(glumandaFront40);
        frontSprites.add(glumandaFront41);
        frontSprites.add(glumandaFront42);
        frontSprites.add(glumandaFront43);
        frontSprites.add(glumandaFront44);
        frontSprites.add(glumandaFront45);
        frontSprites.add(glumandaFront46);
        frontSprites.add(glumandaFront47);
        frontSprites.add(glumandaFront48);
        frontSprites.add(glumandaFront49);
        frontSprites.add(glumandaFront50);
        frontSprites.add(glumandaFront51);
        frontSprites.add(glumandaFront52);
        frontSprites.add(glumandaFront53);
        frontSprites.add(glumandaFront54);
        frontSprites.add(glumandaFront55);
        frontSprites.add(glumandaFront56);
        frontSprites.add(glumandaFront57);
        frontSprites.add(glumandaFront58);
        frontSprites.add(glumandaFront59);
        frontSprites.add(glumandaFront60);
        frontSprites.add(glumandaFront61);
        frontSprites.add(glumandaFront62);
        frontSprites.add(glumandaFront63);
        frontSprites.add(glumandaFront64);
        frontSprites.add(glumandaFront65);
        frontSprites.add(glumandaFront66);
        frontSprites.add(glumandaFront67);
        frontSprites.add(glumandaFront68);
        frontSprites.add(glumandaFront69);
    }

    @Override
    protected void setBacksprites() {
        backSprites.add(glumandaBack1);
        backSprites.add(glumandaBack2);
        backSprites.add(glumandaBack3);
        backSprites.add(glumandaBack4);
        backSprites.add(glumandaBack5);
        backSprites.add(glumandaBack6);
        backSprites.add(glumandaBack7);
        backSprites.add(glumandaBack8);
        backSprites.add(glumandaBack9);
        backSprites.add(glumandaBack10);
        backSprites.add(glumandaBack11);
        backSprites.add(glumandaBack12);
        backSprites.add(glumandaBack13);
        backSprites.add(glumandaBack14);
        backSprites.add(glumandaBack15);
        backSprites.add(glumandaBack16);
        backSprites.add(glumandaBack17);
        backSprites.add(glumandaBack18);
        backSprites.add(glumandaBack19);
        backSprites.add(glumandaBack20);
        backSprites.add(glumandaBack21);
        backSprites.add(glumandaBack22);
        backSprites.add(glumandaBack23);
        backSprites.add(glumandaBack24);
        backSprites.add(glumandaBack25);
        backSprites.add(glumandaBack26);
        backSprites.add(glumandaBack27);
        backSprites.add(glumandaBack28);
        backSprites.add(glumandaBack29);
        backSprites.add(glumandaBack30);
        backSprites.add(glumandaBack31);
        backSprites.add(glumandaBack32);
        backSprites.add(glumandaBack33);
        backSprites.add(glumandaBack34);
        backSprites.add(glumandaBack35);
        backSprites.add(glumandaBack36);
        backSprites.add(glumandaBack37);
        backSprites.add(glumandaBack38);
    }

    @Override
    protected void populateAttackList() {

    }

    @Override
    protected void setBaseStats() {
        baseStats[0] = 39; //HP
        baseStats[1] = 52; //ATK
        baseStats[2] = 43; //DEF
        baseStats[3] = 60; //SpATK
        baseStats[4] = 50; //SpDEF
        baseStats[5] = 65; //SPD
    }

}
