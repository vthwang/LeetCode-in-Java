import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymmetricTreeTest {
    SymmetricTree SymmetricTree = new SymmetricTree();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(1);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(2);
        TreeNode forthNode = new TreeNode(3);
        TreeNode fifthNode = new TreeNode(4);
        TreeNode sixthNode = new TreeNode(4);
        TreeNode seventhNode = new TreeNode(3);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;
        thirdNode.left = sixthNode;
        thirdNode.right = seventhNode;

        boolean results = SymmetricTree.isSymmetric(firstNode);
        boolean expectedResult = true;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(1);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(2);
        TreeNode forthNode = new TreeNode(3);
        TreeNode fifthNode = new TreeNode(3);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.right = forthNode;
        thirdNode.right = fifthNode;

        boolean results = SymmetricTree.isSymmetric(firstNode);
        boolean expectedResult = false;

        Assertions.assertEquals(expectedResult, results);
    }
}
