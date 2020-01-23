package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueue() {
        PseudoQueue testQueue = new PseudoQueue();
        testQueue.enqueue(1);
        assertEquals(1, testQueue.dequeue());
    }

    @Test
    public void enqueueTestTwo() {
        PseudoQueue testQueue = new PseudoQueue();
        testQueue.enqueue(9);
        testQueue.enqueue(3);
        testQueue.enqueue(5);
        assertEquals(9, testQueue.dequeue());
    }

}