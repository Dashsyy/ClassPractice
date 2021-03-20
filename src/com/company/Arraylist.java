package com.company;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Arraylist let you store the item in list without specific the amount of index(resizeable array).

        //add
        list.add(1);
        list.add(0);
        list.add(3);

        //view
        //view element in the array without loop
        System.out.print("Arraylist "+list+"\n");
        //view element in the array with loop
        System.out.print("Element in the arraylist: ");
        for (int i:list){
            System.out.print(i+" ");
        }

        //remove
        //remove by find the value
        list.remove(Integer.valueOf(0));
        //you can also remove by index but it is not recommended since it need to sort first for proper delete.
        System.out.println(list);

        //search
        //find number in the arraylist
        for (int i =0; i<10;i++){
            list.add(i*i+1);
        }
        System.out.println(list);
        //find by value
        //return true if there is the number in the list false if not.
        System.out.println(list.contains(Integer.valueOf(26)));
        System.out.println(list.contains(Integer.valueOf(26)));
    }
}
