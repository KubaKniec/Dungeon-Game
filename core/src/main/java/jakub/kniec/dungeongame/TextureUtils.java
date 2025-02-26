package jakub.kniec.dungeongame;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;

public class TextureUtils {
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
}
