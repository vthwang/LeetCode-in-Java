import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CandyTest {
    Candy Candy = new Candy();

    @Test
    void Example1() {
        int[] ratings = {1, 0, 2};
        int results = Candy.candy(ratings);
        int expectedResults = 5;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] ratings = {1, 2, 2};
        int results = Candy.candy(ratings);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }
}
