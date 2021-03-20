
package com.company;

import java.util.Scanner;
public class Doubly_linked_list {

    
    
    public static void main(String[] args) {
        
        LinkedList linked = new LinkedList();
        String choice;
        Scanner in = new Scanner(System.in);
        System.out.println("--Doubly Linked List--");
        
        do{
            Menu();
            choice = in.next();
            int input = 0;
            switch(choice){
                case "1":
                    System.out.println("Input Data: ");
                    input = in.nextInt();
                    linked.appendHead(input);
                    break;
                case "2":
                    System.out.println("Input Data: ");
                    input = in.nextInt();
                    linked.appendTail(input);
                    break;
                case "3":
                    linked.display();
                    break;
                case "4":
                    linked.deleteHead();
                    break;
                case "5":
                    linked.deleteTail();
                    break;
                case "6":
                    System.out.println("Input Data: ");
                    input = in.nextInt();
                    linked.deleteMiddle(input);
                    break;
                case "7":
                    linked.reverse();
                    linked.display();
                    break;
                case "8":
                    System.out.println("Input Data: ");
                    input = in.nextInt();
                    linked.search(input);
                    break;
                default:
                    break;
                    
            }
        }while(!"0".equals(choice));
    }
    
    public static class Node{
        int data;
        Node next;
        Node previous;
        
        public Node(){}
        
        public Node(int data){
            this.data = data;
        }
    }
    private static void Menu(){
        System.out.println("1. Add to head");
        System.out.println("2. Add to tail");
        System.out.println("3. Display");
        System.out.println("4. Delete head");
        System.out.println("5. Delete tail");
        System.out.println("6. Delete middle");
        System.out.println("7. Reverse list");
        System.out.println("8. Search");
        System.out.println("0. Exit");
        System.out.print("Enter number: ");
    }
    public static class LinkedList {
        Node head;
        public LinkedList(){}
        
        
        public void appendHead(int data){
            if(head == null){
                head = new Node(data);
                return;
            }
            Node node = new Node(data);
            head.previous = node;
            node.next = head;
            head = node;  
        }
        
        public void appendTail(int data){
            Node newNode = new Node(data);
            Node last = head; 
            newNode.next = null;
            if (head == null) {
                newNode.previous = null;
                head = newNode;
                return;
            }

            while (last.next != null){
                last = last.next;
            }
            last.next = newNode;
            newNode.previous = last;
        }
        
        public void deleteHead(){
            
            if (head == null){
                System.out.println("LinkList is empty!");
                return;
            }
            head = head.next;
        }
        
        public void deleteMiddle(int data){
            Node current = head;
            if(head == null){
                System.out.println("Linked List is not found!");
                return;
            }
            
            while(current != null){
                if (current.data == data) {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                    return;
                }
                current = current.next;
            }
        }
        
        public void deleteTail(){
            
            if (head == null){
                System.out.println("LinkList is empty!");
                return;
            }
            Node secondLast = head; 
            while (secondLast.next.next != null) 
                secondLast = secondLast.next; 

            System.out.println(secondLast.data);
            secondLast.next = null; 
        }

        public void search(int data){
            Node current = head;
            if(head == null){
                System.out.println("Linked List is not found!");
                return;
            }
            int i = 1;
            while(current != null){
                if (current.data == data){
                    System.out.println("Node "+ i + " " +current.data);
                }
                i++;
                current = current.next;
            }
        }
        
        public void reverse(){ 
            Node current = head;
            Node temporary= null;
            while(current !=null){
                temporary = current.previous; 
                current.previous = current.next; 
                current.next = temporary;             
                current = current.previous; 
            }
            
            if(temporary != null ){
                head = temporary.previous; 
            } 
        }
        public void display(){
            Node current = head;
            if(head == null){
                System.out.println("Linked List is not found!");
                return;
            }
            
            while(current != null){
                System.out.println("Data: "+current.data);
                current = current.next;
            }
        }
    }
    

    
}
