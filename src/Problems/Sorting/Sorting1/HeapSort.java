package Problems.Sorting.Sorting1;
import static Problems.Sorting.Sorting1.Driver.swap;
public class HeapSort {
    public void sort (int[] arr) {
        for (int i=arr.length/2 -1; i>=0; i--) {
            heapify(arr, arr.length, i);
        }
        for (int i=arr.length-1; i>0; i--) {
            swap(arr, i, 0);
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int length, int largest) {
        int l = largest;
        int lc = largest * 2 + 1;
        int rc = largest * 2 + 2;
        if (lc < length && arr[lc] > arr[l])
            l = lc;
        if (rc < length && arr[rc] > arr[l])
            l = rc;
        if (l != largest) {
            swap(arr, l, largest);
            heapify(arr, length, l);
        }
    }
}
