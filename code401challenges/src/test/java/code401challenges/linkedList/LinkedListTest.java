package code401challenges.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void insertHead() {
    }

    @Test
    public void includes() {
    }

    @Test
    public void testToString() {
        LinkedList test = new LinkedList();
        test.insertHead(1);
        test.insertHead(2);
        test.insertHead(3);

        System.out.println(test);
    }
}