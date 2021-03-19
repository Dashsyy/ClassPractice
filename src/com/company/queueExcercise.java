package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class queueExcercise {

    public void run(){
        //init,add,delete,Q peek,isEmpty,is full
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue1 = new ArrayBlockingQueue<Integer>(4);
        queue1.add(3);
        queue1.add(2);
        queue1.add(1);
        queue1.peek();
        System.out.println(queue1);
        System.out.println("Hello");

    }
}
