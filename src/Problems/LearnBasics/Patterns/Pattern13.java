package Problems.LearnBasics.Patterns;

public class Pattern13 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ 1
     *      2 3
     *      4 5 6
     *      7 8 9 10]
     * */
    public void createPattern(int rows) {
        int counter = 1;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }
}
