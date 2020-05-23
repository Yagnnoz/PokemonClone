package com.yagnnoz.realm.pokemon;

import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.graphics.Sprite;
import java.util.List;

/**
 *
 * @author Jens
 */
public abstract class Pokemon {

    int level;
    String name;
    protected List<Sprite> frontSprites;
    protected List<Sprite> backSprites;
    private int animateFront = 0;
    public int animateBack = 0;
    private int animationSpeed = 2;
    private Sprite sprite;
    public int NUMBER_FRAMES_FRONT_ANIM;
    public int NUMBER_FRAMES_BACK_ANIM;

    Pokemon(int level) {
        this.level = level;
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
        screen.renderPokemon(600, 60, sprite);
    }

    public void renderOwnPokemon(Screen screen) {
        sprite = backSprites.get((animateBack / animationSpeed) % NUMBER_FRAMES_BACK_ANIM);
        screen.renderPokemon(150, 200, sprite);
    }
    
    protected abstract void setFrontsprites();
    protected abstract void setBacksprites();
}
