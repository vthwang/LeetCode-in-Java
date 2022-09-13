import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AsteroidCollisionTest {
    AsteroidCollision AsteroidCollision = new AsteroidCollision();

    @Test
    void Example1() {
        int[] asteroids = {5, 10, -5};
        int[] results = AsteroidCollision.asteroidCollision(asteroids);
        int[] expectedResults = {5, 10};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] asteroids = {8, -8};
        int[] results = AsteroidCollision.asteroidCollision(asteroids);
        int[] expectedResults = {};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] asteroids = {10, 2, -5};
        int[] results = AsteroidCollision.asteroidCollision(asteroids);
        int[] expectedResults = {10};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
