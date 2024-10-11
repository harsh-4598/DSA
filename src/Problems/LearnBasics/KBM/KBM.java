package Problems.LearnBasics.KBM;

public class KBM {
    public static void main(String[] args) {
        //System.out.println(count(7789));
        System.out.println(reverse(1534236469));
        //System.out.println(isPalindrome(123));
        //System.out.println(isArmstrong(1634));
        //printAllDivisors(36);
        //System.out.println(isPrimeNumber(17));
        // System.out.println(getGCD(20,40));
    }

    /**
     * Count number of digits of a given number
     * for eg: input -> 7789, output -> 4
     * */
    public static int count (int n) {
        int count = 0;
        while (n > 0) {
            System.out.println("n : " + n);
            System.out.println("last digit : "+ n%10);
            count++;
            n/=10;
        }
        return count;
        //return (int) (Math.log10(n) + 1);
    }

    /**
     * Reverse a number
     * for eg: input -> 7789, output -> 9877
     * */
    public static int reverse(int n) {
        int reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + (n % 10);
            n/=10;
        }
        return reverse;
    }

    /**
     * Check is given number is palindrome (reverse should be equal/same) or not
     * eg: input -> 121, output -> true
     * eg: input -> 123, output -> false
     * */
    public static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    /**
     * Check a given number is armstrongNumber or not
     * what is armstrong number -> sum of its own digits each raised to the power of the number of digits.
     * for eg1 : input -> 371, output -> true
     * explanation : 3^3 + 7^3 + 1^3 = 27+343+1 = 371 (cube because total digits of 371 is 3)
     * for eg2: input -> 1634, output -> true
     * explanation: 1^4 + 6^4 + 3^4 + 4^4 = 1634;
     * */
    public static boolean isArmstrong(int n) {
        int temp = n;
        int armstrongNumber = 0;
        int totalDigits = String.valueOf(n).length();
        while (temp > 0) {
            int lastDigit = temp % 10;
            armstrongNumber+=(int) Math.pow(lastDigit, totalDigits);
            temp/=10;
        }
        return n == armstrongNumber;
    }

    /**
     * Print all divisors of a given number
     * */
    public static void printAllDivisors(int n) {
        /*Time Complexity - O(n)
        for (int i=1; i<=n; i++) {
            if (n%i ==0) System.out.print(i+" ");
        }*/

        //Time Complexity - O(sqrt(n))
        //instead of using Math.sqrt(n) each time , you can use i*i<=n
        for (int i=1; i*i<=n; i++) {
            if (n%i ==0) {
                System.out.print(i + " ");
                if (n/i != i)
                    System.out.print(n/i + " ");
            }
        }

    }

    /**
     * Check if a given number is prime or not
     **/
    public static boolean isPrimeNumber(int n) {
        /*Time complexity - O(n)
        for (int i=2; i<n; i++) {
            if (n % i == 0) return false;
        }
        return true;*/

        /*Time Complexity - O(n)
        int divisorCount = 0;
        for (int i=1; i<=n; i++) {
            if (n % i ==0) divisorCount++;
        }
        return divisorCount == 2;*/

        //Time Complexity - O(sqrt(n))
        int divisorCount = 0;
        for (int i=1; i*i<=n; i++) {
            if (n % i ==0) {
                divisorCount++;
                if (n/i != i) divisorCount++;
            }
        }
        return divisorCount==2;
    }


    /**
    * Give the greatest common divisor (GCD) of two numbers
    **/
    public static int getGCD(int n1, int n2) {
        /*Time Complexity - O(min(n1, n2))
        int gcd = 1;
        for (int i=2; i<=Math.min(n1, n2); i++) {
            if (n1 % i ==0 && n2 % i ==0) gcd = i;
        }
        return gcd;*/

        //start from bigger number -> smaller and break once found
        //Time Complexity - O(Math.min(n1, n2))
        /*int gcd = 1;
        for (int i=Math.min(n1, n2); i>=2; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;*/

        //Time Complexity - O(log(min(n1,n2)))
        while (n1 >0 && n2 >0) {
            if (n1 > n2) n1 = n1 % n2;
            else n2 = n2 % n1;
        }
        return n1 == 0 ? n2 : n1;
    }

}
