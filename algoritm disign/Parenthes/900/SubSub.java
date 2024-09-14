import java.util.Scanner;
public class SubSub {

	static int n ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// narges fayazBakhsh
		// 9815091026
		
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		System.out.printf("{}\n");
		for(int i = 0 ; i <= n-1 ; i++ )
			subsets("",1,i+1);
	}

	public static void subsets(String s , int p , int i)
	{
		// narges fayazBakhsh
		// 9815091026
		
		if(p==1)
		{
			s = s + i;
			System.out.printf("{%s}",s);
		}
		else
		{
			s = s + ", " + i;
			System.out.printf("{%s}",s);
		}
		System.out.printf("\n");
		for(int j = i ; j<= n-1 ; j++)
			subsets(s,2,j+1);
	}
}
