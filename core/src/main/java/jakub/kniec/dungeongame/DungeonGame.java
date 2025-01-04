package jakub.kniec.dungeongame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class DungeonGame extends Game {
    public static final int WIDTH = 1472;
    public static final int HEIGHT = 832;
    private SpriteBatch batch;
    private FightScreen fightScreen;
    private CityScreen cityScreen;

    @Override
    public void create() {
        batch = new SpriteBatch();
        fightScreen = new FightScreen(this);
        cityScreen = new CityScreen(this);
        setScreen(cityScreen);
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

    public SpriteBatch getBatch() {
        return batch;
    }
}
