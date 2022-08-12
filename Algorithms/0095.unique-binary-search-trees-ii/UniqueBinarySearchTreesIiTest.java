import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class UniqueBinarySearchTreesIiTest {
    UniqueBinarySearchTreesIi UniqueBinarySearchTreesIi = new UniqueBinarySearchTreesIi();

    @Test
    void Example1() {
        int n = 3;
        List<TreeNode> results = UniqueBinarySearchTreesIi.generateTrees(n);

        Assertions.assertEquals(1, results.get(0).val);
        Assertions.assertEquals(2, results.get(0).right.val);
        Assertions.assertEquals(3, results.get(0).right.right.val);

        Assertions.assertEquals(1, results.get(1).val);
        Assertions.assertEquals(3, results.get(1).right.val);
        Assertions.assertEquals(2, results.get(1).right.left.val);

        Assertions.assertEquals(2, results.get(2).val);
        Assertions.assertEquals(1, results.get(2).left.val);
        Assertions.assertEquals(3, results.get(2).right.val);

        Assertions.assertEquals(3, results.get(3).val);
        Assertions.assertEquals(1, results.get(3).left.val);
        Assertions.assertEquals(2, results.get(3).left.right.val);

        Assertions.assertEquals(3, results.get(4).val);
        Assertions.assertEquals(2, results.get(4).left.val);
        Assertions.assertEquals(1, results.get(4).left.left.val);
    }

    @Test
    void Example2() {
        int n = 1;
        List<TreeNode> results = UniqueBinarySearchTreesIi.generateTrees(n);

        TreeNode firstRoot = new TreeNode(1);

        List<TreeNode> expectedResults = List.of(firstRoot);

        Assertions.assertEquals(expectedResults, results);
    }
}
