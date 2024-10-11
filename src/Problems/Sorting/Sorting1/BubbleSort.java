package Problems.Sorting.Sorting1;

import static Problems.Sorting.Sorting1.Driver.swap;
/**
 * Time Complexity - O(n^2)
 * Space Complexity - O(1)
 * */
public class BubbleSort {
    public void sort(int[] arr) {
        //arr[] = {1,10,2,9,3,8,4,7,5,6};
        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length-1-i; j++) {
                if (arr[j] > arr[j+1])
                    swap(arr, j, j+1);
            }
        }
    }
}
