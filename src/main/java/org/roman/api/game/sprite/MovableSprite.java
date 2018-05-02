package org.roman.api.game.sprite;

import org.roman.api.game.base.Movable;
import org.roman.api.game.util.Coords;
import org.roman.api.game.util.Speed;

public class MovableSprite extends Sprite implements Movable {

    private Speed speed = new Speed(5, 0);

    public MovableSprite(int x, int y) {
        super(new Coords(x, y));
    }

    public MovableSprite(Coords coords) {
        super(coords);
    }

    @Override
    public void move() {
        coords.append(speed.getXSpeed(), Coords.Direction.RIGHT);
        coords.append(speed.getYSpeed(), Coords.Direction.DOWN);
    }

    @Override
    public Speed speed() {
        return speed;
    }

    public void appendSpeed(int x, int y) {
        speed.setXSpeed(speed.getXSpeed() + x);
        speed.setYSpeed(speed.getYSpeed() + y);
    }
}
