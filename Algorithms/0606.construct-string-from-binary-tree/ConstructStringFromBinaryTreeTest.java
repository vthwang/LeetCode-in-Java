import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructStringFromBinaryTreeTest {
    ConstructStringFromBinaryTree ConstructStringFromBinaryTree = new ConstructStringFromBinaryTree();
    ConstructStringFromBinaryTree2 ConstructStringFromBinaryTree2 = new ConstructStringFromBinaryTree2();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        String results = ConstructStringFromBinaryTree.tree2str(root);
        String expectedResults = "1(2(4))(3)";

        Assertions.assertEquals(expectedResults, results);

        results = ConstructStringFromBinaryTree2.tree2str(root);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);
        String results = ConstructStringFromBinaryTree.tree2str(root);
        String expectedResults = "1(2()(4))(3)";

        Assertions.assertEquals(expectedResults, results);

        results = ConstructStringFromBinaryTree2.tree2str(root);
        Assertions.assertEquals(expectedResults, results);
    }
}
