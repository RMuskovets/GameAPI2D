package org.roman.api.game.ui;

import javax.swing.*;
import java.awt.*;

public interface Context {
    void paintComponent(Graphics g);
    void drawRect(int x, int y, int x2, int y2, int c);
    void drawRect(int x, int y, int x2, int y2, Color c);
    void drawImage(int x, int y, int x2, int y2, int mat[][]);
    void rotateSelf();
    void fillRect(int x, int y, int x2, int y2, int c);
    void fillRect(int x, int y, int x2, int y2, Color c);
    JPanel getPaint();
}
