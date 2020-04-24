package com.yagnnoz.realm.graphics;

import com.yagnnoz.realm.Game;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author Jens
 */
public class Menu {

    private final Rectangle playButton = new Rectangle((Game.width*Game.scale) / 2 -50, 200, 100, 50);
    private final Rectangle helpButton = new Rectangle((Game.width*Game.scale) / 2 -50, 300, 100, 50);
    private final Rectangle quitButton = new Rectangle((Game.width*Game.scale) / 2 -50, 400, 100, 50);
    

    public void render(Screen screen, Graphics g) {
        screen.renderMenu();
        g.setColor(Color.WHITE);
        g.setFont(new Font("Calibri", 0, 25));
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(playButton);
        g2d.draw(helpButton);
        g2d.draw(quitButton);
        
        g2d.drawString("PLAY", playButton.x+25, playButton.y+35);
        g2d.drawString("HELP", helpButton.x+25, helpButton.y+35);
        g2d.drawString("QUIT", quitButton.x+25, quitButton.y+35);
        
        g.setFont(new Font("Calibri", 0, 45));
        g2d.drawString("POKEMONKLON V5", (Game.width*Game.scale)/4+50, 75);
    }

}
