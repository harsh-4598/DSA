package Problems.Sorting.Sorting1;

import static Problems.Sorting.Sorting1.Driver.swap;
/**
 * Time Complexity - O(n^2)
 * Space Complexity - O(1)
 * */
public class SelectionSort {
    public void sort(int[] arr) {
        //arr[] = {1,10,2,9,3,8,4,7,5,6};
        for (int i=0; i<arr.length-1; i++) {
            int minimumPosition = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[minimumPosition] > arr[j])
                    minimumPosition = j;
            }
            swap(arr, minimumPosition, i);
        }
    }
}
