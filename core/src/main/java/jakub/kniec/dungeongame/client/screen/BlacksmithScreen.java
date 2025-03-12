package jakub.kniec.dungeongame.client.screen;

import jakub.kniec.dungeongame.client.actor.ClickableActor;
import jakub.kniec.dungeongame.client.DungeonGame;
import jakub.kniec.dungeongame.client.enums.ScreenType;

public class BlacksmithScreen extends MyScreen{
    public BlacksmithScreen(DungeonGame dungeonGame){
        super(dungeonGame);
        ClickableActor buy = new ClickableActor(490,80,100,75,"Buy", () ->{
            System.out.println("buy ");
        });
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
