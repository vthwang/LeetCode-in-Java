import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoatsToSavePeopleTest {
    BoatsToSavePeople boatsToSavePeople = new BoatsToSavePeople();

    @Test
    void Example1() {
        int[] people = {1, 2};
        int limit = 3;

        Assertions.assertEquals(1, boatsToSavePeople.numRescueBoats(people, limit));
    }

    @Test
    void Example2() {
        int[] people = {3, 2, 2, 1};
        int limit = 3;

        Assertions.assertEquals(3, boatsToSavePeople.numRescueBoats(people, limit));
    }

    @Test
    void Example3() {
        int[] people = {3, 5, 3, 4};
        int limit = 5;

        Assertions.assertEquals(4, boatsToSavePeople.numRescueBoats(people, limit));
    }
}
