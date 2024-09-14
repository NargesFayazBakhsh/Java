import java.util.*;
public class LinkedList { 
	// head of list
	Node head;  
	  
	// narges Fayaz Bakhsh
	// 9815091026
	
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
	  
	    //print LinkedList
	    public void printList() 
	    { 
	        Node n = head; 
	        while (n != null) { 
	            System.out.print(n.data + " "); 
	            n = n.next; 
	        } 
	    } 
	    
	    //  revers LinkedList
	    public void reversPrint(Node i) 
	    {     	
	    	if(i.next !=null)
	    	{
	    		reversPrint(i.next);
	    	}
	    	System.out.print(i.data+" ");
	    } 
	  
	    // main
	    public static void main(String[] args) 
	    { 
	        // make llist
	        LinkedList llist = new LinkedList(); 
	  
	        int k=101;
	        llist.head = new Node(k++);

	        Node i =llist.head;
	        Node  j = new Node(k++); 

	        //  put "j.next" to "i.next"
	        i.next = j; 
	        for(int m=0;m<20;m++)
	           {
	        	// put "j" to "i"
	        	i=j;
	        	j = new Node(k++); 
	        	// put "j" to "j"      
	        	i.next =j ;
	           }
	        System.out.print("\nlist1:\n");
	        llist.printList();
	        System.out.print("\nenter i & j for change:");
	        Scanner input1 = new Scanner(System.in);
	        
	        // put "input1.nextInt()" to "m"
	        int m = input1.nextInt(); 
	        
	        // put "input1.nextInt()" to "n"
	        int n = input1.nextInt();
	        
	        //  call llist.change & give llist & i & j & m & n
	        llist.change(llist,i,j,m,n);
	        System.out.print("\n Reverse Print:\n"); 
	        
	        //  call llist.reversPrint & give llist.head
	        llist.reversPrint(llist.head);
	        
	        // make llist2
	        k =201;
	        LinkedList llist2 = new LinkedList();
	        llist2.head = new Node(k++);
	        i =llist2.head;
	        j = new Node(k++); 

	        i.next = j; 
	        for(m=0;m<5;m++)
	           {
	            i=j;
	            j = new Node(k++); 
	            i.next =j ;
	           }
	        System.out.print("\n list 2:\n");
	        llist2.printList();//

	        int x = 4;
	        System.out.print("\n add list: ");
	        llist.addListToList(llist, llist2 , i ,j , x);
	    }
	    
	    //  change data i & j LinkedList
	    public void change(LinkedList llist,Node i , Node j , int m , int n) 
	    {
	        int k;
	        i = llist.head;
	        j=i;
	        
	        for(k = 1;k<m;k++)
	        	i = i.next; 
	        
	        for(k = 1;k<n;k++)
	        	j = j.next; 

	        int temp = i.data;
	        i.data = j.data;
	        j.data = temp; 
	        System.out.print("\n change list1:\n");
	        llist.printList();//
	    }

	    //  metod add list2 to list1
	    public void addListToList(LinkedList llist,LinkedList llist2,Node i , Node j , int x)
	    {
		    {
		        int k;
		        i = llist.head;
		        j = llist2.head;
		        
		        for(k = 1;k<x;k++)
		        	i = i.next; 
		        
		        for(k = 1;j.next!=null;k++)
		        	j = j.next; 

		        j.next = i.next;
		        i.next = llist2.head;
		        System.out.print("\n");
		        llist.printList();//
		    }
	    }
}