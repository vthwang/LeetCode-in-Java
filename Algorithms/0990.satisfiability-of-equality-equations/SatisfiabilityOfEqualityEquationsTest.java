import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SatisfiabilityOfEqualityEquationsTest {
    SatisfiabilityOfEqualityEquations SatisfiabilityOfEqualityEquations = new SatisfiabilityOfEqualityEquations();

    @Test
    void Example1() {
        String[] equations = {"a==b", "b!=a"};
        boolean results = SatisfiabilityOfEqualityEquations.equationsPossible(equations);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String[] equations = {"b==a", "a==b"};
        boolean results = SatisfiabilityOfEqualityEquations.equationsPossible(equations);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String[] equations = {"c==c", "b==d", "x!=z"};
        boolean results = SatisfiabilityOfEqualityEquations.equationsPossible(equations);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }
}
