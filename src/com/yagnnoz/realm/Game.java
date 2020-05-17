package com.yagnnoz.realm;

import com.yagnnoz.realm.pokemon.Pokemon;
import com.yagnnoz.realm.entity.mob.Player;
import com.yagnnoz.realm.graphics.Menu;
import com.yagnnoz.realm.graphics.Screen;
import com.yagnnoz.realm.input.*;
import com.yagnnoz.realm.level.Level;
import com.yagnnoz.realm.level.Route1;
import com.yagnnoz.realm.level.SpawnLevel;
import com.yagnnoz.realm.level.TileCoordinate;
import com.yagnnoz.realm.level.tile.Tile;
import com.yagnnoz.realm.pokemon.Hornliu;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Jens
 */
public class Game extends Canvas implements Runnable {

    public enum GAMESTATE {
        MENU, GAME, END, FIGHT
    };

    private static final long serialVersionUID = 1L;

    public static int width = 300;
    public static int height = width / 16 * 9;      //16:9 format
    public static int scale = 3;
    public static GAMESTATE state;

    private Thread gameThread;
    private JFrame frame;
    private Keyboard key;
    private Level level;
    private Player player;
    private boolean running = false;
    private Menu menu;
    private Mouse mouse;

    private Screen screen;
    FightHandler fight = new FightHandler(this);

    private BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB); //creating an image
    private int[] pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();        //accessing the image & modify
    
    public static List<Pokemon> team = new LinkedList<>();

    public Game() {
        Dimension size = new Dimension(width * scale, height * scale);
        setPreferredSize(size);
        screen = new Screen(width, height);
        frame = new JFrame();
        key = new Keyboard();
        mouse = new Mouse();
        level = new Route1("/levels/spawn.png");
        TileCoordinate playerSpawn = new TileCoordinate(11, 4);
        player = new Player(playerSpawn.getX(), playerSpawn.getY(), key);
        player.init(level);

        addMouseListener(mouse);
        addMouseMotionListener(mouse);
        addKeyListener(key);
        menu = new Menu(mouse);
        
        state = GAMESTATE.MENU;
        team.add(new Hornliu(5));

    }

    public synchronized void start() {
        running = true;
        gameThread = new Thread(this, "Display");
        gameThread.start();
    }

    public synchronized void stop() {
        running = false;
        try {
            gameThread.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();
        long timer = System.currentTimeMillis();
        final double ns = 1000000000.0 / 60.0;
        double delta = 0;
        int frames = 0;
        int updates = 0;

        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                update();
                updates++;
                delta--;
            }
            render();
            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                frame.setTitle("RAIN | UPS: " + updates + ", FPS: " + frames);
                frames = 0;
                updates = 0;
            }
        }
    }

    public static void changeGameState(String pState) {
        if (pState.equals("GAME")) {
            state = GAMESTATE.GAME;
        }
        if (pState.equals("MENU")) {
            state = GAMESTATE.MENU;
        }
        if (pState.equals("END")) {
            state = GAMESTATE.END;
        }
        if (pState.equals("FIGHT")) {
            state = GAMESTATE.FIGHT;
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.frame.setResizable(false);
        game.frame.setTitle("RAIN");
        game.frame.add(game);
        game.frame.pack();
        game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.frame.setLocationRelativeTo(null);  //centers window on the screen
        game.frame.setVisible(true);
        game.start();
    }

    private void update() {
        key.update();
        if (null != state) {
            switch (state) {
                case GAME:
                    player.update();
                    if (key.esc) {
                        changeGameState("MENU");
                    }
                    checkGrassforWildPkmn();
                    break;
                case MENU:
                    menu.update();
                    break;
                case FIGHT:
                    fight.update();
                    break;
                case END:
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    private void render() {
        BufferStrategy bs = getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3); // puts 2 frames in the buffer and 1 on the screen. (2) would have 1 frame buffer and 1 on the screen. more buffers are not useful. 3 is best max.
            requestFocus();
            return;
        }
        screen.clear();
        Graphics g = bs.getDrawGraphics();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), null);

        switch (state) {
            case GAME:
                int xScroll = player.x - screen.width / 2;
                int yScroll = player.y - screen.height / 2; //centering the player
                level.render(xScroll, yScroll, screen);
                player.render(screen);
                for (int i = 0; i < pixels.length; i++) {
                    pixels[i] = screen.pixels[i];
                }
                break;
            case MENU:
                menu.render(screen, g);
                for (int i = 0; i < pixels.length; i++) {
                    pixels[i] = screen.pixels[i];
                }
                break;
            case FIGHT:
                screen.renderBattlefield();
                for (int i = 0; i < pixels.length; i++) {
                    pixels[i] = screen.pixels[i];
                }
                break;
            default:
                break;
        }

        //Graphic stuff goes here
        g.setFont(new Font("Calibri", 0, 50));
        g.dispose();
        bs.show();
    }

    private void checkGrassforWildPkmn() {
        if (!player.isWalking()) {

        }
        if (player.isWalking()) {
            //Player is walking but has not advanced a tile
            if ((player.getOldTileX() == player.getTileX()) && (player.getOldTileY() == player.getTileY())) {

            } else {
                //TODO: das funktioniert nicht, wenn der spieler direkt unter einem anderen Tile läuft, position ist zu hoch!
                if (level.getTile(player.getTileX(), player.getTileY()) == Tile.spawn_tall_grass) {
                    if (Math.random() <= 0.1) {
                        changeGameState("FIGHT");
                        fight.startFight();
                    }
                }

            }
        }

    }
    
    public List<Pokemon> getTeam(){
        return team;
    }
    public Level getLevel(){
        return level;
    }

}
