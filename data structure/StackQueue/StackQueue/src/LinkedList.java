import java.util.*;;

// narges Fayaz Bakhsh
// 9815091026

public class LinkedList {

	// head of list 
	   Node head; 

	// Node i & j 
	   Node i,j;
	   //  Node of LinkedList(have data , Node next)
	    static class Node { 
	        int data; 
	        Node next; 
	        Node(int d) 
	        { 
	            data = d; 
	            next = null; 
	        } 
	    } 
	    
	    //   print Queue
	    public void printList() 
	    { 
	    	if(head != null)
	    		System.out.print("\nQueue= ");
	        Node n = head; 
	        while (n != null) { 
	            System.out.print(n.data + " "); 
	            n = n.next; 
	        } 
	        if(head == null)
	        	System.out.print("\nQueue is empty");
	    } 
}