import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfWaysOfCuttingAPizzaTest {
    NumberOfWaysOfCuttingAPizza NumberOfWaysOfCuttingAPizza = new NumberOfWaysOfCuttingAPizza();

    @Test
    void Example1() {
        String[] pizza = {"A..", "AAA", "..."};
        int k = 3;
        int results = NumberOfWaysOfCuttingAPizza.ways(pizza, k);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String[] pizza = {"A..", "AA.", "..."};
        int k = 3;
        int results = NumberOfWaysOfCuttingAPizza.ways(pizza, k);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String[] pizza = {"A..","A..","..."};
        int k = 1;
        int results = NumberOfWaysOfCuttingAPizza.ways(pizza, k);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }
}
