package jakub.kniec.dungeongame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class DungeonGame extends Game {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    private SpriteBatch batch;
    private FightScreen fightScreen;

    @Override
    public void create() {
        batch = new SpriteBatch();
        fightScreen = new FightScreen(this);
        setScreen(fightScreen);
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

    public SpriteBatch getBatch() {
        return batch;
    }
}
