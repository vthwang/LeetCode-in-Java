import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumRoundsToCompleteAllTasksTest {
    MinimumRoundsToCompleteAllTasks minimumRoundsToCompleteAllTasks = new MinimumRoundsToCompleteAllTasks();

    @Test
    void Example1() {
        int[] tasks = {2, 2, 3, 3, 2, 4, 4, 4, 4, 4};

        Assertions.assertEquals(4, minimumRoundsToCompleteAllTasks.minimumRounds(tasks));
    }

    @Test
    void Example2() {
        int[] tasks = {2, 3, 3};

        Assertions.assertEquals(-1, minimumRoundsToCompleteAllTasks.minimumRounds(tasks));
    }
}
