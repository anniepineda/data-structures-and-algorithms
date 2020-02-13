package code401challenges.sort;

import org.junit.Test;
        import static org.junit.Assert.*;


public class InsertionSortTest {

    private InsertionSort sorter = new InsertionSort();
    @Test
    public void shouldDoNothingWithEmptyArray() {
        int[] values = {};
        sorter.sort(values);
    }
    @Test
    public void shouldDoNothingWithOneElementArray() {
        int[] values = {1};
        sorter.sort(values);
        assertArrayEquals(new int[] {1}, values);
    }
    @Test
    public void shouldSortValues() {
        int[] values = {5,4,3,2,1};
        int[] expectedOrder = {1,2,3,4,5};
        sorter.sort(values);
        assertArrayEquals(expectedOrder, values);
    }
}
//used this as a resource https://farenda.com/algorithms/insertion-sort-in-java
//Worked with Hollie to create tests