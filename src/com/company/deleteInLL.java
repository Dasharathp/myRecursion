import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void printing(Node<Integer> head){
        Node cNode=head;
        while (cNode!=null){
            System.out.print(cNode.data+"->");
            cNode=cNode.next;
        } 
        System.out.println("tail");
    }

    static Node<Integer> deleteLL(int position,Node<Integer> head){
        if(position==0){
            head=head.next;
            return head;
        }
        Node<Integer> cNode=head;
        for(int i=0;i<position-1;i++){
            cNode=cNode.next;
        }
        cNode.next=cNode.next.next;
        return head;
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
	      
		Node<Integer> n1=new Node(10);
		Node<Integer> n2=new Node(20);
		Node<Integer> n3=new Node(30);
		Node<Integer> n4=new Node(40);
		
		Node<Integer> head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		printing(head);
	  //head=InsertLL(100,0,head);
	  head=deleteLL(0,head);
		printing(head);
	}
}
class Node<T>{
    T data;
    Node next;
    
    Node(T data){
        this.data=data;
        next=null;
    }
}