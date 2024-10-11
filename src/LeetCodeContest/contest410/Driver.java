package LeetCodeContest.contest410;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Snake snake = new Snake();
        System.out.println(snake.finalPositionOfSnake(3, List.of("DOWN", "RIGHT", "UP")));
    }
}
