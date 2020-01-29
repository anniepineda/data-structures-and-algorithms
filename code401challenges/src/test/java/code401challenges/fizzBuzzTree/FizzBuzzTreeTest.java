package code401challenges.fizzBuzzTree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
    FizzBuzzTree test;

    @Before
    public void setUp(){
         test = new FizzBuzzTree();
         test.root = new FizzBuzzNode("7", null, null);
         test.root.left = new FizzBuzzNode("15", null, null);
         test.root.right = new FizzBuzzNode("50", null, null);
    }

    @Test
    public void test(){
//        System.out.println(test.root);
        assertEquals("The root is 7",
                "7",
                test.root.value);
    }

    @Test
    public void testFizzBuzzReturn(){
        assertEquals("FizzBuzz! it is divisible by 3 & 5!",
                "15",
                test.root.left.value);
    }

    @Test
    public void testFizzBuzzWithOneNodeTree(){
        FizzBuzzNode root = new FizzBuzzNode("30", null, null);
        FizzBuzzTree oneNodeTree = new FizzBuzzTree();
        oneNodeTree.root = root;
        oneNodeTree.traverseFizzBuzzTree();
        assertEquals("FizzBuzz", oneNodeTree.root.value);
    }



}

