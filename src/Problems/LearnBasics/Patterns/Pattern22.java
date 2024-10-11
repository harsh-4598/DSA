package Problems.LearnBasics.Patterns;

public class Pattern22 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [ 4 4 4 4 4 4 4
     *      4 3 3 3 3 3 4
     *      4 3 2 2 2 3 4
     *      4 3 2 1 2 3 4
     *      4 3 2 2 2 3 4
     *      4 3 3 3 3 3 4
     *      4 4 4 4 4 4 4 ]
     * */
    public void createPattern(int rows) {
        for (int i=0; i<2*rows-1; i++) {
            for (int j=0; j<2*rows-1; j++) {
                int top = i;
                int left = j;
                int right = (2*rows-2)-j;
                int bottom = (2*rows-2)-i;
                System.out.print(rows - Math.min(Math.min(top, bottom), Math.min(left,right)) + " ");
            }
            System.out.println();
        }
    }
}
