package jakub.kniec.dungeongame.Screen;

import jakub.kniec.dungeongame.Actor.ClickableActor;
import jakub.kniec.dungeongame.DungeonGame;
import jakub.kniec.dungeongame.Enum.ButtonType;
import jakub.kniec.dungeongame.Enum.ScreenType;

public class CityScreen extends MyScreen {

    public CityScreen(DungeonGame dungeonGame) {
        super(dungeonGame);
        ClickableActor tavern = new ClickableActor(750,80,100,75,"Tavern", ButtonType.NORMAL, () ->
            dungeonGame.changeScreen(ScreenType.TAVERN));
        ClickableActor blacksmith = new ClickableActor(1015,80,150,75,"Blacksmith",ButtonType.NORMAL, () ->
            dungeonGame.changeScreen(ScreenType.BLACKSMITH));
        ClickableActor adventure = new ClickableActor(900,600,150,75,"Adventure",ButtonType.NORMAL, () ->{});

        stage.addActor(tavern);
        stage.addActor(blacksmith);
        stage.addActor(adventure);

    }

    @Override
    public String getBackgroundFile() {
        return "BackgroundCity.jpg";
    }

    @Override
    public ScreenType getScreenType() {
        return ScreenType.CITY;
    }
}
