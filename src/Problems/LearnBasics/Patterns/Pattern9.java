package Problems.LearnBasics.Patterns;

public class Pattern9 {
    /**
     * Creates a below pattern
     * for eg: rows = 4
     * output :
     *    [       *
     *          * * *
     *        * * * * *
     *      * * * * * * *
     *      * * * * * * *
     *        * * * * *
     *          * * *
     *            *       ]
     *      combine pattern 7 and 8
     * */
    public void createPattern(int rows) {
        new Pattern7().createPattern(rows);
        new Pattern8().createPattern(rows);
    }
}
