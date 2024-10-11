package Problems.LearnBasics.Hashing;

import java.util.Scanner;

public class Hashing {
    static Scanner sc;
    static {
        sc = new Scanner(System.in);
    }
    public static void main(String[] args) {
        System.out.println("Enter number of elements : ");
        int arraySize = sc.nextInt();
       /* int[] array = new int[arraySize];
        for (int i=0; i<arraySize; i++) {
            System.out.println("Add element : ");
            array[i] = sc.nextInt();
        }*/
        char[] cArr = new char[arraySize];
        for (int i=0; i<arraySize; i++) {
            System.out.println("Add element : ");
            cArr[i] = sc.next().charAt(0);
        }

        //precalculation , hashing
        /*int[] hashing = new int[arraySize];
        for (int i=0; i<arraySize; i++) {
            hashing[array[i]]+=1;
        }*/
        int[] hashing = new int[26];
        for (int i=0; i<cArr.length; i++) {
            hashing[cArr[i] - 97]++;
        }

        System.out.println("Enter number of times to get frequency");
        int frequency = sc.nextInt();
        for (int i=0; i<frequency; i++) {
            //System.out.println("enter number to get frequency of");
            System.out.println("enter char to get frequency of");
            //int getFrequencyOf = sc.nextInt();
            char c = sc.next().charAt(0);
            System.out.println(hashing[c-97]);
        }

    }
}
