package com.bridgelabz;


import java.util.Scanner;

public class LinkedList {
    public Node head = null;

    static class Node {
        int data;
        Node next;

        //declare a parameterised constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //adding node to linkedlist array
    public void addNode(int data) {
        Node newnode = new Node(data);
        newnode.next = null;
        //checking head is empty or not
        if (this.head == null) {
            head = newnode;//head is creating as newnode
        } else {
            Node last = this.head;//head is assigned as last
            //checking till last node
            while (last.next != null) {
                last = last.next;
            }
            last.next = newnode;//last node assigned as new node
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("empty list");
        }
        Node temp = head;
        while (temp.next != null) {
            System.out.print("->" + temp.data);//display elements one by one
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("->" + temp.data);//display last elements
        }

    }

    //adding node in middle
    public void addmiddle(int x) {
        Node newnode = new Node(x);//x is creating as data
        int length = 0;
        if (head == null) {
            System.out.println("list is empty");
        } else {
            Node temp = head;
            while (temp.next != null) {
                length++;//calculate total size of linked list
                temp = temp.next;
            }
            int position;
            if (length % 2 == 0) {
                position = length / 2;
            } else {
                position = (length + 1) / 2;
            }
            temp = head;
            while (position-- > 1)
                temp = temp.next;
            newnode.next = temp.next;
            temp.next = newnode;

        }
    }

    public void pop() {
        if (head == null) {
            System.out.println("linked list is empty:");
        } else {

            head = head.next;
        }
    }

    public void poplast(){
        if(head==null){
            System.out.println("list is empty:");
        }
        else{
            Node temp=head;
            Node last=head;
            while(last.next.next!=null)
                last=last.next;
            last.next=null;
        }
    }
    public void search(int data){
        Node temp=head;
        int position=1;
        while(temp.data!=data){

            temp=temp.next;
            position++;
        }
        if(temp.data==data){
            System.out.println("Node:"+data+ "is present at:"+position);
        }
        else{
            System.out.println("node is not present");
        }
    }

    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();//display linked list  object
        boolean status = true;
        do {
            System.out.println("enter choice for:\n1:adding elements in linked list:\n2:insert element in middle of linked list:\n3:delete first node:\n4:deleting last elements:\n5:Search the elements:\n6:exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    boolean value = true;
                    while (value) {
                        int data = scanner.nextInt();
                        linkedlist.addNode(data);
                        System.out.println("adding  more elements in linked list enter 1 else 0:");
                        int num = scanner.nextInt();
                        if (num == 1)
                            value = true;
                        else
                            value = false;
                    }
                    linkedlist.display();

                    break;
                case 2:
                    System.out.println("enter elements to be insert:");
                    int x = scanner.nextInt();
                    linkedlist.addmiddle(x);//call middle insert function
                    System.out.println("linked list after adding element in middle:");
                    linkedlist.display();

                    break;
                case 3:
                    linkedlist.pop();
                    linkedlist.display();
                    break;

                case 4:
                    linkedlist.poplast();
                    linkedlist.display();

                case 5:
                    int key= scanner.nextInt();
                    linkedlist.search(key);
                    break;
                case 6:
                    status=false;
                    break;

            }
        } while(status);
    }
}