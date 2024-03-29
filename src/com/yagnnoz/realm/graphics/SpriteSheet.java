package com.yagnnoz.realm.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Jens
 */
public class SpriteSheet {

    private String path;
    public final int SIZE;
    public int[] pixels;

    public static SpriteSheet tiles = new SpriteSheet("/textures/SpriteSheet.png", 256);
    public static SpriteSheet spawnLevel = new SpriteSheet("/textures/sheets/Spawn.png", 160);

    
    public static SpriteSheet BisaknospFront = new SpriteSheet("/PokemonSprites/BisaknospFront.png", 588);
    public static SpriteSheet BisaknospBack = new SpriteSheet("/PokemonSprites/BisaknospBack.png", 608);
    public static SpriteSheet BisaflowFront = new SpriteSheet("/PokemonSprites/BisaflorFront.png", 848);
    public static SpriteSheet BisaflowBack = new SpriteSheet("/PokemonSprites/BisaflorBack.png", 760);

    public static SpriteSheet HornliuFront = new SpriteSheet("/PokemonSprites/HornliuFront.png", 512);
    public static SpriteSheet HornliuBack = new SpriteSheet("/PokemonSprites/HornliuBack.png", 512);
    public static SpriteSheet PikachuFront = new SpriteSheet("/PokemonSprites/PikachuFront.png", 512);
    public static SpriteSheet PikachuBack = new SpriteSheet("/PokemonSprites/PikachuBack.png", 520);
    public static SpriteSheet RattfratzFront = new SpriteSheet("/PokemonSprites/RattfratzFront.png", 512);
    public static SpriteSheet RattfratzBack = new SpriteSheet("/PokemonSprites/RattfratzBack.png", 512);

    public SpriteSheet(String path, int size) {
        this.path = path;
        SIZE = size;
        pixels = new int[SIZE * SIZE];
        loadImage();
    }

    private void loadImage() {
        try {
            BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path));
            int w = image.getWidth();
            int h = image.getHeight();
            image.getRGB(0, 0, w, h, pixels, 0, w);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
