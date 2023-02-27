import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructQuadTreeTest {
    ConstructQuadTree constructQuadTree = new ConstructQuadTree();

    @Test
    void Example1() {
        int[][] grid = {{0, 1}, {1, 0}};
        QuadNode root = constructQuadTree.construct(grid);

        Assertions.assertTrue(root.val);
        Assertions.assertFalse(root.isLeaf);
        Assertions.assertFalse(root.topLeft.val);
        Assertions.assertTrue(root.topLeft.isLeaf);
        Assertions.assertTrue(root.topRight.val);
        Assertions.assertTrue(root.topRight.isLeaf);
        Assertions.assertTrue(root.bottomLeft.val);
        Assertions.assertTrue(root.bottomLeft.isLeaf);
        Assertions.assertFalse(root.bottomRight.val);
        Assertions.assertTrue(root.bottomRight.isLeaf);
    }

    @Test
    void Example2() {
        int[][] grid = {{1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}};
        QuadNode root = constructQuadTree.construct(grid);

        Assertions.assertTrue(root.val);
        Assertions.assertFalse(root.isLeaf);
        Assertions.assertTrue(root.topLeft.val);
        Assertions.assertTrue(root.topLeft.isLeaf);
        Assertions.assertTrue(root.topRight.val);
        Assertions.assertFalse(root.topRight.isLeaf);
        Assertions.assertTrue(root.bottomLeft.val);
        Assertions.assertTrue(root.bottomLeft.isLeaf);
        Assertions.assertFalse(root.bottomRight.val);
        Assertions.assertTrue(root.bottomRight.isLeaf);
        Assertions.assertFalse(root.topRight.topLeft.val);
        Assertions.assertTrue(root.topRight.topLeft.isLeaf);
        Assertions.assertFalse(root.topRight.topRight.val);
        Assertions.assertTrue(root.topRight.topRight.isLeaf);
        Assertions.assertTrue(root.topRight.bottomLeft.val);
        Assertions.assertTrue(root.topRight.bottomLeft.isLeaf);
        Assertions.assertTrue(root.topRight.bottomRight.val);
        Assertions.assertTrue(root.topRight.bottomRight.isLeaf);
    }
}
