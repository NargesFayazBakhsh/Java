import java.util.*;
public class Test extends Stack{

	// narges Fayaz Bakhsh
	// 9815091026
	
	
	//     class main (first metod)
	public static void main(String[] args) {

		//     ask lenght of array you whant to sort
		System.out.print("what is the lenght of array?");
		
		Scanner scanner = new Scanner(System.in);
		//     give lenght of array with scanner 
		int lenght = scanner.nextInt();
		
		//     lenght can not be less than 1
		//     so give lenght again
		while (lenght<1)
		{
			System.out.print("lenght can not be less than one. "
					+ "please write vale lengh agane");
			//     give lenght again
			lenght = scanner.nextInt();
		}

		//     make new array that lenght be "lenght" & name is arry 
		int [] arry = new int[lenght];
		Scanner scanner1 = new Scanner(System.in);
		
		//     with scanner1 give element of arry
		for(int i = 0;i<lenght;i++)
		{
			System.out.printf("enter element%d=",i+1);
			arry[i] = scanner1.nextInt();
		}
		
		//     call sortArray & give arry & lenght
        sortArray(arry, lenght); 
        
        //     print onr word & print element of arry sort
        System.out.print("Sorted=");
        for (int i = 0; i < lenght; i++) 
            System.out.print(arry[i] + " "); 
		//     end of main
	}
	
    static void sortArray(int []arr, int lenght) 
    { 
 
    	//     make Stack that name is "input"
    	Stack input = new Stack();
    	//     give lenght of new Stack for give memory to  it
    	input.Create_Stack(lenght);

    	//     give element of array to input stack
    	for (int i = 0; i < lenght; i++) 
    		input.Push(arr[i]); 
    	
    	
        //      make Stack that name is "tmpStack"
    	Stack tmpStack = new Stack();
        //      give lenght of new Stack for give memory to  it
    	tmpStack.Create_Stack(lenght);
    	//      call sort & give "input" to it
    	//      put ansewer of sort in "tmpStack"
    	tmpStack = sort(input);

    	//      for each element peek tmpStack to arr[i] & Pop tmpStack
    	for (int i = 0; i < lenght; i++) 
    	{ 
    		arr[i] = tmpStack.Peek(); 
    		tmpStack.Pop(); 
    	} 
} 

    static Stack sort(Stack input) 
    { 
    	//      make Stack that name is "tmpStack"
        Stack tmpStack = new Stack(); 
 
        //      give lenght of new Stack for give memory to  it   
        //      lenght in this Stack equal to size of input
        tmpStack.Create_Stack(input.Size());
             
        //      this worked while input have element & not empty
        while (input.IsEmpty()==0) 
        { 
        	//    peek input to tmp
            int tmp = input.Peek();
            //    pop input
            input.Pop();

            //      this worked while (input have element & not empty) & (temp peek less than tmp)
            while (tmpStack.IsEmpty()==0 && tmpStack.Peek() < tmp) 
            { 
            	//      peek of tmpstack , give to input for push
                input.Push(tmpStack.Peek()); 
                //      pop tmpStack
                tmpStack.Pop(); 
            } 
            //       push tmpStack
            tmpStack.Push(tmp); 
        } 
      //  return tmpStack
        return tmpStack; 
    } 
}
