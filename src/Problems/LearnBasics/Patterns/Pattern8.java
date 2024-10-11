package Problems.LearnBasics.Patterns;

public class Pattern8 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ * * * * * * *
     *        * * * * *
     *          * * *
     *            *       ]
     *      divide the pattern in 2 part, 1 part involves right angle triangle, another left angle triangle starts from 2nd row
     * */
    public void createPattern(int rows) {
        /*for (int i=rows-1; i>=0; i--) {
            for (int j=0; j<rows-i-1; j++) {
                System.out.print("  ");
            }
            for (int j=0; j<2*i+1; j++) {
                System.out.print("* ");
            }
            for (int j=0; j<rows-i-1; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }*/
        for (int i=0; i<rows; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("  ");
            }
            for (int j=0; j<2*rows-(2*i+1); j++) {
                System.out.print("* ");
            }
            for (int j=0; j<i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
