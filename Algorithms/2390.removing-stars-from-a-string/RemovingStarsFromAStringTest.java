import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemovingStarsFromAStringTest {
    RemovingStarsFromAString removingStarsFromAString = new RemovingStarsFromAString();

    @Test
    void Example1() {
        String s = "leet**cod*e";

        Assertions.assertEquals("lecoe", removingStarsFromAString.removeStars(s));
    }

    @Test
    void Example2() {
        String s = "erase*****";

        Assertions.assertEquals("", removingStarsFromAString.removeStars(s));
    }
}
