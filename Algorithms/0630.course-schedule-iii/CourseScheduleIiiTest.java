import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CourseScheduleIiiTest {
    CourseScheduleIii CourseScheduleIii = new CourseScheduleIii();

    @Test
    void Example1() {
        int[][] courses = {{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}};
        int results = CourseScheduleIii.scheduleCourse(courses);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] courses = {{1, 2}};
        int results = CourseScheduleIii.scheduleCourse(courses);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[][] courses = {{3, 2}, {4, 3}};
        int results = CourseScheduleIii.scheduleCourse(courses);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example4() {
        int[][] courses = {{5, 5}, {4, 6}, {2, 6}};
        int results = CourseScheduleIii.scheduleCourse(courses);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }
}
