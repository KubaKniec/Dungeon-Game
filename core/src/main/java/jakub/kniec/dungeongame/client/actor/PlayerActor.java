package jakub.kniec.dungeongame.client.actor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class PlayerActor extends Actor {
    private Texture texture;

    public PlayerActor() {
        texture = new Texture(Gdx.files.internal("libgdx.png"));
        setBounds(10,15,100,200);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(texture, getX(), getY(), getWidth(), getHeight());
    }
}
