import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FindDuplicateSubtreesTest {
    FindDuplicateSubtrees findDuplicateSubtrees = new FindDuplicateSubtrees();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
        root.right.left.left = new TreeNode(4);
        root.right.right = new TreeNode(4);

        List<TreeNode> results = findDuplicateSubtrees.findDuplicateSubtrees(root);

        Assertions.assertEquals(4, results.get(0).val);
        Assertions.assertEquals(2, results.get(1).val);
        Assertions.assertEquals(4, results.get(1).left.val);
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);

        List<TreeNode> results = findDuplicateSubtrees.findDuplicateSubtrees(root);

        Assertions.assertEquals(1, results.get(0).val);
    }

    @Test
    void Example3() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<TreeNode> results = findDuplicateSubtrees.findDuplicateSubtrees(root);

        Assertions.assertEquals(3, results.get(0).val);
        Assertions.assertEquals(2, results.get(1).val);
        Assertions.assertEquals(3, results.get(1).left.val);
    }
}
