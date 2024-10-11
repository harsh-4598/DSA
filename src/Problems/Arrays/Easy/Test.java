package Problems.Arrays.Easy;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,5,7,7};
        //System.out.println(getLargest(arr));
        //System.out.println(findSecondLargest(arr));
        //System.out.println(findSecondSmallest(arr));
        //System.out.println(isSortedAsc(arr));
        removeDuplicatesInSortedArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
    * Find the largest element in the array
    * */
    public static int getLargest(int[] arr) {
        /*Time Complexity - O(nlog(n)) - Brute Solution;
        int[] temp = arr;
        new HeapSort().sort(temp);
        return temp[temp.length-1];
        */

        //Time Complexity - O(n) - Optimal(Best) solution;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    /*
     * Find second largest element
     * */
    public static int findSecondLargest(int[] arr) {
        //Time Complexity - O(nlog(n)) + O(n) , Brute Solution
        /*Arrays.sort(arr);
        int largest = arr[arr.length-1];
        int pointer = arr.length-2;
        while (pointer-- >= 0) {
            if (arr[pointer] != largest)
                return arr[pointer];
        }
        return -1;*/

        //Time Complexity - O(n) + O(n) = O(2n), Brute Solution
        /*int largest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > largest)
                largest = i;
        }
        int secondLargest = -1;
        for (int i : arr) {
            if (i < largest && i > secondLargest)
                secondLargest = i;
        }
        return secondLargest;*/


        //Time Complexity - O(n) , Optimal(Best) Solution;
        int largest = arr[0];
        int secondLargest = -1;
        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i < largest && i > secondLargest) {
                secondLargest = i;
            }
        }
        return secondLargest;
    }

    public static int findSecondSmallest(int[] arr) {
        /*
        * Same approach as of largest - Optimal(Best) Solution O(n);
        * */
        int smallest = Integer.MAX_VALUE-1;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < smallest) {
                secondSmallest = smallest;
                smallest = i;
            } else if (i > smallest && i < secondSmallest) {
                secondSmallest = i;
            }
        }
        return secondSmallest;
    }

    /*
    * Time Complexity - O(n) (Only 1 Solution)
    * */
    public static boolean isSortedAsc(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            if (arr[i-1] > arr[i])
                return false;
        }
        return true;
    }

    /*
    * Remove duplicates from sorted Array
    * */
    public static void removeDuplicatesInSortedArray(int[] arr){
        //Time Complexity - O(nlog(n)) + O(n) Brute Solution
        Set<Integer> s = new TreeSet<>();
        //n (iteration) * log(n) (maintaining natural order / sort), Space - O(n)
        for (int i : arr) {
            s.add(i);
        }
        int pointer = 0;
        //Time Complexity - O(n)
        for (int i : s) {
            arr[pointer++] = i;
        }


        //Optimal(Best) Solution - O(n)
        /*int nextPosition = 1;
        for (int i=1; i<arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                arr[nextPosition] = arr[i];
                nextPosition++;
            }
        }*/
    }
}
