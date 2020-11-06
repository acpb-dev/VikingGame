package cegepst.engine;

import cegepst.GamePad;
import cegepst.Player;
import cegepst.World;

public class VikingGame extends Game {

    private GamePad gamePad;
    private Player player;
    private World world;

    public VikingGame() {
        gamePad = new GamePad();
        player = new Player(gamePad);
        player.teleport(200, 200);
        world = new World();
    }


    @Override
    public void update() {
        player.update();
        if(gamePad.isQuitPressed()) {
            super.stop();
        }
    }

    @Override
    public void draw(Buffer buffer) {
        world.draw(buffer);
        player.draw(buffer);
    }


    @Override
    public void initialise() {

    }

    @Override
    public void conclude() {

    }
}