//package code401challenges.mergeSortTest;
//
//import org.junit.Test;
//
//import java.util.Arrays;
//
//import static code401challenges.mergeSort.MergeSort.mergeSort;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotEquals;
//
//
//public class MergeSortTest {
//
//    @Test
//    public void mergeSortHappyTest(){
//        int[] input = {6, 4, 7, 1, 9};
//        int[] actual = mergeSort(input);
//        int[] expected = {1, 4, 6, 7, 9};
//        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
//        }
//
//    @Test
//    public void mergeSortFailTest(){
//        int[] input = {6, 4, 7, 1, 9};
//        int[] actual = mergeSort(input);
//        assertNotEquals(Arrays.toString(input), actual);
//    }
//
//    @Test
//    public void edgeCaseMergeSortTest(){
//        int[] input = {25};
//        int[] actual = mergeSort(input);
//        assertEquals(Arrays.toString(input), Arrays.toString(actual));
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void mergeSortEdgeTest(){
//        int[] input = {};
//        int[] actual = mergeSort(input);
//        assertEquals(input, actual);
//    }
//
//
//
//
//
//
//
//}
