package com.irinaserova;


import java.util.ArrayList;
import java.util.Scanner;
 
//to reach from a point (x1,y1) to (x2, y2) is to move abs(x2-x1) steps 
//in horizontal direction and abs(y2-y1) steps in vertical direction, 
//but this is not the shortest path to reach (x2,y2). 
//The best way would be to cover the maximum possible distance in diagonal direction and remaining in horizontal or vertical direction. 
//If we look closely this just reduces to maximum of abs(x2-x1) and abs(y2-y1).

//Example
//x1 = 5, y1= 20
//x2 = 15, y2 = 15
//
//we first move diagonally to reach (10,15) this takes 5 steps and then we move 5 units in x direction, 
//which again takes 5 steps. In total this is 10 steps which is equal to MAX(abs(15-5), abs(15-20))

public class MibStepsV2 {

    public static void main(String args[]){

        System.out.println("Enter the No of Points: ");

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> X = new ArrayList<Integer>();
        ArrayList<Integer> Y = new ArrayList<Integer>();

        int size = sc.nextInt();

        System.out.println("Enter the Points: ");

        for(int i=0 ; i<size; i++){
            System.out.print("X: ");
            X.add(sc.nextInt());
            System.out.print("Y: " );
            Y.add(sc.nextInt());
            System.out.println();
        }

        MibStepsV2 obj = new MibStepsV2();
        size = obj.coverPoints(X,Y);
        System.out.println("The minimum required steps are: "+ size);
    }

    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {

            int Steps = 0;
            for(int i = 1; i < X.size(); i++){
                Steps += Math.max( Math.abs(X.get(i) - X.get(i-1)), Math.abs(Y.get(i) - Y.get(i-1)) );
            }
            return Steps;
    }
}