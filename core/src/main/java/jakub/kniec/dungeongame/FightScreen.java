package jakub.kniec.dungeongame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class FightScreen implements Screen {
    private DungeonGame dungeonGame;
    private Stage stage;
    private OrthographicCamera camera;

    public FightScreen(DungeonGame dungeonGame) {
        this.dungeonGame = dungeonGame;
        stage = new Stage(new ScreenViewport(), dungeonGame.getBatch());
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 640, 480);
        Gdx.input.setInputProcessor(stage);
        PlayerActor playerActor = new PlayerActor();
        stage.addActor(playerActor);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(Color.DARK_GRAY);
        camera.update();
        dungeonGame.getBatch().setProjectionMatrix(camera.combined);
        stage.act(delta); //aktorzy wykonują swoje akcje
        stage.draw(); //renderujemy aktora dla danej klatki
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
