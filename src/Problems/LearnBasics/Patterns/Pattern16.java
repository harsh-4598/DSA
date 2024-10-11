package Problems.LearnBasics.Patterns;

public class Pattern16 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ A
     *      B B
     *      C C C
     *      D D D D ]
     * */
    public void createPattern(int rows) {
        /*for (int i=0; i<rows; i++) {
            char c = 'A';
            for (int j=0; j<=i; j++) {
                System.out.print((char)(c+i) + " ");
            }
            System.out.println();
        }*/
        for (int i=0; i<rows; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print((char)('A'+i) + " ");
            }
            System.out.println();
        }
    }
}
