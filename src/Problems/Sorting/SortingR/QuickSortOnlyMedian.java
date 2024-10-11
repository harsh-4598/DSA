package Problems.Sorting.SortingR;

import static Problems.Sorting.Sorting1.Driver.swap;
/**
 * Code for quickSort - pivot only median
 * */
public class QuickSortOnlyMedian {

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
        int pivot = arr[low + (high-low)/2];
        int i = low;
        int j = high;
        while (i <=j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i<=j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return i;
    }
}
