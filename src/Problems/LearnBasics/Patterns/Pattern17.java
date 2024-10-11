package Problems.LearnBasics.Patterns;

public class Pattern17 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [       A
     *          A B A
     *        A B C B A
     *      A B C D C B A ]
     * */
    public void createPattern(int rows) {
        for (int i=0; i<rows; i++) {
            for (int j=0; j<rows-i-1; j++) {
                System.out.print("  ");
            }

            char c = 'A';
            for (int j=0; j<2*i+1; j++) {
                if (j >= i) {
                    System.out.print(c-- + " ");
                } else {
                    System.out.print(c++ + " ");
                }
            }
            for (int j=0; j<rows-i-1; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
