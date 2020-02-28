package code401challenges.mergeSortTest;

import org.junit.Test;

import java.util.Arrays;

import static code401challenges.mergeSort.MergeSort.mergeSort;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class MergeSortTest {

    @Test
    public void mergeSortHappyTest(){
        int[] input = {8, 4, 23, 42, 16, 15};
        int[] actual = mergeSort(input);
        int[] expected = {4, 8, 15, 16, 23, 42};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
        }

    @Test
    public void mergeSortFailTest(){
        int[] input = {8, 4, 23, 42, 16, 15};
        int[] actual = mergeSort(input);
        assertNotEquals(Arrays.toString(input), actual);
    }


}
