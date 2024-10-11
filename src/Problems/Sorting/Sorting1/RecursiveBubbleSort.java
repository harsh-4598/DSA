package Problems.Sorting.Sorting1;
import java.util.Arrays;

import static Problems.Sorting.Sorting1.Driver.swap;
public class RecursiveBubbleSort {
    public static void main(String[] args) {
        //int[] arr  = {10,9,8,7,6,5,4,3,2,1};
        int[] arr = {95, 13, 47, 52, 41, 68, 42};
        sort(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    public static void sort (int[] arr, int index) {
        if (index < 1) return;
        for (int i=0; i<index; i++) {
            if (arr[i] > arr[i+1])
                swap(arr, i, i+1);
        }
        sort(arr, index-1);
    }
}