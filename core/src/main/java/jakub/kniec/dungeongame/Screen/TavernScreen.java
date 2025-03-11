package jakub.kniec.dungeongame.Screen;

import jakub.kniec.dungeongame.Actor.ClickableActor;
import jakub.kniec.dungeongame.Actor.MemberUiActor;
import jakub.kniec.dungeongame.CharacterAvatars;
import jakub.kniec.dungeongame.DungeonGame;
import jakub.kniec.dungeongame.Enum.ButtonType;
import jakub.kniec.dungeongame.Enum.ScreenType;
import jakub.kniec.dungeongame.Member;
import jakub.kniec.dungeongame.MemberGroup;

public class TavernScreen extends MyScreen {

    public TavernScreen(DungeonGame dungeonGame){
        super(dungeonGame);

        MemberGroup memberGroup = new MemberGroup(100,400);


        stage.addActor(memberGroup);
//        ClickableActor temp = new ClickableActor(100,550,100,75,"temp", () ->{});
//        stage.addActor(temp);
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
