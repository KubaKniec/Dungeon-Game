package jakub.kniec.dungeongame;

import com.badlogic.gdx.scenes.scene2d.Group;
import jakub.kniec.dungeongame.Actor.MemberUiActor;

public class MemberGroup extends Group {
    private static final float SPACE = 20;

    public MemberGroup(float x, float y) {
        setPosition(x, y);

        for (int i = 0; i < 3; i++) {
            Member member = new Member();
            MemberUiActor memberUiActor = new MemberUiActor(member, i * (230 + SPACE), 0);
            addActor(memberUiActor);
        }
    }
}
