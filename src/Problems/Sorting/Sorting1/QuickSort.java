package Problems.Sorting.Sorting1;
import static Problems.Sorting.Sorting1.Driver.swap;
public class QuickSort {
    public void sort (int[] arr) {
        //arr[] = {1,10,2,9,3,8,4,7,5,6};
        quickSort(arr, 0, arr.length-1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = parition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    private int parition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return i;
    }
}
