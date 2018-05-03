package org.roman.api.game.event;

public interface Listener<T extends Event> {
    void accept(T event);
}
