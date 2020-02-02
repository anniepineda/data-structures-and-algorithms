package code401challenges.utilities;

import org.junit.Test;

import static code401challenges.utilities.MultiBracketValidation.multiBracketValidation;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class MultiBracketValidationTest {

    @Test
    public void happyCase_bracketsAreMatchingTest(){
        String input = "()(Hello)[World]()";
        boolean current = multiBracketValidation(input);
        assertTrue(current);
    }

    @Test
    public void failCase_bracketsAreNotMatchingTest(){
        String input = "[";
        boolean current = multiBracketValidation(input);
        assertFalse(current);
    }

    @Test
    public void edgeCase_bracketsAreNestedAndNotAllMatching(){
        String input = "[[()]";
        boolean current = multiBracketValidation(input);
        multiBracketValidation(input);
        assertFalse(current);
    }

}
