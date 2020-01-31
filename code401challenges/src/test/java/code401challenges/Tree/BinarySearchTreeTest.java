package code401challenges.Tree;

import code401challenges.tree.BinarySearchTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void addTest_addingRoot() {
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.add(15, testTree.root);
        assertEquals(15, testTree.root.value);
    }

    @Test
    public void addTest_addingMultiple() {
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.add(15, testTree.root);
        testTree.add(7, testTree.root);
        testTree.add(20, testTree.root);
        assertEquals(7, testTree.root.left.value);
        assertEquals(20, testTree.root.right.value);
    }

//test recursion

    @Test
    public void containsTest_doesContain() {
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.add(15, testTree.root);
        testTree.add(7, testTree.root);
        testTree.add(20, testTree.root);
        assertTrue(testTree.contains(20));

}



//    Write an instance method called find-maximum-value. Without utilizing any of the built-in methods available to
//    your language, return the maximum value stored in the tree. You can assume that the values stored in the Binary
//    Tree will be numeric.





}