import org.junit.Ignore;
import org.junit.Test;
import org.roman.api.game.base.*;
import org.roman.api.game.sprite.*;
import org.roman.api.game.util.*;

import java.util.Arrays;

public class SpritesTests {

    @Test @Ignore
    public void testSpriteClass() {
        new Sprite(new Coords(1, 1));
    }

    @Test
    public void testMovable() {
        new Movable() {
            @Override
            public Speed speed() {
                return new Speed(5, 3);
            }

            @Override
            public void move() {
                System.out.println(speed().getXSpeed() * 28);
            }
        }.move();
    }

    @Test @Ignore
    public void testHasSpeed() {
        ((HasSpeed) () -> new Speed(1, 0)).speed();
    }

    @Test
    public void testMovableSprite() {
        MovableSprite sprite = new MovableSprite(12, 12);
        int i = 0;
        while (i < 5) {
            sprite.move();
            System.out.println("\n\n");
            System.out.println(sprite.getCoords().getX());
            System.out.println(sprite.getCoords().getY());
            //sprite.appendSpeed(0, 1);
            i++;
        }
    }

    @Test
    public void testCoords() {
        Coords x = new Coords(1, 2);
    }

    @Test
    public void testUtil() {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        } System.out.println("=======================");
        Util.rotateMatrix(4, matrix);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        } System.out.println("=======================");
    }

    @Test @Ignore
    public void testSpeed() {
        new Speed(13, 26).getXSpeed();
    }
}
