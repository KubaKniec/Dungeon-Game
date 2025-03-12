package jakub.kniec.dungeongame.client.screen;

import jakub.kniec.dungeongame.client.actor.ClickableActor;
import jakub.kniec.dungeongame.client.DungeonGame;
import jakub.kniec.dungeongame.client.enums.ScreenType;

public class CityScreen extends MyScreen {

    public CityScreen(DungeonGame dungeonGame) {
        super(dungeonGame);
        ClickableActor tavern = new ClickableActor(850,80,100,75,"Tavern",  () ->
            dungeonGame.changeScreen(ScreenType.TAVERN));
        ClickableActor blacksmith = new ClickableActor(1150,80,150,75,"Blacksmith", () ->
            dungeonGame.changeScreen(ScreenType.BLACKSMITH));
        ClickableActor adventure = new ClickableActor(900,600,150,75,"Adventure", () ->{});

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
