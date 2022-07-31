ackage com.company;

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void printing(Node<Integer> head){
        Node<Integer> cNode=head;
        while (cNode!=null){
            System.out.print(cNode.data+"->");
            cNode=cNode.next;
        }
        System.out.println("tail");
    }

    static int middleEleLL(Node<Integer> head){
        Node<Integer> slow=head;
        Node<Integer> fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public static void main (String[] args) throws java.lang.Exception
    {

        Node<Integer> n1=new Node<Integer>(10);
        Node<Integer> n2=new Node<Integer>(20);
        Node<Integer> n3=new Node<Integer>(30);
        Node<Integer> n4=new Node<Integer>(40);
        Node<Integer> n5=new Node<Integer>(50);
        Node<Integer> n6=new Node<Integer>(60);
        Node<Integer> n7=new Node<Integer>(70);

        Node<Integer> head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        printing(head);

        System.out.println(middleEleLL(head));
    }
}
class Node<T>{
    T data;
    Node<Integer> next;

    Node(T data){
        this.data=data;
        next=null;
    }
}