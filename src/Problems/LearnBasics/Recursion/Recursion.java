package Problems.LearnBasics.Recursion;

public class Recursion {
    public static void main(String[] args) {
        //printNameNTimes("Harsh", 0, 5);
        //printMToN(1, 5);
        //printNToM(5, 1);
        //printMTONBackTrack(1, 5);
        //printMTONBackTrack(5, 1);
        //printNTOMBackTrack(5,1);
        //printNTOMBackTrack(1,5);
        //printSum(4, 0);
        //System.out.println(getSum(4));
        //System.out.println(getFactorial(5));
        /*int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        reverseArray(a, 0);
        System.out.println(Arrays.toString(a));*/
        //System.out.println(isPalindrome("malayalam"));
        //rintFibonacciSeries(5);
        //printFibonacciSeriesRecursive(1,0,0,1);
        System.out.println(getFibonacciSeriesNumberRecursively(5));
    }

    /**
     * Print name n times using recursion
     * */
    public static void printNameNTimes(String name, int count, int times) {
        if (count == times) return;
        System.out.println(name);
        printNameNTimes(name, ++count, times);
    }

    /**
     * Print M TO N numbers using recursion (increasing fashion low -> high)
     * */
    public static void printMToN(int currentNumber, int lastNumber){
        if (currentNumber >  lastNumber) return;
        System.out.println(currentNumber);
        printMToN(++currentNumber, lastNumber);
    }

    /**
     * Print N TO M numbers using recursion (decreasing fashion high -> low)
     * */
    public static void printNToM(int currentNumber, int lastNumber){
        if (currentNumber < lastNumber) return;
        System.out.println(currentNumber);
        printNToM(--currentNumber, lastNumber);
    }

    /**
     * Use backtrack to print numbers in increasing fashion i.e without (i+1) logic
     * */
    public static void printMTONBackTrack(int currentNumber, int lastNumber) {
        /*if (currentNumber > lastNumber) return;
        printMTONBackTrack(currentNumber, lastNumber-1);
        System.out.println(lastNumber);*/
        if (currentNumber < lastNumber) return;
        printMTONBackTrack(currentNumber-1, lastNumber);
        System.out.println(currentNumber);
    }

    /**
     * Use backtrack to print numbers in decreasing fashion i.e without (i-1) logic
     * */
    public static void printNTOMBackTrack(int currentNumber, int lastNumber) {
        /*if (lastNumber > currentNumber) return;
        printNTOMBackTrack(currentNumber, lastNumber+1);
        System.out.println(lastNumber);*/
        if (currentNumber > lastNumber) return;
        printNTOMBackTrack(currentNumber+1, lastNumber);
        System.out.println(currentNumber);
    }

    public static void printSum(int n, int sum){
        if (n == 1) {
            System.out.println(sum+n);
            return;
        };
        printSum(n-1, sum+n);
    }

    public static int getSum(int n) {
        if (n==1) return 1;
        return n + getSum(n-1);
    }

    public static int getFactorial(int n) {
        if (n==0) return 1;
        return n * getFactorial(n-1);
    }

    public static void reverseArray(int[] a, int index) {
        if (a.length/2 - 1 < index) return;
        swap(a, index, a.length-1-index);
        reverseArray(a, index+1);
    }

    public static void swap(int[]a, int x, int y) {
        if (x == y) return;
        a[x] = a[x] + a[y];
        a[y] = a[x] - a[y];
        a[x] = a[x] - a[y];
    }

    public static boolean palindromeHelper(String input, int index) {
        if (input.length()/2-1 < index) return true;
        if (input.charAt(index) != input.charAt(input.length()-1-index)) return false;
        else return palindromeHelper(input, index+1);
    }

    public static boolean isPalindrome(String input) {
        return palindromeHelper(input, 0);
    }

    public static void printFibonacciSeries(int n) {
        /*int a=0;
        int b=1;
        for (int i=0; i<n; i++) {
            if (i==0) System.out.println(a);
            else if (i==1) System.out.println(b);
            else {
                int c= a+b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }*/
        /*int a=0; int b = 1;
        for (int i=0; i<n; i++) {
            int c = a+b;
            System.out.println(a);
            a = b;
            b = c;
        }*/
    }

    public static void printFibonacciSeriesRecursive(int n, int current, int a, int b) {
        if (current == n) return;
        System.out.println(a);
        printFibonacciSeriesRecursive(n, current+1, b, a+b);
    }

    public static int getFibonacciSeriesNumberRecursively(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        return getFibonacciSeriesNumberRecursively(n-1) + getFibonacciSeriesNumberRecursively(n-2);
    }
}
