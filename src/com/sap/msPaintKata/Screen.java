package com.sap.msPaintKata;

public class Screen {

    public Integer[][] screenReplacement (Integer[][] screen, int x, int y, int newColor) throws IndexOutOfBoundsException{

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

}
