package LeetCodeContest.contest410;

import java.util.List;

public class Snake {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int row=0;
        int col=0;
        for (String command : commands) {
            /*if (command.equals("UP")) {
                row = row - 1;
                if (row < 0) row = n-1;
            } else if (command.equals("DOWN")) {
                row = row + 1;
                if (row > n-1) row = 0;
            } else if (command.equals("LEFT")) {
                col = col -1;
                if (col < 0) col = n-1;
            } else {
                col = col + 1;
                if (col > n-1) col = 0;
            }*/
        }
        return (row * n) + col;
    }
}
