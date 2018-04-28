package org.roman.api.game;

public class Coords {
    private int x, y;

    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void append(int value, Direction dir) {
        switch (dir) {
            case UP: this.y -= value; break;
            case DOWN: this.y += value; break;
            case RIGHT: this.x += value; break;
            case LEFT: this.x -= value; break;
        }
    }

    public enum Direction {
        LEFT, RIGHT, UP, DOWN
    }
}
