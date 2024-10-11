package Problems.LearnBasics.Patterns;

public class Pattern4 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ 1
     *      2 2
     *      3 3 3
     *      4 4 4 4 ]
     * */
    public void createPattern(int rows) {
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
