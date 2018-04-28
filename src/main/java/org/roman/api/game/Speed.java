package org.roman.api.game;

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
}
