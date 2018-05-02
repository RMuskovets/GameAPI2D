package org.roman.api.game.main;

import org.roman.api.game.ui.Context;

public interface Game {
    void main();
    Context getDrawingContext();
    static Game load(String clazz) throws Exception {
        Class g = Class.forName(clazz);
        return (Game) g.newInstance();
    }
    String getTitle();
}
