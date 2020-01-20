package code401challenges;

//For help I used: https://stackoverflow.com/questions/11638123/how-to-add-an-element-to-array-and-shift-indexes
//need to write test!!!


public class ArrayShift {
    public static int insertShiftArray (int[] array, int startingPos, int newValue ){
        int [] result = new int[array.length];
        for(int i = 0; i < startingPos; i++)
            result[i] = array[i];
        result[startingPos] = newValue;
        for (int i = startingPos +1; i < array.length; i++)
            result[i] = array[i-1];

        return newValue;
    }



}
