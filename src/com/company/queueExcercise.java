package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class queueExcercise {

    private static int front,rear,capacity;
    private static int queue[];
    queueExcercise(int size){
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];
    }
    //insert queue
    static void setQueue(int element){
        //check first if the queue is full
        if (capacity==rear){
            System.out.println("Queue is full");
            return;
        }
        else {
            queue[rear]= element;
            rear++;
        }
        return;

    }
    //remove or dequeue
    static void dequeue(){
        if(front==rear){
            System.out.println("Queue is Empty");
            return;
        }
        else{
            for (int i=0; i < rear-1; i++){
                queue[i]=queue[i+1];
            }
            if (rear<capacity){
                queue[rear]=5;
                rear--;
            }
        }
        return;
    }
    //display front queue
    static void displayFront(){
        if (front==rear){
            System.out.println("Queue is Empty");
            return;
        }else{
            System.out.println("\nFront element of the queue: "+ queue[front]);
        }
        return;
    }
    //display queue
    static void queuedisplay(){
        int i;
        if (front==rear){
            System.out.println("Queue is Empty");
            return;
        }
        for (i=front; i<rear;i++){
            System.out.printf("%d ->",queue[i]);
        }
    }

    public static void main(String[] args) {
        //init,add,delete,Q peek,isEmpty,is full
        //init
        queueExcercise q = new queueExcercise(5);
        setQueue(2);
        setQueue(1);
        setQueue(3);
        setQueue(4);


        //dequeue from the front
        queuedisplay();
        displayFront();
        System.out.println("\n");
        dequeue();
        setQueue(5);
        queuedisplay();

        //display front
        displayFront();
    }
}
