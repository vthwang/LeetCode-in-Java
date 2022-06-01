import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CourseScheduleIiTest {
    CourseScheduleIi CourseScheduleIi = new CourseScheduleIi();

    @Test
    void Example1() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        int[] results = CourseScheduleIi.findOrder(numCourses, prerequisites);
        int[] expectedResults = {0, 1};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] results = CourseScheduleIi.findOrder(numCourses, prerequisites);
        int[] expectedResults = {0, 1, 2, 3};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int numCourses = 1;
        int[][] prerequisites = {};
        int[] results = CourseScheduleIi.findOrder(numCourses, prerequisites);
        int[] expectedResults = {0};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
