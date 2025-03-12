package jakub.kniec.dungeongame.client;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.Align;

public class LibgdxUtils {
    private static Texture filledRectangleTexture;

    public static Texture getFilledRectangleTexture() {
        if (filledRectangleTexture == null) {
            Pixmap pixmap = new Pixmap(1, 1, Pixmap.Format.RGBA8888);
            pixmap.setColor(1, 1, 1, 1); // Biały kolor
            pixmap.fill();
            filledRectangleTexture = new Texture(pixmap);
            pixmap.dispose();
        }
        return filledRectangleTexture;
    }

    public static Label createLabel(String text) {
        Label.LabelStyle labelStyle = new Label.LabelStyle();
        labelStyle.font = new BitmapFont();
        labelStyle.font.getData().scale(1);
        labelStyle.fontColor = Color.WHITE;
        Label label = new Label(text, labelStyle);
        label.setAlignment(Align.center);
        return label;
    }
}
