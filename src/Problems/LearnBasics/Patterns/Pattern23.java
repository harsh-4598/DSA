package Problems.LearnBasics.Patterns;

public class Pattern23 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ 0 0 0 4
     *      0 0 3
     *      0 2
     *      1 ]
     * */
    public void createPattern(int rows) {
        for (int i=rows; i>0; i--) {
            for (int j=0; j<i-1; j++) {
                System.out.print("0 ");
            }
            System.out.print(i);
            System.out.println();
        }
    }
}
