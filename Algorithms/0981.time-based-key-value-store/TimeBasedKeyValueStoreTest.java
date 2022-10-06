import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeBasedKeyValueStoreTest {
    @Test
    void Example1() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        Assertions.assertEquals("bar", timeMap.get("foo", 1));
        Assertions.assertEquals("bar", timeMap.get("foo", 3));
        timeMap.set("foo", "bar2", 4);
        Assertions.assertEquals("bar2", timeMap.get("foo", 4));
        Assertions.assertEquals("bar2", timeMap.get("foo", 5));
    }
}
