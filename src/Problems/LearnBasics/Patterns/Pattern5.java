package Problems.LearnBasics.Patterns;

public class Pattern5 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ * * * *
     *      * * *
     *      * *
     *      * ]
     * */
    public void createPattern(int rows) {
        for (int i=rows; i>0; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
