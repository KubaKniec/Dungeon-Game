package jakub.kniec.dungeongame.server;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<Member> membersToBuy;
    private EventDispatcher eventDispatcher;


    public Service() {
//        this.eventDispatcher = eventDispatcher;
        membersToBuy = createMembers();
    }

    public void startGame() {
        eventDispatcher.fire(new PlayerEnteredTownEvent());
    }
    public List<Member> getMembersToBuy() {
        return membersToBuy;
    }
    private List<Member> createMembers() {
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            members.add(new Member());
        }
        return members;
    }

    //wszystkie info
    //listy memberów
    //kasa
}
