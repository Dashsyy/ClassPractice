package com.company;

import java.util.HashMap;
import java.util.Map;

public class Tries {
    private boolean isLeaf;
    private Map<Character, Tries> children;

    // Constructor
    Tries()
    {
        isLeaf = false;
        children = new HashMap<>();
    }

    // Iterative function to insert a string into a Trie
    public void insert(String key)
    {
        System.out.println("Inserting \"" + key + "\"");

        // start from the root node
        Tries curr = this;

        // do for each character of the key
        for (char c: key.toCharArray())
        {
            // create a new node if the path doesn't exist
            curr.children.putIfAbsent(c, new Tries());

            // go to the next node
            curr = curr.children.get(c);
        }

        // mark the current node as a leaf
        curr.isLeaf = true;
    }

    // Iterative function to search a key in a Trie. It returns true
    // if the key is found in the Trie; otherwise, it returns false
    public boolean search(String key)
    {
        System.out.print("Searching \"" + key + "\" : ");

        Tries curr = this;

        // do for each character of the key
        for (char c: key.toCharArray())
        {
            // go to the next node
            curr = curr.children.get(c);

            // if the string is invalid (reached end of a path in the Trie)
            if (curr == null) {
                return false;
            }
        }

        // return true if the current node is a leaf node and the
        // end of the string is reached
        return curr.isLeaf;
    }

    public static void main(String[] args) {
        // construct a new Trie node
        Tries head = new Tries();

        head.insert("Ce");
        head.insert("Con");
        head.insert("Do");
        head.insert("Don");
        head.insert("Sa");
        head.insert("Si");

        System.out.println(head.search("Ce"));			// true
        System.out.println(head.search("Do"));   		// true
        System.out.println(head.search("Don"));  		// true
        System.out.println(head.search("Sa"));   // false

        head.insert("CeConDoDonSaSi");

        System.out.println(head.search("Ce"));			// true
        System.out.println(head.search("Con"));   		// true
        System.out.println(head.search("Don"));  		// true
        System.out.println(head.search("Do"));   // true
    }
}
