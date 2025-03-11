package jakub.kniec.dungeongame.Screen;

import jakub.kniec.dungeongame.Actor.ClickableActor;
import jakub.kniec.dungeongame.DungeonGame;
import jakub.kniec.dungeongame.Enum.ButtonType;
import jakub.kniec.dungeongame.Enum.ScreenType;

public class BlacksmithScreen extends MyScreen{
    public BlacksmithScreen(DungeonGame dungeonGame){
        super(dungeonGame);
        ClickableActor buy = new ClickableActor(490,80,100,75,"Buy", () ->{});
        ClickableActor sell = new ClickableActor(690,80,100,75,"Sell", () ->{});
        ClickableActor forge = new ClickableActor(890,80,100,75,"Forge", () ->{});
        stage.addActor(buy);
        stage.addActor(sell);
        stage.addActor(forge);

    }
    @Override
    public String getBackgroundFile() {
        return "Blacksmith.png";
    }

    @Override
    public ScreenType getScreenType() {
        return ScreenType.BLACKSMITH;
    }
}
