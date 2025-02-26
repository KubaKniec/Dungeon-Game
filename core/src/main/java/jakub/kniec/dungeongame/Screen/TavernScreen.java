package jakub.kniec.dungeongame.Screen;

import jakub.kniec.dungeongame.Actor.ClickableActor;
import jakub.kniec.dungeongame.DungeonGame;
import jakub.kniec.dungeongame.Enum.ButtonType;
import jakub.kniec.dungeongame.Enum.ScreenType;

public class TavernScreen extends MyScreen {

    public TavernScreen(DungeonGame dungeonGame){
        super(dungeonGame);
        ClickableActor buy = new ClickableActor(550,550,100,75,"Buy", ButtonType.NORMAL, () ->{});
        ClickableActor rest = new ClickableActor(1000,550,100,75,"Rest", ButtonType.NORMAL, () ->{});
        ClickableActor crew = new ClickableActor(550,300,100,75,"Crew", ButtonType.NORMAL, () ->{});
        stage.addActor(rest);
        stage.addActor(buy);
        stage.addActor(crew);
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
