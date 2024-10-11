package Problems.LearnBasics.Patterns;

public class Pattern18 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ D
     *      C D
     *      B C D
     *      A B C D]
     * */
    public void createPattern(int rows) {
        for (int i=0; i<rows; i++) {
            char start = (char) ('A' + rows-i-1);
            for (int j=0; j<=i; j++) {
                System.out.print(start++ + " ");
            }
            System.out.println();
        }
    }
}
