package jakub.kniec.dungeongame.client.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import jakub.kniec.dungeongame.client.Building;
import jakub.kniec.dungeongame.client.DungeonGame;

public class FightScreen implements Screen {
    private DungeonGame dungeonGame;
    private Stage stage;
    private OrthographicCamera camera;

    public FightScreen(DungeonGame dungeonGame) {
        this.dungeonGame = dungeonGame;
        stage = new Stage(new ScreenViewport(), dungeonGame.getBatch());
        camera = new OrthographicCamera();
        camera.setToOrtho(false, DungeonGame.WIDTH, DungeonGame.HEIGHT);
        Gdx.input.setInputProcessor(stage);
//        PlayerActor playerActor = new PlayerActor();
        Building building = new Building();
        stage.addActor(building);
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
