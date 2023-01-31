import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTeamWithNoConflictsTest {
    BestTeamWithNoConflicts bestTeamWithNoConflicts = new BestTeamWithNoConflicts();

    @Test
    void Example1() {
        int[] scores = {1, 3, 5, 10, 15},  ages = {1, 2, 3, 4, 5};

        Assertions.assertEquals(34, bestTeamWithNoConflicts.bestTeamScore(scores, ages));
    }

    @Test
    void Example2() {
        int[] scores = {4, 5, 6, 5}, ages = {2, 1, 2, 1};

        Assertions.assertEquals(16, bestTeamWithNoConflicts.bestTeamScore(scores, ages));
    }

    @Test
    void Example3() {
        int[] scores = {1, 2, 3, 5}, ages = {8, 9, 10, 1};

        Assertions.assertEquals(6, bestTeamWithNoConflicts.bestTeamScore(scores, ages));
    }
}
