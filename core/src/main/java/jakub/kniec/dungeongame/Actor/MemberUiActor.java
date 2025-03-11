package jakub.kniec.dungeongame.Actor;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import jakub.kniec.dungeongame.CharacterAvatars;
import jakub.kniec.dungeongame.Member;
import jakub.kniec.dungeongame.LibgdxUtils;


import java.util.ArrayList;
import java.util.List;

public class MemberUiActor extends Actor {
    private Member member;
    private List<Label> labels;
    private Texture avatar;
    private ClickableActor hireButton;
    private static final float PADDING_AVATAR = 10;
    private static final float PADDING_TEXT = 40;

    public MemberUiActor(Member member, float x, float y) {
        CharacterAvatars characterAvatars = new CharacterAvatars();
        this.member = member;
        setBounds(x, y, 230, 520);
        labels = new ArrayList<>();
        labels.add(LibgdxUtils.createLabel(member.getName()));
        for (int i = 1; i < 6; i++) {
            labels.add(LibgdxUtils.createLabel(member.getInfo().get(i)));
        }
        avatar = characterAvatars.getRandomAvatar();

        hireButton = new ClickableActor(getX() + 10, getY() + 20, 200, 50, "Hire",
            () -> System.out.println("Hired: " + member.getName())); // nie działa :(
//        hireButton.setBackgroundColor(Color.GREEN); //Dlaczego to koloruje wszystko
//        hireButton.setTextColor(Color.BLACK);


        //TODO
        //0. zrobic portrety i wczytywanie ich oraz imiona losowe DONE
        //1. dokończyć tak aby pojawiał się 1 member ze statami DONE
        //2. Zrobic obiekt memberGroup za pomoca Group z gdx, który będzie miał kilka member actorów i bedą od lewej do prawej DONE
        //3. 3 komponenty na 3 grupy do kupienia, obecny team, niekatywni

    }



    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(LibgdxUtils.getFilledRectangleTexture(), getX(), getY(), getWidth(), getHeight());

        // Rysowanie avatara
        float avatarX = getX() + (getWidth() - 200) / 2; // Wyśrodkowany poziomo
        float avatarY = getY() + getHeight() - 200 - PADDING_AVATAR;
        batch.draw(avatar, avatarX, avatarY, 200, 200);

        // Rysowanie napisów pod avatarem
        float textY = avatarY - PADDING_TEXT;

        // Rysowanie statów
        for (Label label : labels) {
            label.setPosition(getX() + 10, textY);
            label.draw(batch, parentAlpha);
            textY -= 35; // Odstęp między liniami
        }
        hireButton.draw(batch, parentAlpha);
    }


}
