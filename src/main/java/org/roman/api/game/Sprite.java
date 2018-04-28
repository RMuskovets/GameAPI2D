package org.roman.api.game;

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
