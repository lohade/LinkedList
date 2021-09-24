package com.bridgelabz;

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
        linkedlist.addNode(70);
        linkedlist.addNode(30);
        linkedlist.addNode(56);
        linkedlist.display();


    }

}
