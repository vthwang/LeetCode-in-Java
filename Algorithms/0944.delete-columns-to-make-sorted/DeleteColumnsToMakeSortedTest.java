import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeleteColumnsToMakeSortedTest {
    DeleteColumnsToMakeSorted deleteColumnsToMakeSorted = new DeleteColumnsToMakeSorted();

    @Test
    void Example1() {
        String[] strs = {"cba", "daf", "ghi"};

        Assertions.assertEquals(1, deleteColumnsToMakeSorted.minDeletionSize(strs));
    }

    @Test
    void Example2() {
        String[] strs = {"a", "b"};

        Assertions.assertEquals(0, deleteColumnsToMakeSorted.minDeletionSize(strs));
    }

    @Test
    void Example3() {
        String[] strs = {"zyx", "wvu", "tsr"};

        Assertions.assertEquals(3, deleteColumnsToMakeSorted.minDeletionSize(strs));
    }
}
