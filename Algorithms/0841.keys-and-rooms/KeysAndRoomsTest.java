import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeysAndRoomsTest {
    KeysAndRooms keysAndRooms = new KeysAndRooms();
    KeysAndRooms2 keysAndRooms2 = new KeysAndRooms2();

    @Test
    void Example1() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(List.of(1));
        rooms.add(List.of(2));
        rooms.add(List.of(3));
        rooms.add(List.of());

        Assertions.assertTrue(keysAndRooms.canVisitAllRooms(rooms));
        Assertions.assertTrue(keysAndRooms2.canVisitAllRooms(rooms));
    }

    @Test
    void Example2() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1, 3));
        rooms.add(Arrays.asList(3, 0, 1));
        rooms.add(List.of(2));
        rooms.add(List.of(0));

        Assertions.assertFalse(keysAndRooms.canVisitAllRooms(rooms));
        Assertions.assertFalse(keysAndRooms2.canVisitAllRooms(rooms));
    }
}
