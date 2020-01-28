package code401challenges.stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackAndQueuesTest{
    private Stack actual = new Stack();

    @Test
    private void testEmpty(){
        Stack actual = new Stack();
        assertEquals(null,actual.peek());
    }



}
