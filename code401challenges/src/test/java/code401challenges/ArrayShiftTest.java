package code401challenges;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void insertShiftArray() {
        ArrayShift.insertShiftArray(new int[]{1,2});
        System.out.println(Arrays.toString(ArrayShift.insertShiftArray(new int[]{1, 2})));
    }
}