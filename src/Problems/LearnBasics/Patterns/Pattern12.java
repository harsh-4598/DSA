package Problems.LearnBasics.Patterns;

public class Pattern12 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ 1             1
     *      1 2         2 1
     *      1 2 3     3 2 1
     *      1 2 3 4 4 3 2 1 ]
     * */
    public void createPattern(int rows) {
        /*for (int i=0; i<rows; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
        for (int i=0; i<rows; i++) {
            for (int j=0; j<rows-(i+1); j++) {
                System.out.print("  ");
            }
            for (int j=i+1; j>0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/
        for (int i=0; i<rows; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(j+1 + " ");
            }
            for (int j=0; j<2*rows-2*(i+1); j++) {
                System.out.print("  ");
            }
            for (int j=i+1; j>0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
