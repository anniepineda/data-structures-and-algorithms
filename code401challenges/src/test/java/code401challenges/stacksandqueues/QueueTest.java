package code401challenges.stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;


//Can successfully enqueue into a queue
//Can successfully enqueue multiple values into a queue
//Can successfully dequeue out of a queue the expected value
//Can successfully peek into a queue, seeing the expected value
//Can successfully empty a queue after multiple dequeue
//Can successfully instantiate an empty queue

public class QueueTest{
    private Queue actualQ = new Queue();

    @Test
    public void enqueueIntoQueueTest(){
        assertEquals(null,actualQ.front);
    }

    @Test
    public void enqueueMultipleValuesTest(){
        actualQ.enqueue(4);
        actualQ.enqueue(6);
        actualQ.enqueue(8);
        actualQ.enqueue(10);
        assertEquals(4,actualQ.peek());
    }

    @Test
    public void dequeueOutOfaQueueTest(){
        actualQ.enqueue(4);
        actualQ.enqueue(6);
        actualQ.dequeue();
        assertEquals(6,actualQ.peek());
    }

    @Test
    public void emptyAQueueTest(){
        actualQ.enqueue(4);
        actualQ.enqueue(6);
        actualQ.enqueue(8);
        actualQ.enqueue(10);
        actualQ.dequeue();
        actualQ.dequeue();
        actualQ.dequeue();
        actualQ.dequeue();
        assertEquals(null,actualQ.front);
    }

    @Test
    public void emptyQueueTest(){
        assertTrue(actualQ.isEmpty());
        actualQ.enqueue(4);
        actualQ.enqueue(6);
        assertFalse(actualQ.isEmpty());
    }


}