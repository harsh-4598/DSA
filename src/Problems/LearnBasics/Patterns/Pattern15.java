package Problems.LearnBasics.Patterns;

public class Pattern15 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ A B C D
     *      A B C
     *      A B
     *      A      ]
     * */
    public void createPattern(int rows) {
        /*for (int i= rows-1; i>=0; i--) {
            char start = 'A';
            for (int j=0; j<=i; j++) {
                System.out.print(start++ + " ");
            }
            System.out.println();
        }*/
        for (int i=0; i<rows; i++) {
            for (char c='A'; c<='A'+(rows-i-1); c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
