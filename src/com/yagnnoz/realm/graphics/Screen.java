package com.yagnnoz.realm.graphics;

import com.yagnnoz.realm.level.tile.Tile;
import java.util.Random;

/**
 *
 * @author Jens
 */
public class Screen {

    public int width, height;
    public int[] pixels;
    public final int MAP_SIZE = 64;
    public final int MAP_SIZE_MASK = MAP_SIZE - 1;
    public int xOffset, yOffset;
    public int[] tiles = new int[MAP_SIZE * MAP_SIZE];
    private Random rdm = new Random();

    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new int[width * height];

        //fills tiles with random colors.
        for (int i = 0; i < MAP_SIZE * MAP_SIZE; i++) {
            tiles[i] = rdm.nextInt(0xffffff);
        }
        tiles[0] = 0x000000;
    }

    public void clear() {
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = 0;
        }
    }

    public void renderTile(int xPos, int yPos, Tile tile) {

        xPos -= xOffset;
        yPos -= yOffset;
        for (int y = 0; y < tile.sprite.SIZE; y++) {
            int yAbs = y + yPos;
            for (int x = 0; x < tile.sprite.SIZE; x++) {
                int xAbs = x + xPos;
                if (xAbs < -tile.sprite.SIZE || xAbs >= width || yAbs < 0 || yAbs >= height) {
                    break;
                }
                if (xAbs < 0) {
                    xAbs = 0;
                }
                pixels[xAbs + yAbs * width] = tile.sprite.pixels[x + y * tile.sprite.SIZE];

            }
        }
    }

    public void renderPlayer(int xPos, int yPos, Sprite sprite) {
        xPos -= xOffset;
        yPos -= yOffset;
        for (int y = 0; y < 32; y++) {
            int yAbs = y + yPos;
            for (int x = 0; x < 32; x++) {
                int xAbs = x + xPos;
             
                if (xAbs < -32 || xAbs >= width || yAbs < 0 || yAbs >= height) {
                    break;
                }
                if (xAbs < 0) {
                    xAbs = 0;
                }
                int colour = sprite.pixels[x + y * 32];
                if (colour != 0xffff00ff) {     //ACHTUNG hier sind 4 Channels. FF FF 00 FF -> Alpha R G B
                    pixels[xAbs + yAbs * width] = colour;
                }

            }
        }
    }
    
    public void renderBattlefield(){
        //white BG
        for (int i = 0; i<pixels.length; i++){
            pixels[i] = 0xFFFFFFFF;
        }
    }
    
    public void renderMenu(){
        for(int px:pixels){
            pixels[px] = 0xFF000000;
        }
        
    }

    public void setOffset(int xOffset, int yOffset) {
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }

}
