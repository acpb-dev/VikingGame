package cegepst.engine;

import cegepst.GamePad;
import cegepst.Player;
import cegepst.Tree;
import cegepst.World;

public class VikingGame extends Game {

    private GamePad gamePad;
    private Player player;
    private World world;
    private Tree tree;

    public VikingGame() {
        gamePad = new GamePad();
        player = new Player(gamePad);
        player.teleport(200, 200);
        world = new World();
        tree = new Tree(300, 350);
    }


    @Override
    public void update() {
        player.update();
        if(gamePad.isQuitPressed()) {
            super.stop();
        }
        if(player.getY() < tree.getY() + 52) {
            tree.blockadeFromTop();
        } else {
            tree.blockadeFromBottom();
        }
    }

    @Override
    public void draw(Buffer buffer) {
        world.draw(buffer);
        if(player.getY() < tree.getY() + 52) {
            player.draw(buffer);
            tree.draw(buffer);
        } else {
            tree.draw(buffer);
            player.draw(buffer);
        }

    }


    @Override
    public void initialise() {

    }

    @Override
    public void conclude() {

    }
}