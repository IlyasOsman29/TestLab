package dk.sdu.cbse.testlab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CollisionDetectorTest {
    @Test
    void detectsTouchingCirclesUsingPythagoras() {
        assertTrue(CollisionDetector.collides(new Entity(0, 0, 10), new Entity(15, 0, 5)));
        assertFalse(CollisionDetector.collides(new Entity(0, 0, 5), new Entity(20, 0, 5)));
    }
}
