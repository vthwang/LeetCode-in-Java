import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrimABinarySearchTreeTest {
    TrimABinarySearchTree TrimABinarySearchTree = new TrimABinarySearchTree();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(1);
        TreeNode secondNode = new TreeNode(0);
        TreeNode thirdNode = new TreeNode(2);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;

        int low = 1;
        int high = 2;
        TreeNode results = TrimABinarySearchTree.trimBST(firstNode, low, high);

        firstNode.left = null;

        Assertions.assertEquals(firstNode, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(3);
        TreeNode secondNode = new TreeNode(0);
        TreeNode thirdNode = new TreeNode(4);
        TreeNode forthNode = new TreeNode(2);
        TreeNode fifthNode = new TreeNode(1);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.right = forthNode;
        forthNode.left = fifthNode;

        int low = 1;
        int high = 3;
        TreeNode results = TrimABinarySearchTree.trimBST(firstNode, low, high);

        firstNode.left = forthNode;
        firstNode.right = null;

        Assertions.assertEquals(firstNode, results);
    }
}
