import java.util.Scanner;
public class Parenthes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//   narges FayazBakhsh   9815091026
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int [] a = {0,1,2,5,14,42,132,429,1430,4862,16796,58786};
		System.out.printf("%d",a[n]);
		p("(",n,1,0);
	}
	
	public static void p (String s ,int number , int open , int close)
	{
		int sw ;
		//   narges FayazBakhsh   9815091026
		if (open < number)			
			p(s+"(",number,open+1,close);		
		if (close < open)
			if (open==number)
			{
				for(int i = s.length() ; i < 2*number ; i++)
					s = s +")";				
				System.out.printf("\n%s",s);
			}
			else
			p(s+")",number,open,close+1);
	
		
	}
}
