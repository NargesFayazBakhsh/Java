import java.util.Scanner;
import java.lang.Math;
public class MyArrayTest 
{

		public static void main(String[] args)
		{
			////////       narges fayazbakhsh
			////////       9815091026
			
	        Scanner input = new Scanner(System.in);
	        
			System.out.print("enter n: ");
			int n = input.nextInt();
			MyArray a = new MyArray(n);
			
			System.out.printf("%nenter n: ");
			int nn = input.nextInt();
			System.out.print("enter m: ");
			int m = input.nextInt();
			MyArray b = new MyArray(nn,m);
			
			System.out.printf("%nenter n: ");
			int nnn = input.nextInt();
			System.out.printf("enter k: ");
			int k = input.nextInt();
			int [] vals = new int [k];
			for(int j=0;j<k;j++)
				vals[j] = input.nextInt();
			MyArray c = null;
			if(k<=(nnn))
			{
			   c = new MyArray(nnn,k,vals);
			}
			else
				System.out.print("'k' can not be more than 'n'");
			System.out.printf("%nenter x add: ");
			int x = input.nextInt();
		    c.add(x);
		    
			System.out.printf("%nenter y index for delet: ");
			int y = input.nextInt();
		    c.del(y);
		    
		    System.out.printf("%nmax: %d%n", c.max());
		    
		    c.sort();
		}
}
