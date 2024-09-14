package sub;
import java.util.Scanner;
public class sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "{1, 2, 3, 4, 5, 6, 7, 8, 9}";
       String s1 = "{1, 2, 3, 4, 5, 6, 7, 8, 9}";
       
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		s1=s;
		System.out.printf("{}\n");
	for(int k = n; k>0; k--)	
		
	{	
		System.out.print(s1.substring(0,2)+"}"+"\n");
		for(int j = 1; j< k ; j++)
		{	
		   for(int i = 1; i < (k-j+1) ; i++)
		   {
			
		
				System.out.print(s1.substring(0,3*i+2)+"}");

	            System.out.printf("\n");
		    }
		   s1= s1.substring(0,2)+ s1.substring(5);
		}		
	s="{"+s.substring(4);
	s1=s;

	}
	}

}
