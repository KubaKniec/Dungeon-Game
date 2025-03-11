package jakub.kniec.dungeongame;

import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;
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
        "avatars/avatar10.png"
    );

    public List<Texture> getRandomAvatars() {
        List<Texture> randomAvatars = new ArrayList<>();
        List<Integer> ids = getRandomIds();
        for (int i = 0; i < 3; i++){
            randomAvatars.add(new Texture(avatars.get(ids.get(i))));
        }
        return randomAvatars;
    }

    private List<Integer> getRandomIds() {
        int id;
        List<Integer> ids = new ArrayList<>();
        while (ids.size()<3){
            id = random.nextInt(0,10);
            if (!ids.contains(id))
                ids.add(id);
        }
        return ids;
    }
}
