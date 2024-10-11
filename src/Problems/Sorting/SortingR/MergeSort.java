package Problems.Sorting.SortingR;

public class MergeSort {
    public void sort (int[] arr) {
        mergeSort(arr, 0, arr.length-1);
    }

    private void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high-low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    private void merge(int [] arr, int low, int mid, int high) {
        int i = low;
        int j= mid+1;
        int[] b = new int[high-low+1];
        int k = 0;
        while (i<=mid && j<=high) {
            if (arr[i] > arr[j])
                b[k++] = arr[j++];
            else
                b[k++] = arr[i++];
        }

        while (i <= mid) {
            b[k++] = arr[i++];
        }

        while (j <= high) {
            b[k++] = arr[j++];
        }

        for (int x=0; x<b.length; x++) {
            arr[low+x] = b[x];
        }
    }
}
