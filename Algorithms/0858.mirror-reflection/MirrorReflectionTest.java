import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorReflectionTest {
    MirrorReflection MirrorReflection = new MirrorReflection();

    @Test
    void Example1() {
        int p = 2, q = 1;
        int results = MirrorReflection.mirrorReflection(p, q);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int p = 3, q = 1;
        int results = MirrorReflection.mirrorReflection(p, q);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }
}
