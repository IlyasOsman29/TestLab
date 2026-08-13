package dk.sdu.cbse.testlab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerProcessorTest {
    @Test
    void movesPlayerForKnownInputAndDeltaTime() {
        Entity player = new Entity(100, 50, 16);
        GameData data = new GameData();
        data.press("UP");

        new PlayerProcessor().process(player, data, 1.0);

        assertEquals(190.0, player.x(), 0.0001);
        assertEquals(50.0, player.y(), 0.0001);
        assertEquals(90.0, player.velocityX(), 0.0001);
    }

    @Test
    void rotationChangesBeforeThrustDirectionIsCalculated() {
        Entity player = new Entity(0, 0, 16);
        GameData data = new GameData();
        data.press("RIGHT");
        data.press("UP");

        new PlayerProcessor().process(player, data, 0.5);

        assertEquals(90.0, player.rotation(), 0.0001);
        assertEquals(0.0, player.x(), 0.0001);
        assertEquals(22.5, player.y(), 0.0001);
    }
}
