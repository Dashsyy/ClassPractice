package com.company;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //1.Display the even number in the Array
        System.out.println("1.Display the even number in the Array");
        int[] EvenNumber = {1,2,3,4,5};
       for(int i: EvenNumber){
           if (i%2==0){
               System.out.println(i);
           }
       }
        //2.Display the Student test score 2D array
        System.out.println("2.Display the Student test score 2D array");
        Scanner input = new Scanner(System.in);
        int stCount,stScore;
        int j;int i;

        System.out.println("How many student you want to input?");



        stCount = input.nextInt();
        System.out.println("The number of student you want to input: "+stCount);

        System.out.println("How many subject you want to input");
        stScore = input.nextInt();
        System.out.println("The number of subject you want to input: "+stScore);
        double[][] totalScore = new double[stCount][stScore];

        for ( i=0; i <stCount; ++i){
            for (j=0; j<stScore; ++j){
                int num = i+1;
                System.out.println("Please enter score of student "+num+" test "+j);
                totalScore[i][j]=input.nextInt();
            }
        }
        for (int k=0;k<stCount;k++){
            int num= k+1;
            System.out.println("Student "+num);
            {
                for (int l=0; l<stScore;l++){
                    System.out.println("score "+totalScore[k][l]);
                }
            }
        }



    }

}
