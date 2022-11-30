import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class InsertDeleteGetrandomO1Test {
    @Test
    void Example1() {
        RandomizedSet randomizedSet = new RandomizedSet();
        Assertions.assertTrue(randomizedSet.insert(1));
        Assertions.assertFalse(randomizedSet.remove(2));
        Assertions.assertTrue(randomizedSet.insert(2));
        int random = randomizedSet.getRandom();
        Assertions.assertTrue(random >= 1, "Error, should be 1 or 2");
        Assertions.assertTrue(random <= 2, "Error, should be 1 or 2");
        Assertions.assertTrue(randomizedSet.remove(1));
        Assertions.assertFalse(randomizedSet.insert(2));
        Assertions.assertEquals(2, randomizedSet.getRandom());
    }
}
