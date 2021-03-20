package com.company;

import com.sun.source.tree.BinaryTree;

public class Tree {
    //init
    int value;
    Tree left, right;
    public Tree(int item){
        value = item;
        left = right = null;
    }
    public void insert(Tree tree, int value) {
        if (value < tree.value) { if (tree.left != null) { insert(tree.left, value); } else { System.out.println(" Inserted " + value + " to left of " + tree.value); tree.left = new Tree(value); } }
        else if (value > tree.value) {
            if (tree.right != null) {
                insert(tree.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of "
                                + tree.value);
                tree.right = new Tree(value);
            }
        }
    }
    public void traverseInOrder(Tree tree) {
        if (tree != null) {
            traverseInOrder(tree.left);
            System.out.print(" " + tree.value);
            traverseInOrder(tree.right);
        }
    }
    public static void main(String[] args) {

        //add
        Tree tree = new Tree(5);
        System.out.println("Tree with root value "+tree.value);
        tree.insert(tree,2);
        tree.insert(tree,8);
        tree.insert(tree,5);
        tree.insert(tree,1);
        tree.traverseInOrder(tree);
        //i would like to explain the code a bit since the
        //root node is 5 when add 2 it will tranfer to the left and to right if
        // it is bigger than 5
    }
}
