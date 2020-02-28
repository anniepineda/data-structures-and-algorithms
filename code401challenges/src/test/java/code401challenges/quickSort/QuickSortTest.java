package code401challenges.quickSort;

import org.junit.Test;

import java.util.Arrays;

import static code401challenges.quickSort.QuickSort.quickSort;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuickSortTest {

    @Test
    public void quickSortTest(){
        int[] input = {8,4,23,42,16,15};
        System.out.println("input = " + input);
        int[] actual = quickSort(input,0,input.length-1);
        int[] expected = {4, 8, 15, 16, 23, 42};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }


    @Test
    public void quickSortFailTest(){
        int[] input = {8,4,23,42,16,15};
        int[] actual = quickSort(input,0,input.length-1);
        assertNotEquals(input, Arrays.toString(actual));
    }


}
