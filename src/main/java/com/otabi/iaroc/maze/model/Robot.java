package com.otabi.iaroc.maze.model;

/**
 * Created by Stephen on 5/31/2014.
 */
public class Robot {
    private Orientation currentOrientation = Orientation.EAST;
    private Position currentPosition = null;
    private Maze maze;

    public Robot() {
        this(new Maze());
    }

    public Robot(Maze maze) {
        this.maze = maze;
        this.currentPosition = maze.getStartPostion();
    }

    public void move() throws RobotHitsWallException, MazeNotBuiltException {
        //System.out.println("@"+currentPosition+" Move "+currentOrientation);
        if (maze.isWall(currentPosition, currentOrientation)) {
            throw new RobotHitsWallException();
        }
        currentPosition.move(currentOrientation);
    }

    public boolean isWallLeft() throws MazeNotBuiltException {
        return maze.isWall(currentPosition, currentOrientation.turnLeft());
    }

    public boolean isWallRight() throws MazeNotBuiltException {
        return maze.isWall(currentPosition, currentOrientation.turnRight());
    }

    public boolean isWallFront() throws MazeNotBuiltException {
        return maze.isWall(currentPosition, currentOrientation);
    }

    public void turnRight() {
        currentOrientation = currentOrientation.turnRight();
    }

    public void turnLeft() {
        currentOrientation = currentOrientation.turnLeft();
    }

    public boolean isAtEnd() {
        return maze.atEnd(currentPosition);
    }
}
