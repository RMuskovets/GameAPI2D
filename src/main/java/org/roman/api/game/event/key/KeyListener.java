package org.roman.api.game.event.key;

import org.roman.api.game.event.Listener;

public interface KeyListener extends Listener<KeyEvent> {
    void accept(KeyEvent event);
}
