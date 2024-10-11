package Problems.Sorting.Sorting1;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int[] arr = {95, 13, 47, 52, 41, 68, 42};
        //BubbleSort s = new BubbleSort();
        //SelectionSort s = new SelectionSort();
        //InsertionSort s = new InsertionSort();
        //MergeSort s = new MergeSort();
        //QuickSort s = new QuickSort();
        HeapSort s = new HeapSort();
        s.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int x, int y) {
        if (x == y) return;
        arr[x] = arr[x] ^ arr[y];
        arr[y] = arr[x] ^ arr[y];
        arr[x] = arr[x] ^ arr[y];
    }
}
