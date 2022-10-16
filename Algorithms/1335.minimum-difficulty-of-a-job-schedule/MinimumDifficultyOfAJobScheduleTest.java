import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumDifficultyOfAJobScheduleTest {
    MinimumDifficultyOfAJobSchedule MinimumDifficultyOfAJobSchedule = new MinimumDifficultyOfAJobSchedule();

    @Test
    void Example1() {
        int[] jobDifficulty = {6, 5, 4, 3, 2, 1};
        int d = 2;
        int results = MinimumDifficultyOfAJobSchedule.minDifficulty(jobDifficulty, d);
        int expectedResults = 7;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] jobDifficulty = {9, 9, 9};
        int d = 4;
        int results = MinimumDifficultyOfAJobSchedule.minDifficulty(jobDifficulty, d);
        int expectedResults = -1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] jobDifficulty = {1, 1, 1};
        int d = 3;
        int results = MinimumDifficultyOfAJobSchedule.minDifficulty(jobDifficulty, d);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }
}
