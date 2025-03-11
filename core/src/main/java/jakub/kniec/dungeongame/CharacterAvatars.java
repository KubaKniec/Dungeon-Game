package jakub.kniec.dungeongame;

import com.badlogic.gdx.graphics.Texture;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CharacterAvatars {
    Random random = new Random();
    public static final List<String> avatars = Arrays.asList(
        "avatars/avatar1.png",
        "avatars/avatar2.png",
        "avatars/avatar3.png",
        "avatars/avatar4.png",
        "avatars/avatar5.png",
        "avatars/avatar6.png",
        "avatars/avatar7.png",
        "avatars/avatar8.png",
        "avatars/avatar9.png",
        "avatars/avatar10.png",
        "avatars/avatar11.png",
        "avatars/avatar12.png",
        "avatars/avatar13.png",
        "avatars/avatar14.png",
        "avatars/avatar15.png",
        "avatars/avatar16.png",
        "avatars/avatar17.png",
        "avatars/avatar18.png",
        "avatars/avatar19.png",
        "avatars/avatar20.png",
        "avatars/avatar21.png",
        "avatars/avatar22.png",
        "avatars/avatar23.png",
        "avatars/avatar24.png"
    );

    public Texture getRandomAvatar() {
        return new Texture(avatars.get(random.nextInt(0,avatars.size())));


    }


}
