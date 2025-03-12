package jakub.kniec.dungeongame.client;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Group;
import jakub.kniec.dungeongame.client.DungeonGame;

public class Building extends Group {
    private Texture texture;

    public Building() {
        texture = new Texture(Gdx.files.internal("libgdx.png")); //todo zmienić na obrazek miasta
        setBounds(0,0, DungeonGame.WIDTH,DungeonGame.HEIGHT);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
//        batch.draw(texture, getX(), getY(), getWidth(), getHeight());
    }
}
