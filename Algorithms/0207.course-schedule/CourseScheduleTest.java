import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CourseScheduleTest {
    CourseSchedule CourseSchedule = new CourseSchedule();

    @Test
    void Example1() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        boolean results = CourseSchedule.canFinish(numCourses, prerequisites);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int numCourses = 2;
        int[][] prerequisites ={{1, 0},{0, 1}};
        boolean results = CourseSchedule.canFinish(numCourses, prerequisites);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
