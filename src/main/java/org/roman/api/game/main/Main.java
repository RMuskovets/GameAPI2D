package org.roman.api.game.main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Game g = Game.load(args[0]);
        JPanel pnl = g.getDrawingContext().getPaint();
        JFrame main = new JFrame(g.getTitle());
        main.setContentPane(pnl);
        main.setVisible(true);
    }
}
