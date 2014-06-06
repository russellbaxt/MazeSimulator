package com.otabi.iaroc.maze.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Stephen on 6/5/2014.
 */
public class Maze {
    private JPanel MazeField;

    public Maze(int x, int y) {
        Panel[] rows = new Panel[y];
        for (int i = 0; i < y; y++) {
            rows[i] = new Panel();
            MazeField.add(rows[i]);
            for (int j = 0; j < x; x++) {
                rows[i].add(new JPanel());
            }
        }
    }
}
