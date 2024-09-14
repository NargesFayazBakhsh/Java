import java.io.*; 
import java.util.*; 

// narges Fayaz Bakhsh
// 9815091026

public class Stack {


	int [] stack ,tempStack;
    int MaxNumber;
    int top ; 
    

	//   creat stack
	public void Create_Stack(int Number)
	{
		MaxNumber = Number+1;
		stack = new int [MaxNumber];
		top = -1;
	}

	//   push x to stack
	public void Push(int x)
	{
		if (Isfull()==1)
			System.out.print("\n Stack is full");
		else
		{
			top++;
		    stack[top] = x;
		}
	}

	//   pop stack
	public int Pop()
	{
		if(IsEmpty()==0)
		{
			int temp = stack[top];
			top--;
			return temp;
		}
		else
		{
			System.out.print("stack is empty");
			return -1;
		}	
	}
	
	//     return number of element stack
	public int Size()
	{
		return top+1;
	}
	
	//     test stack is empty
	public int IsEmpty()
	{
		if(top == -1)
			return 1;
		else
			return 0;
	}
	
	//     test stack is full
	public int Isfull()
	{
		if((top+1) == MaxNumber)
			return 1;
		else
			return 0;
	}
	
	//     peek stack
	public int Peek() {
	   
		if(IsEmpty()==0)
		   return stack[top];
		else
		{
			System.out.print("stack is empty");
			return -1;
		}
	}
	
	//  print stack
	public void print()
	{
		System.out.printf("top=%d",top);
		System.out.print("\n stack=");
		
		for(int i =0;i<top+1;i++)
		{
			System.out.printf("%d ",stack[i]);
		}	
	}
}