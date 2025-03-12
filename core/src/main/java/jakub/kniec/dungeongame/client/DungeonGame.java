package jakub.kniec.dungeongame.client;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import jakub.kniec.dungeongame.client.enums.ScreenType;
import jakub.kniec.dungeongame.client.screen.BlacksmithScreen;
import jakub.kniec.dungeongame.client.screen.CityScreen;
import jakub.kniec.dungeongame.client.screen.FightScreen;
import jakub.kniec.dungeongame.client.screen.TavernScreen;
import jakub.kniec.dungeongame.server.Member;
import jakub.kniec.dungeongame.server.Service;

import java.util.List;

public class DungeonGame extends Game {
    public static final int WIDTH = 1672;
    public static final int HEIGHT = 1032;
    private SpriteBatch batch;
    private Service service;
    private List<Member> membersActive;
    private List<Member> membersNotActive;



    @Override
    public void create() {
        batch = new SpriteBatch();
        service = new Service();
        changeScreen(ScreenType.CITY);
    }



//    public void hireMember(Member member) {
//        if (membersNotActive.size() + membersActive.size() < 5) { //MAX 5 zatrudnionych w sumie na raz
//            membersNotActive.add(member);
//            System.out.println(member);
//        }
//    }
//
//    public void setActive(Member member) {
//        if (membersActive.size() < 3) {
//            membersActive.add(member);
//            membersNotActive.remove(member);
//        }
//    }
//    public void setNotActive(Member member) {
//        membersNotActive.add(member);
//        membersActive.remove(member);
//    }
//
//    public void dismissMember(Member member) {
//        if (membersActive.contains(member))
//            membersActive.remove(member);
//        else
//            membersNotActive.remove(member);
//    }

    public void changeScreen(ScreenType screenType) {
        switch (screenType){
            case CITY:
                setScreen(new CityScreen(this));
            break;
            case FIGHT:
                setScreen(new FightScreen(this));
                break;
            case TAVERN:
                setScreen(new TavernScreen(this, service));
                break;
            case BLACKSMITH:
                setScreen(new BlacksmithScreen(this));
                break;
        }
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

    public SpriteBatch getBatch() {
        return batch;
    }



    public List<Member> getMembersActive() {
        return membersActive;
    }

    public List<Member> getMembersNotActive() {
        return membersNotActive;
    }
}

/*
* Klik hire
* Event-> kupuję
* backend: -> zakupino
* Event-> kupiono
* */
