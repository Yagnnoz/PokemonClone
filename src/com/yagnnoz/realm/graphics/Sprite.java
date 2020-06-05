package com.yagnnoz.realm.graphics;

/**
 *
 * @author Jens
 */
public class Sprite {

    public final int SIZE;
    private int x, y;
    private int width, height;
    public int[] pixels;
    private SpriteSheet sheet;

    public static Sprite grass = new Sprite(16, 0, 0, SpriteSheet.tiles);
    public static Sprite flower = new Sprite(16, 1, 0, SpriteSheet.tiles);
    public static Sprite rock = new Sprite(16, 2, 0, SpriteSheet.tiles);
    public static Sprite voidSprite = new Sprite(16, 0x2b2b2b); //beautiful dark gray

    //Spawn Level Sprites:
    //---------------- TREE ----------------------------------------------------
    public static Sprite spawn_tree_1 = new Sprite(16, 0, 0, SpriteSheet.spawnLevel);
    public static Sprite spawn_tree_2 = new Sprite(16, 1, 0, SpriteSheet.spawnLevel);
    public static Sprite spawn_tree_3 = new Sprite(16, 2, 0, SpriteSheet.spawnLevel);
    public static Sprite spawn_tree_4 = new Sprite(16, 0, 1, SpriteSheet.spawnLevel);
    public static Sprite spawn_tree_5 = new Sprite(16, 1, 1, SpriteSheet.spawnLevel);
    public static Sprite spawn_tree_6 = new Sprite(16, 2, 1, SpriteSheet.spawnLevel);
    public static Sprite spawn_tree_7 = new Sprite(16, 0, 2, SpriteSheet.spawnLevel);
    public static Sprite spawn_tree_8 = new Sprite(16, 1, 2, SpriteSheet.spawnLevel);
    public static Sprite spawn_tree_9 = new Sprite(16, 2, 2, SpriteSheet.spawnLevel);

    public static Sprite spawn_tree_corner1 = new Sprite(16, 3, 3, SpriteSheet.spawnLevel);
    public static Sprite spawn_tree_corner2 = new Sprite(16, 4, 3, SpriteSheet.spawnLevel);
    public static Sprite spawn_tree_corner3 = new Sprite(16, 3, 4, SpriteSheet.spawnLevel);
    public static Sprite spawn_tree_corner4 = new Sprite(16, 4, 4, SpriteSheet.spawnLevel);

    //---------------- WATER ---------------------------------------------------
    public static Sprite spawn_water_1 = new Sprite(16, 3, 0, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_2 = new Sprite(16, 4, 0, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_3 = new Sprite(16, 5, 0, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_4 = new Sprite(16, 3, 1, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_5 = new Sprite(16, 4, 1, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_6 = new Sprite(16, 5, 1, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_7 = new Sprite(16, 3, 2, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_8 = new Sprite(16, 4, 2, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_9 = new Sprite(16, 5, 2, SpriteSheet.spawnLevel);

    public static Sprite spawn_water_deep_1 = new Sprite(16, 7, 3, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_deep_2 = new Sprite(16, 8, 3, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_deep_3 = new Sprite(16, 9, 3, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_deep_4 = new Sprite(16, 7, 4, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_deep_5 = new Sprite(16, 8, 4, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_deep_6 = new Sprite(16, 9, 4, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_deep_7 = new Sprite(16, 7, 5, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_deep_8 = new Sprite(16, 8, 5, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_deep_9 = new Sprite(16, 9, 5, SpriteSheet.spawnLevel);

    public static Sprite spawn_water_corner_1 = new Sprite(16, 5, 3, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_corner_2 = new Sprite(16, 6, 3, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_corner_3 = new Sprite(16, 5, 4, SpriteSheet.spawnLevel);
    public static Sprite spawn_water_corner_4 = new Sprite(16, 6, 4, SpriteSheet.spawnLevel);

    //---------------- TALL-GRASS ----------------------------------------------
    public static Sprite spawn_path_1 = new Sprite(16, 6, 0, SpriteSheet.spawnLevel);
    public static Sprite spawn_path_2 = new Sprite(16, 7, 0, SpriteSheet.spawnLevel);
    public static Sprite spawn_path_3 = new Sprite(16, 8, 0, SpriteSheet.spawnLevel);
    public static Sprite spawn_path_4 = new Sprite(16, 6, 1, SpriteSheet.spawnLevel);
    public static Sprite spawn_path_5 = new Sprite(16, 7, 1, SpriteSheet.spawnLevel);
    public static Sprite spawn_path_6 = new Sprite(16, 8, 1, SpriteSheet.spawnLevel);
    public static Sprite spawn_path_7 = new Sprite(16, 6, 2, SpriteSheet.spawnLevel);
    public static Sprite spawn_path_8 = new Sprite(16, 7, 2, SpriteSheet.spawnLevel);
    public static Sprite spawn_path_9 = new Sprite(16, 8, 2, SpriteSheet.spawnLevel);

    //---------------- PATH ----------------------------------------------------
    public static Sprite spawn_path = new Sprite(16, 9, 0, SpriteSheet.spawnLevel);

    //Player Sprites:
    public static Sprite player_up = new Sprite(32, 0, 5, SpriteSheet.tiles);
    public static Sprite player_up_1 = new Sprite(32, 0, 6, SpriteSheet.tiles);
    public static Sprite player_up_2 = new Sprite(32, 0, 7, SpriteSheet.tiles);

    public static Sprite player_down = new Sprite(32, 2, 5, SpriteSheet.tiles);
    public static Sprite player_down_1 = new Sprite(32, 2, 6, SpriteSheet.tiles);
    public static Sprite player_down_2 = new Sprite(32, 2, 7, SpriteSheet.tiles);

    public static Sprite player_left = new Sprite(32, 3, 5, SpriteSheet.tiles);
    public static Sprite player_left_1 = new Sprite(32, 3, 6, SpriteSheet.tiles);
    public static Sprite player_left_2 = new Sprite(32, 3, 7, SpriteSheet.tiles);

    public static Sprite player_right = new Sprite(32, 1, 5, SpriteSheet.tiles);
    public static Sprite player_right_1 = new Sprite(32, 1, 6, SpriteSheet.tiles);
    public static Sprite player_right_2 = new Sprite(32, 1, 7, SpriteSheet.tiles);

    
    
    public static Sprite trainer_up = new Sprite(32, 0, 1, SpriteSheet.tiles);
    public static Sprite trainer_up_1 = new Sprite(32, 0, 2, SpriteSheet.tiles);
    public static Sprite trainer_up_2 = new Sprite(32, 0, 3, SpriteSheet.tiles);

    public static Sprite trainer_down = new Sprite(32, 2, 1, SpriteSheet.tiles);
    public static Sprite trainer_down_1 = new Sprite(32, 2, 2, SpriteSheet.tiles);
    public static Sprite trainer_down_2 = new Sprite(32, 2, 3, SpriteSheet.tiles);

    public static Sprite trainer_left = new Sprite(32, 3, 1, SpriteSheet.tiles);
    public static Sprite trainer_left_1 = new Sprite(32, 3, 2, SpriteSheet.tiles);
    public static Sprite trainer_left_2 = new Sprite(32, 3, 3, SpriteSheet.tiles);

    public static Sprite trainer_right = new Sprite(32, 1, 1, SpriteSheet.tiles);
    public static Sprite trainer_right_1 = new Sprite(32, 1, 2, SpriteSheet.tiles);
    public static Sprite trainer_right_2 = new Sprite(32, 1, 3, SpriteSheet.tiles);

    public Sprite(int size, int x, int y, SpriteSheet sheet) {
        SIZE = size;
        pixels = new int[SIZE * SIZE];
        this.x = x * SIZE;
        this.y = y * SIZE;
        this.width = SIZE;
        this.height = SIZE;
        this.sheet = sheet;
        load();
    }

    public Sprite(int size, int color) {
        SIZE = size;
        this.width = SIZE;
        this.height = SIZE;
        pixels = new int[SIZE * SIZE];
        setColor(color);
    }

    public Sprite(int width, int height, int colour) {
        SIZE = -1;
        this.width = width;
        this.height = height;
        pixels = new int[width * height];
        setColor(colour);
    }

    private void setColor(int color) {
        for (int i = 0; i < width * height; i++) {
            pixels[i] = color;
        }
    }

    private void load() {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
