import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolvingQuestionsWithBrainpowerTest {
    SolvingQuestionsWithBrainpower solvingQuestionsWithBrainpower = new SolvingQuestionsWithBrainpower();

    @Test
    void Example1() {
        int[][] questions = {{3, 2}, {4, 3}, {4, 4}, {2, 5}};

        Assertions.assertEquals(5, solvingQuestionsWithBrainpower.mostPoints(questions));
    }

    @Test
    void Example2() {
        int[][] questions = {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}};

        Assertions.assertEquals(7, solvingQuestionsWithBrainpower.mostPoints(questions));
    }
}
