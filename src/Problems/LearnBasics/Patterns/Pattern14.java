package Problems.LearnBasics.Patterns;

public class Pattern14 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ A
     *      A B
     *      A B C
     *      A B C D ]
     * */
    public void createPattern(int rows) {
        /*for (int i=0; i<rows; i++) {
            //int counter = 65;
            char start = 'A';
            for (int j=0; j<=i; j++) {
                System.out.print(start++ + " ");
                //System.out.print((char) counter++ + " ");
            }
            System.out.println();
        }*/
        for (int i=0; i<rows; i++) {
            for (char c='A'; c<='A'+i; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
