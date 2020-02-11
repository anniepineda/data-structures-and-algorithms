package code401challenges.sort;


import com.sun.source.tree.BreakTree;

public class InsertionSort {
    public void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }

    }

}


///Got help from https://www.geeksforgeeks.org/insertion-sort/
///////need to change so I can have the array returned.