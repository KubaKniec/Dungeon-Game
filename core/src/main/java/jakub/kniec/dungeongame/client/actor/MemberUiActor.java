package jakub.kniec.dungeongame.client.actor;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import jakub.kniec.dungeongame.server.Member;
import jakub.kniec.dungeongame.client.LibgdxUtils;


import java.util.ArrayList;
import java.util.List;


public class MemberUiActor extends Group { // zrobiłem Group bo musiałem dodać hireButton jako Actor
    public static final float WIDTH = 180;
    public static final float HEIGHT = 480;
    private Member member;
    private List<Label> labels;
    private Texture avatar;
    private static final float PADDING_AVATAR = 10;
    private static final float PADDING_TEXT = 40;
    private ClickableActor hireButton;


    public MemberUiActor(Member member, float x, float y) {
        this.member = member;
        setBounds(x, y, WIDTH, HEIGHT);
        labels = new ArrayList<>();
        labels.add(LibgdxUtils.createLabel(member.getName()));
        for (int i = 1; i < 6; i++) {
            labels.add(LibgdxUtils.createLabel(member.getInfo().get(i)));
        }
        String avatarName = member.getAvatar();
        avatar = new Texture("avatars/" + avatarName + ".png");
        hireButton = new ClickableActor(getWidth()/4, 10, getWidth()*0.5f, getHeight()*0.1f, "Hire", () -> {
            System.out.println("Hired: " + member.getName());
        });

        addActor(hireButton);
//
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
        float avatarX = getX() + PADDING_AVATAR; // Wyśrodkowany poziomo
        float avatarY = getY() + PADDING_AVATAR + getHeight()-getWidth();
        batch.draw(avatar, avatarX, avatarY, getWidth() - PADDING_AVATAR*2, getWidth() - PADDING_AVATAR*2);

        // Rysowanie napisów pod avatarem
        float textY = avatarY - PADDING_TEXT;

        // Rysowanie statów
        for (Label label : labels) {
            label.setPosition(getX() + 10, textY);
            label.draw(batch, parentAlpha);
            textY -= 35; // Odstęp między liniami
        }


        super.draw(batch,parentAlpha); //dlaczego bez super nie działa (hireButton.draw)
    }


}
