package com.company;

import java.util.Scanner;
import java.util.Stack;

public class StackGame {
    public void run(){
        //initialize stack
        Stack<Integer> player1 = new Stack<>();
        Stack<Integer> player2 = new Stack<>();
        //define the range to math random
        int max=10;
        int min=1;
        int range = max - min +1;
        int rand = 0;

        //initialize variable
        int sum1 = 0;
        int sum2 = 0;
        int rounds;



        //Get rounds from user
        Scanner input = new Scanner(System.in);
        System.out.println("Play Game!!! The max 3-Cards!!!");
        System.out.println("How many round you want to play?(max 3 round)");
        rounds = input.nextInt();

        //Display Result
       if (rounds>3){
           System.out.println("Error game cannot start with more than 3 rounds.");
       }else {
           System.out.println("*************Game Stars!!!!***************");
           for (int i=1; i<=rounds;i++){
               for (int j=0; j<3; j++){
                   rand = (int)(Math.random()*range)+ min;
                   player1.push(rand);
               }
               for (int k=0; k<3; k++){
                   rand = (int)(Math.random()*range)+ min;
                   player2.push(rand);
               }

               System.out.println("Player 1 :"+player1);
               System.out.println("Player 2 :"+player2);
               //sum the number in stack so we know who win
               for (int x=0; x<3 ;x++){
                   sum1 = sum1 + player1.pop();
               }
               System.out.println(sum1);
               for (int x=0; x<3 ;x++){
                   sum2 = sum2 + player2.pop();
               }
               System.out.println(sum2);
                if (sum1>sum2){
                    System.out.println("----------------- Round "+i+": Player"+1+" Wins!");
                }else if (sum2>sum1){
                    System.out.println("----------------- Round "+i+": Player"+2+" Wins!");
                }

               sum1=0;
               sum2=0;
               player1.clear();
               player2.clear();
           }
       }


    }
}
