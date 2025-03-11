package jakub.kniec.dungeongame.Screen;

import jakub.kniec.dungeongame.Actor.ClickableActor;
import jakub.kniec.dungeongame.Actor.MemberUiActor;
import jakub.kniec.dungeongame.CharacterAvatars;
import jakub.kniec.dungeongame.DungeonGame;
import jakub.kniec.dungeongame.Enum.ButtonType;
import jakub.kniec.dungeongame.Enum.ScreenType;
import jakub.kniec.dungeongame.Member;

public class TavernScreen extends MyScreen {

    public TavernScreen(DungeonGame dungeonGame){
        super(dungeonGame);

        Member member = new Member();
        float centerX = (DungeonGame.WIDTH - 150) / 2f;  // Szerokość ekranu - szerokość aktora / 2
        float centerY = (DungeonGame.HEIGHT - 400) / 2f; // Wysokość ekranu - wysokość aktora / 2
        MemberUiActor memberUiActor = new MemberUiActor(member, centerX, centerY);

        stage.addActor(memberUiActor);


        ClickableActor temp = new ClickableActor(100,550,100,75,"temp", ButtonType.NORMAL, () ->{});
//        ClickableActor rest = new ClickableActor(1000,550,100,75,"Rest", ButtonType.NORMAL, () ->{});
//        ClickableActor crew = new ClickableActor(550,300,100,75,"Crew", ButtonType.NORMAL, () ->{});

//        stage.addActor(rest);
        stage.addActor(temp);
//        stage.addActor(crew);
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
