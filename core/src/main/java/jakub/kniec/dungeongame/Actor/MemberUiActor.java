package jakub.kniec.dungeongame.Actor;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import jakub.kniec.dungeongame.Member;
import jakub.kniec.dungeongame.LibgdxUtils;


import java.util.List;

public class MemberUiActor extends Actor {
    private Member member;
    private List<Label> labels;


    public MemberUiActor(Member member, float x, float y) {
        this.member = member;
        setBounds(x, y, 150, 400);

        labels.add(LibgdxUtils.createLabel(member.getName()));

        //TODO
        //0. zrobic portrety i wczytywanie ich oraz imiona losowe
        //1. dokończyć tak aby pojawiał się 1 member ze statami
        //2. Zrobic obiekt memberGroup za pomoca Group z gdx, który będzie miał kilka member actorów i bedą od lewej do prawej
        //3. 3 komponenty na 3 grupy do kupienia, obecny team, niekatywni

    }



    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(LibgdxUtils.getFilledRectangleTexture(), getX(), getY(), getWidth(), getHeight());
    }
}
