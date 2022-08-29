import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskSchedulerTest {
    TaskScheduler TaskScheduler = new TaskScheduler();

    @Test
    void Example1() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        int results = TaskScheduler.leastInterval(tasks,  n);
        int expectedResults = 8;

        Assertions.assertEquals(expectedResults,  results);
    }

    @Test
    void Example2() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 0;
        int results = TaskScheduler.leastInterval(tasks,  n);
        int expectedResults = 6;

        Assertions.assertEquals(expectedResults,  results);
    }

    @Test
    void Example3() {
        char[] tasks = {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int n = 2;
        int results = TaskScheduler.leastInterval(tasks,  n);
        int expectedResults = 16;

        Assertions.assertEquals(expectedResults,  results);
    }
}
