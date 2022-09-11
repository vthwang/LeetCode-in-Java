import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SameTreeTest {
    SameTree SameTree = new SameTree();

    @Test
    void Example1() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        boolean results = SameTree.isSameTree(p, q);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(2);
        boolean results = SameTree.isSameTree(p, q);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(1);
        q.right = new TreeNode(2);
        boolean results = SameTree.isSameTree(p, q);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
