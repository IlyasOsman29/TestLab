package dk.sdu.cbse.testlab;

import java.util.HashSet;
import java.util.Set;

public final class GameData {
    private final Set<String> pressedKeys = new HashSet<>();
    public void press(String key) { pressedKeys.add(key); }
    public boolean isPressed(String key) { return pressedKeys.contains(key); }
}
