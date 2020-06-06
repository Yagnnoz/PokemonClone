package com.yagnnoz.realm.entity.mob;

import com.yagnnoz.realm.entity.Entity;
import com.yagnnoz.realm.graphics.Sprite;

/**
 *
 * @author Jens
 */
public abstract class Mob extends Entity {

    protected Sprite sprite;
    protected int dir = 0; //direction. 0 north, 1 east, 2 south, 3 west
    protected boolean moving = false;

    public void move(int xa, int ya) {

        if (xa != 0 && ya != 0) { //auf 2 achsen bewegen (diagonal)
            move(xa, 0);
            move(0, ya);
            return; //wichtig, da die Methode sonst nicht abgebrochen wird!
        }

        if (xa > 0) {
            dir = 1;
        }
        if (xa < 0) {
            dir = 3;
        }
        if (ya > 0) {
            dir = 2;
        }
        if (ya < 0) {
            dir = 0;
        }

        if (!collision(xa, ya)) {
            x += xa;
            y += ya;
        }
    }

    @Override
    public void update() {
    }

    public void render() {

    }

    private boolean collision(int xa, int ya) {
        boolean solid = false;
        for (int corner = 0; corner < 4; corner++) {
            int xt = ((x + xa) + corner % 2 * 12 - 7) / 16;     //*10 ist die Breite des Collisionsbereichs
            int yt = ((y + ya) + corner / 2 * 12 + 3) / 16;

            if (level.getTile(xt, yt).solid()) {
                solid = true;
            }
            
            //loop durch NPCs und Trainer
            for(int i = 0; i<level.getTrainers().size(); i++){
                if((level.getTrainers().get(i).getTileX() == xt) && (level.getTrainers().get(i).getTileY() == yt)){
                    solid = true;
                }
            }
        }

        return solid;
    }

}
