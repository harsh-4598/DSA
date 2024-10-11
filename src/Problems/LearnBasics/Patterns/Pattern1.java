package Problems.LearnBasics.Patterns;

public class Pattern1 {
    /**
     * Creates a filled box pattern with equal rows and cols
     * for eg: rows = 4
     * output :
     *    [ * * * *
     *      * * * *
     *      * * * *
     *      * * * * ]
     * */
    public void createPattern(int rows) {
        for (int i=0; i < rows; i++) {
            for (int j=0; j<rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
