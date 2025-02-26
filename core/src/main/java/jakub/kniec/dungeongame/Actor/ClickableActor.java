package jakub.kniec.dungeongame.Actor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;
import jakub.kniec.dungeongame.Enum.ButtonType;
import jakub.kniec.dungeongame.TextureUtils;

public class ClickableActor extends Actor {
    private Label label;
    private Runnable action;
    private ButtonType buttonType;

    public ClickableActor(float x, float y, float width, float height, String text, ButtonType buttonType, Runnable action) {
        this.action = action;
        this.buttonType = buttonType;
        setBounds(x, y, width, height);

        addListener(new ClickListener(){ //todo wyjaśnic skladnie anonimowych klas
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                action.run();
                return super.touchDown(event, x, y, pointer, button);
            }
        });
    /*  addListener(new InputListener() {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                if (bounds.contains(x, y)) {
                    onClick();
                    return true;
                }
                return false;
            }
        });*/

        label = createLabel(text);

    }

    private Label createLabel(String text) {
        Label.LabelStyle labelStyle = new Label.LabelStyle();
        labelStyle.font = new BitmapFont();
        labelStyle.font.getData().scale(1);
        labelStyle.fontColor = Color.WHITE;
        Label label = new Label(text, labelStyle);
        label.setPosition(getX(), getY());
        label.setSize(getWidth(), getHeight());
        label.setAlignment(Align.center);
        return label;
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        //tło
        if (buttonType.equals(ButtonType.BACK))
            batch.setColor(Color.RED);
        else
            batch.setColor(Color.TAN);
        batch.draw(TextureUtils.getFilledRectangleTexture(), getX(), getY(), getWidth(), getHeight());
//        // Rysowanie tekstu
        label.draw(batch,parentAlpha);
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }


}

