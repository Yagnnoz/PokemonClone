package com.yagnnoz.realm.entity.mob;

import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.graphics.Sprite;
import com.yagnnoz.realm.input.Keyboard;
import com.yagnnoz.realm.pokemon.mechanics.Pokemon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jens
 */
public class Player extends Mob {

    private Keyboard input;
    protected Sprite sprite;
    protected int animate = 0;
    protected boolean walking = false;
    public int oldX, oldY;
    protected List<Pokemon> team;
    

    public Player(Keyboard input) {
        this.input = input;
        this.sprite = Sprite.player_up;
        team = new ArrayList<>();
    }

    public Player(int x, int y, Keyboard input) {
        this.x = x;
        this.y = y;
        this.input = input;
        this.sprite = Sprite.player_up;
        team = new ArrayList<>();
    }

    @Override
    public void update() {
        oldX = x;
        oldY = y;
        int xa = 0, ya = 0;
        if (animate < 7500) {
            animate++;
        } else {
            animate = 0;
        }
        if (input.up) {
            ya-=2;
        }
        if (input.down) {
            ya+=2;
        }
        if (input.left) {
            xa-=2;
        }
        if (input.right) {
            xa+=2;
        }

        if (xa != 0 || ya != 0) {
            walking = true;
            move(xa, ya);
        } else {
            walking = false;
        }
    }

    @Override
    public void render(Screen screen) {
        if (dir == 0) {
            sprite = Sprite.player_up;
            if (walking) {
                if (animate % 40 > 10 && animate % 40 <= 20) {
                    sprite = Sprite.player_up_1;
                }
                if (animate % 40 > 30 && animate % 40 <= 40) {
                    sprite = Sprite.player_up_2;
                }
            }
        }
        if (dir == 1) {
            sprite = Sprite.player_right;
            if (walking) {
                if (animate % 40 > 10 && animate % 40 <= 20) {
                    sprite = Sprite.player_right_1;
                }
                if (animate % 40 > 30 && animate % 40 <= 40) {
                    sprite = Sprite.player_right_2;
                }
            }
        }
        if (dir == 2) {
            sprite = Sprite.player_down;
            if (walking) {
                if (animate % 40 > 10 && animate % 40 <= 20) {
                    sprite = Sprite.player_down_1;
                }
                if (animate % 40 > 30 && animate % 40 <= 40) {
                    sprite = Sprite.player_down_2;
                }
            }
        }
        if (dir == 3) {
            sprite = Sprite.player_left;
            if (walking) {
                if (animate % 40 > 10 && animate % 40 <= 20) {
                    sprite = Sprite.player_left_1;
                }
                if (animate % 40 > 30 && animate % 40 <= 40) {
                    sprite = Sprite.player_left_2;
                }
            }
        }

        screen.renderPlayer(x - 16, y - 16, sprite);

    }
    
    
    // Division by 16 to convert from PX to Tile
    public int getTileX(){
        return x/16;
    }
    public int getTileY(){
        return (y+8)/16;
    }
    public int getOldTileX(){
        return oldX/16;
    }
    public int getOldTileY(){
        return (oldY+8)/16;
    }
    
    public boolean isWalking(){
        return walking;
    }
    
    public void addPokemon(Pokemon pkmn){
        if(team.size() > 5){
        }else{
            team.add(pkmn);
        }
    }
    public Pokemon getPokemonFromTeam(int index){
        return team.get(index);
    }
    
    public int getDir(){
        return dir;
    }

}
