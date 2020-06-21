package com.yagnnoz.realm.pokemon;

import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.graphics.Sprite;
import com.yagnnoz.realm.pokemon.attacken.Attacke;
import com.yagnnoz.realm.pokemon.attacken.AttackenEntry;
import com.yagnnoz.realm.pokemon.attacken.AttackenFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Jens
 */
public abstract class Pokemon {

    //TODO: spriteSheets in eine Datei pro Pokemon packen?
    int level;
    String name;
    protected List<Sprite> frontSprites;
    protected List<Sprite> backSprites;
    protected List<AttackenEntry> AtkPerLvl;
    private int animateFront = 0;
    public int animateBack = 0;
    private final int animationSpeed;
    private Sprite sprite;
    public int NUMBER_FRAMES_FRONT_ANIM;
    public int NUMBER_FRAMES_BACK_ANIM;

    //Attacken
    private Attacke[] Attacken;

    Pokemon(int level) {
        this.animationSpeed = 2;
        this.level = level;
        Attacken = new Attacke[4];
        AtkPerLvl = new ArrayList<>();
    }

    public int getLevel() {
        return level;
    }

    /**
     *
     * @return Name of the Pokemon
     */
    @Override
    public String toString() {
        if (name != null) {
            return name;
        } else {
            return null;
        }
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void update() {
        if (animateFront < NUMBER_FRAMES_FRONT_ANIM * animationSpeed) {
            animateFront++;
        } else {
            animateFront = 0;
        }

        if (animateBack < NUMBER_FRAMES_BACK_ANIM * animationSpeed) {
            animateBack++;
        } else {
            animateBack = 0;
        }
    }

    public void renderOpponent(Screen screen) {

        sprite = frontSprites.get((animateFront / animationSpeed) % NUMBER_FRAMES_FRONT_ANIM);
        // screen.renderPokemon(550, 100, sprite);
        screen.renderSprite(500, 100, sprite, false);
    }

    public void renderOwnPokemon(Screen screen) {
        sprite = backSprites.get((animateBack / animationSpeed) % NUMBER_FRAMES_BACK_ANIM);
        screen.renderSprite(150, 250, sprite, false);
        //screen.renderPokemon(200, 250, sprite);
    }

    public void renderOwnPokemonAt(Screen screen, int posX, int posY) {
        sprite = backSprites.get((animateBack / animationSpeed) % NUMBER_FRAMES_BACK_ANIM);
        screen.renderPokemon(posX, posY, sprite);
    }

    protected abstract void initSprites();

    protected abstract void setFrontsprites();

    protected abstract void setBacksprites();

    protected abstract void populateAttackList();

    protected void setSprites() {
        initSprites();
        setFrontsprites();
        setBacksprites();
    }

    protected void setAttacks(int level) {
        /*
        Plan:
        basierend auf dem Level wird die Liste durchsucht und die letzten 4 Einträge genommen, die <= Level sind
        sind weniger Attacken in er Liste, werden halt nur die genommen.
        Das ganze dann halt per Factory.
         */
        if (!AtkPerLvl.isEmpty()) {
            //erst sortieren
            Collections.sort(AtkPerLvl, new Comparator<AttackenEntry>() {
                @Override
                public int compare(AttackenEntry arg0, AttackenEntry arg1) {
                    return Integer.valueOf(arg0.reqLevel).compareTo(arg1.reqLevel);
                }
            });
        }

        //debug: OUtput all attacks
        /*
        System.out.println("Alle Attacken:");
        for(int i = 0; i<AtkPerLvl.size(); i++){
            System.out.println(AtkPerLvl.get(i).name + ", reqLvl: "+AtkPerLvl.get(i).reqLevel);
        }
         
        System.out.println("SIZE of ATK List: " + AtkPerLvl.size());
        */
        
        int gelernteAttacken = 0;
        for (int i = AtkPerLvl.size(); i > 0; i--) {
            if (gelernteAttacken == 3) {
                break;
            }
            if (level >= AtkPerLvl.get(i-1).getReqLvl()) {
                Attacken[gelernteAttacken] = AttackenFactory.makeAttacke(AtkPerLvl.get(i-1).name);
                gelernteAttacken++;
            }
        }

        /*
        Debug: Output ATK Array
         
        System.out.println("gelernte Attacken: ");
        for (int i = 0; i < Attacken.length; i++) {
            if (Attacken[i] != null) {
                System.out.println(Attacken[i].toString());
            }
        }
        */
    }

}
