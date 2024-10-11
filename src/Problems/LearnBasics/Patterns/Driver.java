package Problems.LearnBasics.Patterns;

import java.util.*;

public class Driver {
    static Scanner scanner;
    static {
        scanner = new Scanner(System.in);
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of test cases: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number of rows: ");
            numbers[i] = scanner.nextInt();
        }
        //Pattern1 pattern = new Pattern1();
        //Pattern2 pattern = new Pattern2();
        //Pattern3 pattern = new Pattern3();
        //Pattern4 pattern = new Pattern4();
        //Pattern5 pattern = new Pattern5();
        //Pattern6 pattern = new Pattern6();
        //Pattern7 pattern = new Pattern7();
        //Pattern8 pattern = new Pattern8();
        //Pattern9 pattern = new Pattern9();
        //Pattern10 pattern = new Pattern10();
        //Pattern11 pattern = new Pattern11();
        //Pattern12 pattern = new Pattern12();
        //Pattern13 pattern = new Pattern13();
        //Pattern14 pattern = new Pattern14();
        //Pattern15 pattern = new Pattern15();
        //Pattern16 pattern = new Pattern16();
        //Pattern17 pattern = new Pattern17();
        //Pattern18 pattern = new Pattern18();
        //Pattern19 pattern = new Pattern19();
        //Pattern20 pattern = new Pattern20();
        //Pattern21 pattern = new Pattern21();
        //Pattern22 pattern = new Pattern22();
        Pattern23 pattern = new Pattern23();
        for (int i = 0; i < size; i++) {
            System.out.println("Result for test case " + i);
            pattern.createPattern(numbers[i]);
        }
    }
}