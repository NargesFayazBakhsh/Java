import java.util.Scanner;
public class SubSub {

	static int n ;
	static int first;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// narges fayazBakhsh
		// 9815091026
		
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		System.out.printf("{}\n");
		for(int i = 1 ; i <= n ; i++ )
		{
			first = 1;
			subsets("",i);
		}
	}

	public static void subsets(String s , int i)
	{
		// narges fayazBakhsh
		// 9815091026
		
		if(first==1)
		{
			s = s + i;
			System.out.printf("{%s}",s);
		}
		else
		{
			s = s + ", " + i;
			System.out.printf("{%s}",s);
		}
		first ++;
		System.out.printf("\n");
		for(int j = i ; j<= n-1 ; j++)
			subsets(s,j+1);
	}
}
