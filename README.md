# TestLab

This lab contains JUnit 5 tests for two Asteroids components.

It follows the component implementations in the earlier labs. The next exercise moves game scoring to a separate service in [MicroServiceLab](https://github.com/IlyasOsman29/MicroServiceLab).

- `PlayerProcessorTest` checks rotation and movement with known input.
- `CollisionDetectorTest` checks when two circles overlap.

Run the tests with JDK 21 and Maven:

```text
mvn clean verify
```

The tests use the real `GameData` class, so Mockito is not needed here.
