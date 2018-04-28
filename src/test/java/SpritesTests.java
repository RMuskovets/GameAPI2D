import org.junit.Test;
import org.roman.api.game.*;

public class SpritesTests {
    @Test
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

    @Test
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
            sprite.appendSpeed(0, 1);
            i++;
        }
    }
}
