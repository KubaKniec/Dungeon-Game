package jakub.kniec.dungeongame.Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import jakub.kniec.dungeongame.Actor.ClickableActor;
import jakub.kniec.dungeongame.DungeonGame;
import jakub.kniec.dungeongame.Enum.ButtonType;
import jakub.kniec.dungeongame.Enum.ScreenType;

public abstract class MyScreen implements Screen {
    private DungeonGame dungeonGame;
    Stage stage;
    private OrthographicCamera camera;
    private Texture background;
    public MyScreen(DungeonGame dungeonGame) {
        this.dungeonGame = dungeonGame;
        stage = new Stage(new ScreenViewport(), dungeonGame.getBatch());
        camera = new OrthographicCamera();
        camera.setToOrtho(false, DungeonGame.WIDTH, DungeonGame.HEIGHT);
        Gdx.input.setInputProcessor(stage);
        background = new Texture(getBackgroundFile());
        if (!getScreenType().equals(ScreenType.CITY)) {
            ClickableActor back = new ClickableActor(100,80,100,75,"Back", ButtonType.BACK, ()->
                dungeonGame.changeScreen(ScreenType.CITY));
            stage.addActor(back);
        }


    }
    abstract public String getBackgroundFile();

    abstract public ScreenType getScreenType();
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(Color.DARK_GRAY);
        camera.update();
        dungeonGame.getBatch().setProjectionMatrix(camera.combined);
        stage.act(delta);
        dungeonGame.getBatch().begin();
        dungeonGame.getBatch().draw(background, 0,0, DungeonGame.WIDTH, DungeonGame.HEIGHT);
        dungeonGame.getBatch().end();
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
