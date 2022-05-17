import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoBinaryTreesTest {
    MergeTwoBinaryTrees MergeTwoBinaryTrees = new MergeTwoBinaryTrees();

    @Test
    void Example1() {
        TreeNode root1FirstNode = new TreeNode(1);
        TreeNode root1SecondNode = new TreeNode(3);
        TreeNode root1ThirdNode = new TreeNode(2);
        TreeNode root1ForthNode = new TreeNode(5);

        root1FirstNode.left = root1SecondNode;
        root1FirstNode.right = root1ThirdNode;
        root1SecondNode.left = root1ForthNode;

        TreeNode root2FirstNode = new TreeNode(2);
        TreeNode root2SecondNode = new TreeNode(1);
        TreeNode root2ThirdNode = new TreeNode(3);
        TreeNode root2ForthNode = new TreeNode(4);
        TreeNode root2FifthNode = new TreeNode(7);

        root2FirstNode.left = root2SecondNode;
        root2FirstNode.right = root2ThirdNode;
        root2SecondNode.right = root2ForthNode;
        root2ThirdNode.right = root2FifthNode;

        TreeNode results = MergeTwoBinaryTrees.mergeTrees(root1FirstNode, root2FirstNode);

        Assertions.assertEquals(3, results.val);
        Assertions.assertEquals(4, results.left.val);
        Assertions.assertEquals(5, results.right.val);
        Assertions.assertEquals(5, results.left.left.val);
        Assertions.assertEquals(4, results.left.right.val);
        Assertions.assertNull(results.right.left);
        Assertions.assertEquals(7, results.right.right.val);
    }

    @Test
    void Example2() {
        TreeNode root1FirstNode = new TreeNode(1);

        TreeNode root2FirstNode = new TreeNode(1);
        root2FirstNode.left = new TreeNode(2);

        TreeNode results = MergeTwoBinaryTrees.mergeTrees(root1FirstNode, root2FirstNode);

        Assertions.assertEquals(2, results.val);
        Assertions.assertEquals(2, results.left.val);
    }
}
