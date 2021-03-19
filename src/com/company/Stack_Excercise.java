package com.company;

import java.sql.SQLOutput;
import java.util.Stack;

public class Stack_Excercise {
    //push element on top of the stack
    static void stack_push(Stack<Integer> stack){
        for (int i =0; i<3;i++){
            stack.push(i);
        }
    }
    //Pop element from the top
    static void stack_pop(Stack<Integer> stack){
        for (int i =0; i<3;i++){
            Integer integer = (Integer) stack.pop();
            System.out.println(integer);
        }
    }
    //Display the element on the top
    static void stack_peek(Stack<Integer> stack){
        Integer integer = (Integer) stack.peek();
        System.out.println("Element on stack top: "+ integer);
    }

    //Search the element in the stack
    static void stack_search(Stack<Integer> stack,int element){
        Integer search_element = (Integer) stack.search(element);
        if (search_element == -1){
            System.out.println("Element nto found");
        }else
            System.out.println("Element is found at: " + search_element + " Position");
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //push 3 element in stack
        stack_push(stack);
        //Pop element that in the stack
        stack_pop(stack);

        //peek
        stack_push(stack);
        stack_peek(stack);

        //search
        stack_search(stack,1);
    }
}
