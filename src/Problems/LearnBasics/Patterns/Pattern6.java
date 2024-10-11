package Problems.LearnBasics.Patterns;

public class Pattern6 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ 1 2 3 4
     *      1 2 3
     *      1 2
     *      1 ]
     * */
    public void createPattern(int rows) {
        for (int i=0; i<rows; i++) {
            for (int j=0; j<rows-i; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
