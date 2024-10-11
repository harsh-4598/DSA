package Problems.LearnBasics.Patterns;

public class Pattern10 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ *
     *      * *
     *      * * *
     *      * * * *
     *      * * *
     *      * *
     *      *       ]
     *     combine pattern 2 and 5;
     * */
    public void createPattern(int rows) {
        /*new Pattern2().createPattern(rows);
        new Pattern5().createPattern(rows-1);*/
        for (int i=0; i<2*rows-1; i++) {
            int stars = i;
            if (i >= rows) stars = 2*rows-i-2;
            for (int j=0; j<=stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
