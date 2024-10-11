package LeetCodeContest.contest1;

public class NeighborSum {
    int[][] grid;

    public NeighborSum(int[][] grid) {
        this.grid = grid;
    }

    public int adjacentSum(int value) {
        int adcolacentSum = 0;
        for (int row=0; row<grid.length; row++) {
            for (int col=0; col<grid[row].length; col++) {
                if (grid[row][col] == value) {
                    //row-1, col -> Top
                    if (row-1 >= 0)
                        adcolacentSum+=grid[row-1][col];
                    //row+1, col -> Bottom
                    if (row+1 < grid.length)
                        adcolacentSum+=grid[row+1][col];
                    //row, col-1 -> Left
                    if (col-1 >= 0)
                        adcolacentSum+=grid[row][col-1];
                    //row, col+1 -> Right
                    if (col+1 < grid[row].length)
                        adcolacentSum+=grid[row][col+1];
                    break;
                }
            }
        }
        return adcolacentSum;
    }

    public int diagonalSum(int value) {
        int diagonalSum = 0;
        for (int row=0; row<grid.length; row++) {
            for (int col=0; col<grid[row].length; col++) {
                if (grid[row][col] == value) {
                    //row-1, col-1 -> Top Left
                    if (row-1 >= 0 && col-1 >=0)
                        diagonalSum+=grid[row-1][col-1];
                    //row-1, col+1 -> Top Right
                    if (row-1 >=0 && col+1 < grid[row].length)
                        diagonalSum+=grid[row-1][col+1];
                    //row+1, col-1 -> Bottom Left
                    if (row+1 < grid.length && col-1 >=0)
                        diagonalSum+=grid[row+1][col-1];
                    //row+1, col+1 -> Bottom Right
                    if (row+1 < grid.length && col+1 < grid[row].length)
                        diagonalSum+=grid[row+1][col+1];
                    break;
                }
            }
        }
        return diagonalSum;
    }
}
