import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.*;

// narges Fayaz Bakhsh
// 9815091026

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//   make stack
		Stack stack = new Stack();
		stack.Create_Stack(10);

		//   make LinkedList
	    LinkedList list1 = new LinkedList();

	    //   lope forever
	    while(1>0)
	    {
	    	//     ask what act want to do?
	    	System.out.printf("what act you want do?(please enter number)\n1)Insert 2)Pop 3)Srvice\n");
	    	Scanner input1 = new Scanner(System.in);
	    	//     give chosse number
	    	int sw = input1.nextInt();
	    	//     if number be 1 . call insert
	    	if(sw==1)
	    		insert(stack,list1);
            //	      if number be 2 . call pop
	    	if(sw==2)
	    		pop(stack,list1);
            //	      if number be 3 . call service
	    	if (sw==3)
	    		service(stack,list1);
	    	System.out.print("\n\n");
	    }
	}
	
	public static void insert(Stack stack,LinkedList list1)
	{
		//      make new random int less than 100
		Random rand = new Random();
		int rand_int1 = rand.nextInt(100);
		//      push random int to stack
		stack.Push(rand_int1);
		//      print stack & Queue
		stack.print();
		list1.printList();
	}
	public static void pop(Stack stack,LinkedList list1)
	{
		//      if stack be not empty 
		if(stack.top!=-1)
		{
			//       pop stack to tmp
			int tmp = stack.Pop();
			//       print tmp
			System.out.printf("tmp=%d \n",tmp);
			//       put Node(tmp) to i
			list1.i = new LinkedList.Node(tmp);
			//       if head of list1 be null do this
			if(list1.head == null)
			  {
				//        put "i" to "head"
				list1.head = list1.i;
				//		  put "j" to "i"
				list1.j = list1.i;
			  }
			else
			  {
				//		  put "j.next" to "i"
				list1.j.next = list1.i;
				//		  put "j" to "i"
				list1.j = list1.i;
			  }
		}

		//      stack is empty & cant add element to Queue
		else
			System.out.print("\nStack is empty so can not add element to Queue!!\n");

		//      print stack & Queue
		stack.print();
		list1.printList();
	}

	public static void service(Stack stack,LinkedList list1)
	{
		//      if head of list1 have element do this
		if(list1.head != null)
		{
			//     push data of head of list1 to stack
			stack.Push(list1.head.data);
			//     put head.next of list1 to head of list1
			list1.head = list1.head.next;
		}
		
		//      Queue is empty & cant add element to stack
		else
			System.out.print("\nQueue is empty so can not add element to stack!!\n");
		
		//      print stack & Queue
		stack.print();
        list1.printList();
	}
	
}