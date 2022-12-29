import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleThreadedCpuTest {
    SingleThreadedCpu singleThreadedCpu = new SingleThreadedCpu();

    @Test
    void Example1() {
        int[][] tasks = {{1, 2}, {2, 4}, {3, 2}, {4, 1}};

        Assertions.assertArrayEquals(new int[]{0, 2, 3, 1}, singleThreadedCpu.getOrder(tasks));
    }

    @Test
    void Example2() {
        int[][] tasks = {{7, 10}, {7, 12}, {7, 5}, {7, 4}, {7, 2}};

        Assertions.assertArrayEquals(new int[]{4, 3, 2, 0, 1}, singleThreadedCpu.getOrder(tasks));
    }
}
