package jakub.kniec.dungeongame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class DungeonGame extends Game {
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
