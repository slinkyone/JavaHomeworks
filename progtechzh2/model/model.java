/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kubuaai
 */
public class model {
    private static int SIZE = 5;
    private int[][] fields = new int[SIZE][SIZE];
    private int counter = 0;
    private int huszarX = SIZE-1;
    private int huszarY = SIZE-1;
    private List<Integer> myCoords = new ArrayList<Integer>();
    private boolean lephetE;
    
    public model(){
        for(int i=0; i < SIZE; ++i) {
            for(int j=0; j < SIZE; ++j) {
                fields[i][j] = ++counter;
            }
        }
        fields[SIZE-1][SIZE-1] = 0;
        myCoords.add(0);
    }
    
    public int getElements(int x, int y){
        return fields[x][y];
    }
    
    public void lephetE(int x, int y){
        System.out.println();
        lephetE= false;
        
        for (int i = 0; i < myCoords.size(); i++) {
            if(myCoords.get(i) != fields[x][y]){
                lephetE = true;
                System.out.println(myCoords.get(i));
            }else lephetE = false;
        }
        System.out.println(lephetE);
    }
    
    public void lephet(int x, int y){
        int diffX = Math.abs(huszarX-x);
        int diffY = Math.abs(huszarY-y);
        
        if(((diffX == 1 && diffY == 2) && lephetE) || ((diffX == 2 && diffY == 1) && lephetE)){
            myCoords.add(fields[x][y]);
            fields[huszarX][huszarY] = fields[x][y];
            fields[x][y] = 0;
            huszarX = x;
            huszarY = y;
        }
    }
    
    public boolean winCheck(){
        if (myCoords.size() == 25){
            return true;
        }else return false;
    }
}
