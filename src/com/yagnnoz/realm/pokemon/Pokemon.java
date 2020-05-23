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
    private int animate = 0;
    private Sprite sprite;

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
        if (animate < 116) {
            animate++;
        } else {
            animate = 0;
        }
    }

    public void render(Screen screen) { 
        
        sprite = frontSprites.get(animate/2);
        screen.renderPokemon(200, 20, sprite);
    }
}
