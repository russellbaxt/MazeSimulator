MazeSimulator
=============

An IAROC Maze simulator.

This package will create mazes for your virtual robot to navigate. Right now the robot is really quite stupid and wanders around randomly hoping to find a way out. Simply replace the code in the MazeSolver class with your solution. 

Can you make your robot go through the maze faster by giving him a memory?

First we create a maze for our robot to use:

Maze testMaze = new Maze();

We can see what our Maze looks like:

testMaze.dump();

Create a new robot inside our maze:

myRobot = new Robot(testMaze);

Let's take a look at our simple robot's command set:

Turn the robot (90 degrees):
myRobot.turnRight();
myRobot.turnLeft();

Make the robot move forward:
myRobot.move();

Check for walls:
Boolean wall = myRobot.isWallFront();
Boolean wall = myRobot.isWallLeft();
Boolean wall = myRobot.isWallRight();

Finally we can check and see if we have reached the end:
Boolean done = myRobot.isAtEnd();
