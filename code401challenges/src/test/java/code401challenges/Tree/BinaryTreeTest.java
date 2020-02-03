package code401challenges.Tree;
import code401challenges.tree.BinarySearchTree;
import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest{

    @Test
    public void BinaryTreeTest(){
        Node<Integer> root = new Node<>(5, new Node<>(4),new Node<>(9));
        Tree<Integer> tree = new Tree<>(root);
        assertEquals((Integer) 5, tree.root.value);
        assertEquals((Integer) 4, tree.root.value);
        assertEquals((Integer) 9, tree.root.value);
    }


}
