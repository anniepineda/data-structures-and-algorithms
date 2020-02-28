package code401challenges.mergeSort;

import java.util.Arrays;

//Used https://www.youtube.com/watch?v=yv6svAfoYik&t=18s , https://gist.github.com/Kwistech/61cbfad410f132e2e5b70a5a94adfda1 for help
//Daesy helped me with this challenge and I also referenced code review

public class MergeSort {
    public static int[] mergeSort(int[] array){
        int n = array.length;
        if (n == 0){
                throw new IllegalArgumentException("The array is empty.");
            }
        else if (n == 1){
                return array;
        }

        else if (n > 1){
            int mid = n/2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, n);
            mergeSort(left);
            mergeSort(right);
            merge(left, right, array);
        }
        return array;
    }

    /// Helper Method
    private static void merge(int[] left, int[] right, int[] arr){
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        if(i == left.length){
            // add value to right
            while(k < arr.length){
                arr[k++] = right[j++];
            }
            // add value to left
        } else {
            arr[k++] = left[i++];
        }
    }

}
