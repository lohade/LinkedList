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
        Node newnode=new Node(data);
        if(this.head==null){
            head=newnode;
        }
        else{
            Node last=this.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=newnode;
        }
    }


    public void display(){
        if(head==null){
            System.out.println("empty list");
        }
        Node temp=head;
        while(temp.next!=null){
            System.out.print("->"+temp.data);
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("->"+temp.data);
        }

    }


    public static void main(String[] args) {
        // write your code here
        LinkedList linkedlist=new LinkedList();
        linkedlist.addNode(56);
        linkedlist.addNode(30);
        linkedlist.addNode(70);
        linkedlist.display();



    }

}
