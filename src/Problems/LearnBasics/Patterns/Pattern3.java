package Problems.LearnBasics.Patterns;

public class Pattern3 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ 1
     *      1 2
     *      1 2 3
     *      1 2 3 4 ]
     * */
    public void createPattern(int rows) {
       /* for (int i=1; i<=rows; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }*/
        for (int i=0; i<rows; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
