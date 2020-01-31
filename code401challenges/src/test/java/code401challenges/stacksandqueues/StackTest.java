package code401challenges.stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;


//Can successfully push onto a stack
//Can successfully push multiple values onto a stack
//Can successfully pop off the stack
//Can successfully empty a stack after multiple pops
//Can successfully peek the next item on the stack
//Can successfully instantiate an empty stack


public class StackTest{
    private Stack actualS = new Stack();


    @Test
    public void pushOntoStackTest(){
        actualS.push(5);
        actualS.push(7);
        assertEquals(7, actualS.peek());
    }

    @Test
    public void pushMultipleValuesTest(){
        actualS.push(5);
        actualS.push(7);
        actualS.push(9);
        actualS.pop();
        actualS.pop();
        actualS.pop();
        assertEquals(null, actualS.top);
    }

    @Test
    public void popOffStackTest(){
        actualS.push(5);
        actualS.push(7);
        actualS.push(9);
        actualS.pop();
        assertEquals(7,actualS.peek());
    }

    @Test
    public void peekStackTest(){
        actualS.push(5);
        actualS.push(7);
        actualS.push(9);
        assertEquals(9,actualS.peek());
    }

    @Test
    public void emptyStackTest(){
        assertTrue(actualS.isEmpty());
        actualS.push(5);
        actualS.push(7);
        assertFalse(actualS.isEmpty());
    }


}
