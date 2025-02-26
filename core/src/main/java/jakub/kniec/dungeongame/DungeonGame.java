package jakub.kniec.dungeongame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import jakub.kniec.dungeongame.Enum.ScreenType;
import jakub.kniec.dungeongame.Screen.BlacksmithScreen;
import jakub.kniec.dungeongame.Screen.CityScreen;
import jakub.kniec.dungeongame.Screen.FightScreen;
import jakub.kniec.dungeongame.Screen.TavernScreen;

public class DungeonGame extends Game {
    public static final int WIDTH = 1472;
    public static final int HEIGHT = 832;
    private SpriteBatch batch;



    @Override
    public void create() {
        batch = new SpriteBatch();
        changeScreen(ScreenType.CITY);

    }

    public void changeScreen(ScreenType screenType) {
        switch (screenType){
            case CITY:
                setScreen(new CityScreen(this));
            break;
            case FIGHT:
                setScreen(new FightScreen(this));
                break;
            case TAVERN:
                setScreen(new TavernScreen(this));
                break;
            case BLACKSMITH:
                setScreen(new BlacksmithScreen(this));
                break;
        }
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

    public SpriteBatch getBatch() {
        return batch;
    }
}
