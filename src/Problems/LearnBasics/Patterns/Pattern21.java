package Problems.LearnBasics.Patterns;

public class Pattern21 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ * * * *
     *      *     *
     *      *     *
     *      * * * * ]
     * */
    public void createPattern(int rows) {
        for (int i=0; i<rows; i++) {
            for (int j=0; j<rows; j++) {
                if (i == 0 || i == rows-1 || j ==0 || j == rows-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
