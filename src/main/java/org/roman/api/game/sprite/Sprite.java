package org.roman.api.game.sprite;

import org.roman.api.game.base.HasSpeed;
import org.roman.api.game.base.Movable;
import org.roman.api.game.util.Coords;

public class Sprite {
    protected Coords coords;
    public Sprite(Coords coords) {
        this.coords = coords;
    }

    public boolean isMovable() {
        return (this instanceof Movable);
    }

    public boolean hasSpeed() {
        return (this instanceof HasSpeed);
    }

    public Coords getCoords() {
        return coords;
    }
}
