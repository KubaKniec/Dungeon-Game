package jakub.kniec.dungeongame.server;

import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.EventListener;

public interface EventDispatcher {

    void registerListener(EventListener eventListener);

    void fire(Event event);



}
