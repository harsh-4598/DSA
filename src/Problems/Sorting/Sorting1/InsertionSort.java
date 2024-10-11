package Problems.Sorting.Sorting1;

import static Problems.Sorting.Sorting1.Driver.swap;

/**
 * Time Complexity - O(n^2)
 * Space Complexity - O(1)
 * */
public class InsertionSort {
    public void sort(int[] arr) {
        //arr[] = {1,10,2,9,3,8,4,7,5,6};
        for (int i=1; i<arr.length; i++) {
            for (int j=i; j>=1; j--) {
                if (arr[j-1] > arr[j])
                    swap(arr, j, j-1);
            }
        }
    }
}
