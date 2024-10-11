package Problems.LearnBasics.Patterns;

public class Pattern2 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ *
     *      * *
     *      * * *
     *      * * * * ]
     * */
    public void createPattern(int rows) {
        for (int i=0; i<rows; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}