package com.bridgelabz;


import java.util.Scanner;

public class LinkedList {
    public Node head=null;

    static class  Node {
        int data;
        Node next;
        //declare a parameterised constructor
        public Node(int data) {
            this.data =data;
            this.next = null;
        }
    }
    //adding node to linkedlist array
    public void addNode(int data){
        Node newnode=new Node(data);
        newnode.next=null;
        //checking head is empty or not
        if(this.head==null){
            head=newnode;//head is creating as newnode
        }
        else{
            Node last=this.head;//head is assigned as last
            //checking till last node
             while(last.next!=null){
                last=last.next;
            }
            last.next=newnode;//last node assigned as new node
        }
    }
    //adding node in middle
    public void addmiddle(int x){
        Node newnode=new Node(x);//x is creating as data
        int length=0;
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                length++;//calculate total size of linked list
                temp=temp.next;
            }
            int position;
            if(length%2==0){
                position=length/2;
            }
            else{
                position=(length+1)/2;
            }
            temp = head;
            while(position-- >1)
                temp=temp.next;
            newnode.next=temp.next;
            temp.next=newnode;

        }
    }

    //display function
    public void display(){
        if(head==null){
            System.out.println("empty list");
        }
        Node temp=head;
        while(temp.next!=null){
            System.out.print("->"+temp.data);//display elements one by one
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("->"+temp.data);//display last elements
        }

    }


    public static void main(String[] args) {
        // write your code here
        LinkedList linkedlist=new LinkedList();//display linked list  object
        linkedlist.addNode(56);//adding node
        linkedlist.addNode(70);
        linkedlist.addNode(50);
        linkedlist.display();//call display function
        System.out.println("enter elements to be insert:");
        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        linkedlist.addmiddle(x);//call middle insert function
        System.out.println("linked list after adding element in middle:");
        linkedlist.display();

    }
}
