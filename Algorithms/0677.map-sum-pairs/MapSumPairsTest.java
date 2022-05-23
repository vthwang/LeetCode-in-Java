import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapSumPairsTest {
    @Test
    void Example1() {
        MapSum mapSum = new MapSum();
        mapSum.insert("apple", 3);
        Assertions.assertEquals(3, mapSum.sum("ap"));
        mapSum.insert("app", 2);
        Assertions.assertEquals(5, mapSum.sum("ap"));
    }
}
