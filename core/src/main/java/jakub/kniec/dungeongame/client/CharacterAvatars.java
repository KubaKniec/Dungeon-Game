package jakub.kniec.dungeongame.client;

import com.badlogic.gdx.graphics.Texture;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CharacterAvatars {
    Random random = new Random();
    public static final List<String> avatars = Arrays.asList(
        "avatar1",
        "avatar2",
        "avatar3",
        "avatar4",
        "avatar5",
        "avatar6",
        "avatar7",
        "avatar8",
        "avatar9",
        "avatar10",
        "avatar11",
        "avatar12",
        "avatar13",
        "avatar14",
        "avatar15",
        "avatar16",
        "avatar17",
        "avatar18",
        "avatar19",
        "avatar20",
        "avatar21",
        "avatar22",
        "avatar23",
        "avatar24"
    );

    public String getRandomAvatar() {
        return avatars.get(random.nextInt(0,avatars.size()));
    }
}
