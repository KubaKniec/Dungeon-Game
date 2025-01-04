package jakub.kniec.dungeongame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class CityScreen implements Screen {
    private DungeonGame dungeonGame;
    private Stage stage;
    private OrthographicCamera camera;
    private Texture background;

    public CityScreen(DungeonGame dungeonGame) {
        this.dungeonGame = dungeonGame;
        stage = new Stage(new ScreenViewport(), dungeonGame.getBatch());
        camera = new OrthographicCamera();
        camera.setToOrtho(false, DungeonGame.WIDTH, DungeonGame.HEIGHT);
        Gdx.input.setInputProcessor(stage);
        Building building = new Building();
        stage.addActor(building);
        background = new Texture("BackgroundCity.jpg");
    }
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
