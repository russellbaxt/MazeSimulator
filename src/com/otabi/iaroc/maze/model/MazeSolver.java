package com.otabi.iaroc.maze.model;

/**
 * Created by Stephen on 6/1/2014.
 */
public class MazeSolver {
    private static final int MAXMOVES = 300;

    public static boolean solve(Maze maze) throws MazeNotBuiltException, Exception {
        Robot r = new Robot(maze);
        int moves = 0;

        while (!r.isAtEnd()) {
            if (moves > MAXMOVES) throw new Exception("Exceeded maximum number of moves allowed.");

            /*
             *  Insert your logic here to navigate robot 'r' through the maze
             */

            moves++;
        }

        System.out.println("Solved in " + moves + " moves.");
        return (r.isAtEnd());
    }
}
