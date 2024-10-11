package Problems.Sorting.SortingR;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int[] arr = {95, 13, 47, 52, 41, 68, 42};
        //QuickSortOnlyMedian s = new QuickSortOnlyMedian();
        //QuickSortOnlyLow s = new QuickSortOnlyLow();
        //QuickSortOnlyHigh s = new QuickSortOnlyHigh();
        //QuickSortMedianAndLow s = new QuickSortMedianAndLow();
        //MergeSort s = new MergeSort();
        HeapSort s = new HeapSort();
        s.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
