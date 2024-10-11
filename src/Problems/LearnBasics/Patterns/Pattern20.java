package Problems.LearnBasics.Patterns;

public class Pattern20 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ *             *
     *      * *         * *
     *      * * *     * * *
     *      * * * * * * * *
     *      * * *     * * *
     *      * *         * *
     *      *             * ]
     * */
    public void createPattern(int rows) {
        for (int i=0; i<2*rows-1; i++) {
            int stars = i;
            int space = 2*rows-2*(i+1);
            if (i>=rows) {
                stars = 2*rows-i-2;
                space = 2*(i-rows) + 2;
            }
            for (int j=0; j<=stars; j++) {
                System.out.print("* ");
            }
            for (int j=0; j<space; j++) {
                System.out.print("  ");
            }
            for (int j=0; j<=stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
