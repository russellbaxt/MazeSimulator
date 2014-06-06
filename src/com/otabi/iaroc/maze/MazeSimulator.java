package com.otabi.iaroc.maze;


import com.otabi.iaroc.maze.model.Maze;
import com.otabi.iaroc.maze.model.MazeNotBuiltException;
import com.otabi.iaroc.maze.model.MazeSolver;

/**
 * Created by Stephen on 6/6/2014.
 */
public class MazeSimulator {
    public static void main(String[] args) {
        Maze testMaze = new Maze();
        testMaze.dump();
        try {
            MazeSolver.solve(testMaze);
        } catch (MazeNotBuiltException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
