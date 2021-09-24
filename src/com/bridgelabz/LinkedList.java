package com.bridgelabz;

import java.util.Scanner;

public class LinkedList {
    public Node head=null;

    static class  Node {
        int data;
        Node next;

        public Node(int data) {
            this.data =data;
            this.next = null;
        }
    }

    public void addNode(int data){
        Node newNode=new Node(data);
        newNode.data=data;
        newNode.next=head;
        head=newNode;
    }

    public void display(){
        Node temp=head;
        if(head==null){
            System.out.println("empty list");
            return;
        }

        while(temp.next!=null){
            System.out.print("->"+temp.data);
            temp=temp.next;
        }
        if(temp.next==null) {
            System.out.print("->"+temp.data);
        }
    }

    public static void main(String[] args) {
        // write your code here
        LinkedList linkedlist=new LinkedList();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first element:");
        int data1=scanner.nextInt();
        linkedlist.addNode(data1);
        System.out.println("enter second element:");
        int data2=scanner.nextInt();
        linkedlist.addNode(data2);
        System.out.println("enter third element:");
        int data3=scanner.nextInt();
        linkedlist.addNode(data3);
        linkedlist.display();


    }

}
