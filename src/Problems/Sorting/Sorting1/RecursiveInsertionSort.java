package Problems.Sorting.Sorting1;
import java.util.Arrays;

import static Problems.Sorting.Sorting1.Driver.swap;
public class RecursiveInsertionSort {
    public static void main(String[] args) {
        //int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int[] arr = {95, 13, 47, 52, 41, 68, 42};
        sort(arr, 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int index) {
        if (index == arr.length) return;
        for (int i = index; i>=1; i--) {
            if (arr[i-1] > arr[i])
                swap(arr, i, i-1);
        }
        sort(arr, index+1);
    }
}
