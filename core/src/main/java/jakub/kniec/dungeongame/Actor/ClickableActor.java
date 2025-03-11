package jakub.kniec.dungeongame.Actor;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;
import jakub.kniec.dungeongame.Enum.ButtonType;
import jakub.kniec.dungeongame.LibgdxUtils;

public class ClickableActor extends Actor {
    private Label label;
    private Runnable action;
    private Color backgroundColor = Color.TAN;
    private Color textColor = Color.BLACK;

    public ClickableActor(float x, float y, float width, float height, String text, Runnable action) {
        this.action = action;

        setBounds(x, y, width, height);

        addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                action.run();
                return super.touchDown(event, x, y, pointer, button);
            }
        });

        label = LibgdxUtils.createLabel(text);
        label.setPosition(getX(), getY());
        label.setSize(getWidth(),getHeight());
        label.setColor(textColor);

    }

    public void setBackgroundColor(Color color) {
        this.backgroundColor = color;
    }

    public void setTextColor(Color color) {
        this.textColor = color;
        label.setColor(color);
    }


    @Override
    public void draw(Batch batch, float parentAlpha) {
        //tło
        batch.setColor(backgroundColor);
        batch.draw(LibgdxUtils.getFilledRectangleTexture(), getX(), getY(), getWidth(), getHeight());
        // Rysowanie tekstu
        label.draw(batch,parentAlpha);
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }


}

