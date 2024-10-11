package Problems.Sorting.SortingR;

import static Problems.Sorting.Sorting1.Driver.swap;
/**
 * Code for quickSort - pivot only high
 * */
public class QuickSortOnlyHigh {

    public void sort (int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j=low; j<high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
}