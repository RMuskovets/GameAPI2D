package org.roman.api.game.util;

import static org.roman.api.game.util.Coords.Direction;

public class Speed {
    private int x, y;

    public Speed(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getXSpeed() {
        return x;
    }

    public int getYSpeed() {
        return y;
    }

    public void setXSpeed(int x) {
        this.x = x;
    }

    public void setYSpeed(int y) {
        this.y = y;
    }

    @Deprecated
    public void faster(int val, Direction dir) {
        switch (dir) {
            case UP: y -= val; break;
            case DOWN: y += val; break;
            case RIGHT: x += val; break;
            case LEFT: x -= val; break;
        }
    }

    @Deprecated
    public void slower(int v, Direction dir) {
        faster(-v, dir);
    }

    public void faster(Direction dir) {
        switch (dir) {
            case UP: faster(y, dir); break;
            case DOWN: slower(y, dir); break;
            case LEFT: slower(x, dir); break;
            case RIGHT: faster(x, dir); break;
        }
    }

    public void slower(Direction dir) {
        switch (dir) {
            case UP: faster(-y, dir); break;
            case DOWN: slower(-y, dir); break;
            case LEFT: slower(-x, dir); break;
            case RIGHT: faster(-x, dir); break;
        }
    }
}
