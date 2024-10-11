package Problems.LearnBasics.Patterns;

public class Pattern11 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ 1
     *      0 1
     *      1 0 1
     *      0 1 0 1]
     * */
    public void createPattern(int rows) {
        for (int i=1; i<=rows; i++) {
            int start = 0;
            if (i % 2 != 0) start = 1;
            for (int j=1; j<=i; j++) {
                System.out.print(start + " ");
                //start = (start == 1) ? 0 : 1;
                start = 1- start;
            }
            System.out.println();
        }
    }
}
