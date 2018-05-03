package org.roman.api.game.event.key;

import org.roman.api.game.event.Event;

public class KeyEvent extends Event {
    private Key key;
    private long time;

    public KeyEvent(Key key, long time) {
        this.key = key;
        this.time = time;
    }

    public KeyEvent(Key key) {
        this.key = key;
        time = 0;
    }

    public Key getKey() {
        return key;
    }

    public long getTime() {
        return time;
    }
}
