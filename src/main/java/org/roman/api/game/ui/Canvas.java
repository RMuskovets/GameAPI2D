package org.roman.api.game.ui;

import org.roman.api.game.util.Util;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Arrays;

public class Canvas extends JPanel implements Context {

    private int matrix[][], w, h;

    public Canvas(int w, int h) {
        this.w = w;
        this.h = h;
        matrix = new int[h][w];
    }

    @Override
    public void paintComponent(Graphics g) {
        BufferedImage img = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                img.setRGB(x, y, matrix[y][x]);
            }
        }
    }

    @Override
    public void drawRect(int x, int y, int x2, int y2, int c) {
        for (int dx = y; dx < y2; dx++) {
            int toDraw[] = new int[y2-y];
            if (dx == 0 || dx == y2-1) {
                Arrays.fill(toDraw, c);
            } else {
                toDraw[0] = c;
                toDraw[y2-y-1] = c;
            }
            matrix[dx] = toDraw;
        }
    }

    @Override
    public void drawRect(int x, int y, int x2, int y2, Color c) {
        drawRect(x, y, x2, y2, c.getRGB());
    }

    @Override
    public void drawImage(int x, int y, int x2, int y2, int[][] mat) {
        for (int dy = y; dy < y2; dy++) {
            for (int dx = x; dx < x2; dx++) {
                matrix[dy][dx] = mat[dy-y][dx-x];
            }
        }
    }

    @Override
    public void rotateSelf() {
        Util.rotateMatrix(w, matrix);
    }

    @Override
    public void fillRect(int x, int y, int x2, int y2, int c) {
        for (int dy = y; dy<y2;dy++) {
            for (int dx = x; dx < x2; dx++) {
                matrix[dy][dx] = c;
            }
        }
    }

    @Override
    public void fillRect(int x, int y, int x2, int y2, Color c) {
        fillRect(x, y, x2, y2, c.getRGB());
    }

    public JPanel getPaint() {
        return this;
    }
}
