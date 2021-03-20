package com.company;

import java.util.HashMap;

public class Dictionary {
    public static void main(String[] args) {

        //create an empty Haspmap to store data
        HashMap<Integer,String> map = new HashMap<>();

        //Add element to the map
        //An example of student id to get student name
        //in hash you cant store duplicated key
        map.put(1,"Sunhour");
        map.put(2,"Java");
        map.put(3,"C++");

        //display all the key element
        System.out.println("Key for all the element in map: "+map.values());
        System.out.println("String value that associate with number 1:"+map.get(1));

        //search
        //the containkey is to find the id then map.get() need an id to get the value
        if (map.containsKey(1)){
            String a = map.get(1);
            System.out.println("value for key 1"+a);
        }

        //remove
        //first is to check if 1 is exit then remove
        if (map.containsKey(1)){
            map.remove(1);
        }
        System.out.println("Hash Map after remove 1 "+map.values());

        //update
        //there are alot of way to do this
        //for this time i will find if it is exit then update he String value to something else
        if (map.containsKey(2)){
            map.replace(2,"Python");
        }
        System.out.println("Hasp map after replace 2 to python: "+map.values());


    }
}
