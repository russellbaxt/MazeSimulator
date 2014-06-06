package com.otabi.iaroc.maze;

import com.otabi.iaroc.maze.model.Maze;
import com.otabi.iaroc.maze.model.MazeNotBuiltException;
import com.otabi.iaroc.maze.model.Robot;
import com.otabi.iaroc.maze.model.RobotHitsWallException;

import java.util.Random;

/**
 * Created by Stephen on 6/1/2014.
 */
public class MazeSolver {
    private static final int MAXMOVES = 3000;

    public static int solve(Maze maze) throws MazeNotBuiltException, Exception {
        Robot myRobot = new Robot(maze);
        Random randomGenerator = new Random();
        int moves = 0;

        while (!myRobot.isAtEnd()) {
            if (moves > MAXMOVES) throw new Exception("Exceeded maximum number of moves allowed.");

            /*
             *  Insert your logic here to navigate robot 'myRobot' through the maze
             */

            if (randomGenerator.nextBoolean()) {
                if (randomGenerator.nextBoolean()) {
                    myRobot.turnLeft();
                } else {
                    myRobot.turnRight();
                }
            }

            try {
                myRobot.move();
                moves++;
            } catch (RobotHitsWallException e) {
                //System.err.println("Ouch!");
            }

        }

        System.out.println("Solved in " + moves + " moves.");
        return (moves);
    }
}
