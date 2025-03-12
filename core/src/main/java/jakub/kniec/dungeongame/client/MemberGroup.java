package jakub.kniec.dungeongame.client;

import com.badlogic.gdx.scenes.scene2d.Group;
import jakub.kniec.dungeongame.client.actor.MemberUiActor;
import jakub.kniec.dungeongame.server.Member;

import java.util.List;

public class MemberGroup extends Group {
    private static final float SPACE = 15;

    public MemberGroup(float x, float y, List<Member> members) {
        setPosition(x, y);
        for (int i = 0; i < members.size(); i++) {
            Member member = members.get(i);
            MemberUiActor memberUiActor = new MemberUiActor(member, i * MemberUiActor.WIDTH + SPACE * i, 0);
            addActor(memberUiActor);
        }
    }
}
