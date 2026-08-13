# TestLab

TestLab uses JUnit 5 to test actual Asteroids component behaviour without opening a GUI. `PlayerProcessorTest` supplies known input and frame time, then checks the Player entity's rotation and movement. `CollisionDetectorTest` verifies the same circle-collision rule used by the game.

```powershell
mvn clean test package
```

No Mockito dependency is needed because the component consumes the small real `GameData` object directly.
