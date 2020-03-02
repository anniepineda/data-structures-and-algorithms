package code401challenges.quickSort;

public class QuickSort {

    public static int[] quickSort(int[] array, int left, int right) {

        if (left < right) {
            int position = partition(array, left, right);
            quickSort(array, left, position - 1);
            quickSort(array, position + 1, right);
        }
        return array;
    }

    public static int partition(int[] array, int left, int right) {

        int pivot = array[right];
        int low = left - 1;

        for (int i = left; i< right; i++) {
            if (array[i] <= pivot) {
                low++;
                quickSort(array, left, right);swap(array, i, low);
            }
        }
        quickSort(array, left, right);swap(array, right, low + 1);
        return low + 1;
    }

    public static void swap(int[] array, int j, int low) {
        int temp;
        temp = array[j];
        array[j] = array[low];
        array[low] = temp;
    }


}



