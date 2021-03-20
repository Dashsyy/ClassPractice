package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Singly_Linked_list {
    Node head;
    static class Node{
        public int data;
        public Node nextNode;

        public Node(int data){
            this.data = data;
        }
    }
    public void run(){
        int choice;
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        do{
        menu();
        }while(!"0".equals(choice));
    }
    public void menu(){

        //init choice for user to choose which option they want to perform
        int choice;

        //Welcome Screen
        System.out.println("***Singular Linked list***");
        System.out.println("Select one option to perform");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Access");
        System.out.println("4. Exit");
        System.out.println("5. Search");
        System.out.println("6. Reverse Linked list");

        //init Scanner to get user input
        Scanner input = new Scanner(System.in);

        //use switch to perform specific task: insert, delete, accessing, exit, search.
        choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Insert number to linked list");
                insert();
                break;
            case 2:
                System.out.println("Delete number to linked list");
                delete();
                break;
            case 3:
                System.out.println("Access number to linked list");
                display();
                break;
            case 4:
                System.out.println("Exit program");
                break;
            case 5:
                System.out.println("Search number to linked list");
                break;
            case 6:
                System.out.println("Reverse Linkedlist");
                reverseLinkedlist();
                break;
            default:
                System.out.println("Command not found");
                break;
        }//end of switch
    }//end of menu

    //Function
    //insert: add to head, add to tails
    public void insert(){
        Scanner input = new Scanner(System.in);
        System.out.println("Which one you want to insert to");
        System.out.println("1. Insert to head");
        System.out.println("2. Insert to tails");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("***Add to head***");
                System.out.println("How many element you want to input in the list:|");
                int num = input.nextInt();
                Add_to_head(num);

                break;
            case 2:
                System.out.println("***Add to head***");
                System.out.println("How many element you want to input in the list:|");
                num = input.nextInt();
                Add_to_tails(num);
                break;
            default:
                System.out.println("Command not found");
        }
    }
    //Add element to the head
    public void Add_to_head(int cycle){
        //create newnode to accept new head of the node
        int new_head;
        Scanner input = new Scanner(System.in);
        for (int i=0; i<cycle; i++){
            new_head = input.nextInt();
            Node new_node = new Node(new_head);
            //Let the new_head as head
            new_node.nextNode = head;
            head = new_node;
        }
        display();
    }
    //add element to the tails
    //Since the list keep add to tail by default we don't need to do more work but
    //use the built in function just to make sure it really add to the tails
    public void Add_to_tails(int numOfElement){
        LinkedList<Integer> list = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Input number only");
        for (int i=0;i<numOfElement;i++){
            System.out.println("Enter data for index "+i);
            int data = input.nextInt();
            //with this builtin function you can easily add number to the first of the list
            list.addLast(data);
        }
        System.out.println(list);
    }

    //Function
    //Delete: delete from head, delete from tail
    public void delete(){
        Scanner input = new Scanner(System.in);
        System.out.println("Which one you want to insert to");
        System.out.println("1. Delete head");
        System.out.println("2. Delete tails");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("***Delete head***");
                //Insert code to delete head
                //check if linkedlist is empty if we delete the empty list it will throw exceptions
                //we can just give the head of the node to a next node
                head = head.nextNode;
                break;
            case 2:
                System.out.println("***Delete tail***");
                //Insert code to delete tail
                //check if linkedlist is empty if we delete the empty list it will throw exceptions
                if (head == null){
                    System.out.println("LinkList is empty");
                    return;
                }

                // Find the second last node
                Node last_node = head;
                while (last_node.nextNode.nextNode != null) {
                    last_node = last_node.nextNode;
                }

                System.out.println(last_node.data);
                // Change next of second last
                //if we able to find the last node that mean the next one must be null so just
                // give that one null
                last_node.nextNode = null;
                break;
            default:
                System.out.println("Command not found");
        }
    }//end of delete
    //Function
    //Accessing and display node linkedlist
    public void display(){
        Node show = head;
        while (show != null){
            System.out.print(show.data+"->");
            show = show.nextNode;
        }
    }
    //Function
    //reserveList
    public void reverseLinkedlist(){
        Node prevNode = null;
        Node currentNode = head;
        Node nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.nextNode;
            currentNode.nextNode = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
    }
    public void search(int searchID){
            Node currentNode = head;
            int i = 1;
            while(currentNode != null){
                //if the id is match we print it out
                if(searchID == currentNode.data){
                    System.out.println ("The node you search for:|  "+String.valueOf(i)+ ": " + currentNode.data);
                }
                i++;
                //get the next node
                currentNode = currentNode.nextNode;
            }


    }
}
