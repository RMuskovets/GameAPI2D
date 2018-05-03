package org.roman.api.game.ui;

import org.roman.api.game.event.key.*;

import java.awt.event.KeyAdapter;
import java.util.*;

import static java.awt.event.KeyEvent.*;

public class MainPanel extends Canvas {
    private List<KeyListener> keyListeners = new ArrayList<>();
    public MainPanel(int w, int h) {
        super(w, h);
        addKeyListener(new KeyAdapter() {
            long time = 0;
            long lastPressTime = 0;
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                lastPressTime = System.currentTimeMillis();
            }

            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                time = System.currentTimeMillis() - lastPressTime;
                lastPressTime = 0;
                Key key = Key.UNKNOWN;
                switch (e.getKeyCode()) {
                    case VK_0: key = Key.K0; break;
                    case VK_1: key = Key.K1; break;
                    case VK_2: key = Key.K2; break;
                    case VK_3: key = Key.K3; break;
                    case VK_4: key = Key.K4; break;

                }
                for (KeyListener listen : keyListeners) {
                    listen.accept(new KeyEvent(key, time));
                }
            }
        });
    }

    public void addKeyListener(KeyListener listener) {
        keyListeners.add(listener);
    }
}
