package org.roman.api.game.sprite;

import org.roman.api.game.base.Drawable;
import org.roman.api.game.base.HasSpeed;
import org.roman.api.game.base.Movable;
import org.roman.api.game.ui.Context;
import org.roman.api.game.util.Coords;

import java.util.Objects;

public class Sprite implements Drawable {
    protected Coords coords;
    protected int width, height;
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

    public boolean collides(Sprite another) {
        int mx = coords.getX(), mx2 = mx + width;
        int ox = another.coords.getX(), ox2 = ox + width;

        int my = coords.getX(), my2 = my + height;
        int oy = another.coords.getY(), oy2 = oy + height;

        boolean x = (mx <= ox || mx2 >= ox2);
        boolean y = (my <= oy || my2 >= oy2);
        return x || y;
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Sprite)) return false;
        Sprite x = (Sprite) o;
        boolean coord = (x.coords.getX() == coords.getX()) && (x.coords.getY() == coords.getY());
        boolean size = (x.width == width) && (x.height == height);
        return coord && size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coords, width, height);
    }

    @Override
    public void draw(Context context) {
        throw new UnsupportedOperationException();
    }
}
