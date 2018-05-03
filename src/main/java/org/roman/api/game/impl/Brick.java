package org.roman.api.game.impl;

import org.roman.api.game.sprite.Sprite;
import org.roman.api.game.ui.Context;
import org.roman.api.game.util.Coords;

import java.awt.*;

public class Brick extends Sprite {

    public static final int DEFAULT_WIDTH = 25;
    public static final int DEFAULT_HEIGHT = 15;

    private Color color = Color.RED;
    private Color outline = Color.BLACK;

    public Brick(Coords coords) {
        super(coords);
        width = DEFAULT_WIDTH;
        height = DEFAULT_HEIGHT;
    }

    public Brick(Coords coords, int w) {
        super(coords);
        width = w;
    }

    public Brick(Coords c, int w, int h) {
        super(c);
        width = w; height = h;
    }

    @Override
    public void draw(Context c) {
        c.drawRect(coords.getX(), coords.getY(), coords.getX() + width, coords.getY() + height, outline);
        int x = coords.getX(), y = coords.getY();
        c.fillRect(x + 1, y + 1, x + 1 + width, y + 1 + height, color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getOutline() {
        return outline;
    }

    public void setOutline(Color outline) {
        this.outline = outline;
    }
}
