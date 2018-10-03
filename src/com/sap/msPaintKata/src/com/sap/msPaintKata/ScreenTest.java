package com.sap.msPaintKata;

public class ScreenTest {

    public static void main (String[] args){

        Screen screen = new Screen();

        Integer[][] screenR = new Integer[3][3];

        for (int i = 0; i<screenR.length; i++){
            for (int j = 0; j<screenR[i].length; j++){
                screenR[i][j] = 0;
                System.out.print(screenR[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        screenR = screen.replaceAdjacentPositions(screenR, 0, 2, 1);

        for (int i = 0; i<screenR.length; i++){
            for (int j = 0; j<screenR[i].length; j++){
                System.out.print(screenR[i][j]);
            }
            System.out.println();
        }

    }

}
