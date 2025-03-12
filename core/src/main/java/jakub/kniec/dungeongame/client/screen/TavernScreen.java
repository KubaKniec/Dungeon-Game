package jakub.kniec.dungeongame.client.screen;

import jakub.kniec.dungeongame.client.DungeonGame;
import jakub.kniec.dungeongame.client.enums.ScreenType;
import jakub.kniec.dungeongame.server.Member;
import jakub.kniec.dungeongame.client.MemberGroup;
import jakub.kniec.dungeongame.server.Service;

import java.util.List;

public class TavernScreen extends MyScreen {
    private MemberGroup memberGroupToBuy;
    private MemberGroup memberGroupActive;
    private MemberGroup memberGroupNotActive;

    public TavernScreen(DungeonGame dungeonGame, Service service){
        super(dungeonGame);
        List<Member> existingMembersToBuy = service.getMembersToBuy();
//        List<Member> existingMembersActive = dungeonGame.getMembersActive();
//        List<Member> existingMembersNotActive = dungeonGame.getMembersNotActive();
        memberGroupToBuy = new MemberGroup(100,400,existingMembersToBuy);
//        memberGroupActive = new MemberGroup(500,400,existingMembersActive);
//        memberGroupNotActive = new MemberGroup(1000,400,existingMembersNotActive);
        stage.addActor(memberGroupToBuy);
//        stage.addActor(memberGroupActive);
//        stage.addActor(memberGroupNotActive);
    }

    @Override
    public String getBackgroundFile() {
        return "Tavern.jpg";
    }

    @Override
    public ScreenType getScreenType() {
        return ScreenType.TAVERN;
    }
}
