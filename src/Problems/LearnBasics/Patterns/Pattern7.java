package Problems.LearnBasics.Patterns;

public class Pattern7 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [       *
     *          * * *
     *        * * * * *
     *      * * * * * * * ]
     *      divide the pattern in 2 part, 1 part involves right angle triangle, another left angle triangle starts from 2nd row
     * */
    public void createPattern(int rows) {
        /*for (int i=0; i<rows; i++) {
            for (int j=0; j<rows; j++) {
                if (rows-(j+1) <= i) {
                    System.out.print("* ");
                    if (i > 0 && j == rows-1) {
                        for (int k=0; k<i; k++) {
                            System.out.print("* ");
                        }
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/
        /*
        this method involves -> space , start , space
        * */
        for (int i=0; i<rows; i++) {
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
        }
    }
}
