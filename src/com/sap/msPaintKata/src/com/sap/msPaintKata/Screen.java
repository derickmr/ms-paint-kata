package com.sap.msPaintKata;

import java.awt.font.ShapeGraphicAttribute;

public class Screen {

    /*

        The reason of this code have two solutions is because I was in doubt about the problem.
        The description said to replace the all adjacent positions, but in the example all occurrences of the color in the given position were replaced

     */

    public Integer[][] screenReplacement (Integer[][] screen, int x, int y, int newColor) throws IndexOutOfBoundsException{


        if (screen == null)
            throw new NullPointerException();

        if (x<0 || x>screen.length-1)
            throw new IndexOutOfBoundsException();

        if (y<0 || y>screen[x].length)
            throw new IndexOutOfBoundsException();

        int oldColor = screen[x][y];

        for (int i = 0; i<screen.length; i++){
            for (int j = 0; j<screen[i].length; j++){
                if (screen[i][j] == oldColor)
                        screen[i][j] = newColor;
            }
        }
        return screen;
    }

    public Integer[][] replaceAdjacentPositions (Integer[][] screen, int x, int y, int newColor) throws IndexOutOfBoundsException{

        if (screen == null)
            throw new NullPointerException();

        if (x<0 || x>screen.length-1)
            throw new IndexOutOfBoundsException();

        if (y<0 || y>screen[x].length)
            throw new IndexOutOfBoundsException();

        int row = x-1;

        if (row<0)
            row++;

        int validColumn = 0;
        if (y-1 >= 0)
            validColumn = y-1;

        for (; row<screen.length && row<x+2; row++){
            for (int column = validColumn; column<screen[row].length && column<y+2; column++){
                screen[row][column] = newColor;
            }
         }

        return screen;
    }

}
