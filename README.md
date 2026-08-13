# TestLab

This lab contains JUnit 5 tests for two Asteroids components.

- `PlayerProcessorTest` checks rotation and movement with known input.
- `CollisionDetectorTest` checks when two circles overlap.

Run the tests with JDK 21 and Maven:

```text
mvn clean verify
```

The tests use the real `GameData` class, so Mockito is not needed here.
