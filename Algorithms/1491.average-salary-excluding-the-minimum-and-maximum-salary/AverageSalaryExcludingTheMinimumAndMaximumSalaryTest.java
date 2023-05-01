import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AverageSalaryExcludingTheMinimumAndMaximumSalaryTest {
    AverageSalaryExcludingTheMinimumAndMaximumSalary averageSalaryExcludingTheMinimumAndMaximumSalary = new AverageSalaryExcludingTheMinimumAndMaximumSalary();

    @Test
    void Example1() {
        int[] salary = {4000, 3000, 1000, 2000};

        Assertions.assertEquals(2500.00, averageSalaryExcludingTheMinimumAndMaximumSalary.average(salary));
    }

    @Test
    void Example2() {
        int[] salary = {1000, 2000, 3000};

        Assertions.assertEquals(2000.00, averageSalaryExcludingTheMinimumAndMaximumSalary.average(salary));
    }
}
