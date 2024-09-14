package S13;
import java.util.Scanner;
public class S13 {
	public static void main(String[] args) {
		/////// narges fayazbakhsh
		/////// 9815091026
			Scanner input = new Scanner(System.in);	
			System.out.print("Enter numbers : ");
			int n1 = input.nextInt();
			System.out.print("Enter numbers : ");
			int n2 = input.nextInt();
			int temp,i;
			if(n1>n2)
			{
				temp=n2;
				n2=n1;
				n1=temp;
			}
			   System.out.print("PrimeNumber:");
			   for (i=n1;i<=n2;i++)
			      IsPrime(i);	 
			   System.out.printf("%nPerfectNumbers:");
			   for (i=n1;i<=n2;i++)
			      IsPerfect(i);
			   System.out.printf("%nReversingDigits:");
			   Revers(n1);
			   Revers(n2);
			}

			public static void IsPrime(int x)
			{
				int j,sw=0;
				for (j=2;(j<=(x/2))&&(sw==0);j++)
				 if((x%j)==0)
					 sw=1;
				if(sw==0)
					System.out.printf("%d,", x);
			}
			
			public static void IsPerfect(int x)
			{ 
				int j,sum;
				sum=0;
				for (j=1;j<=(x/2);j++)
				 if((x%j)==0)
					 sum=j+sum;
				if(sum==x)
				{	
				System.out.printf("%n%d=1", x);
				for (j=2;j<=(x/2);j++)
					 if((x%j)==0)
						 System.out.printf("+%d", j);
				}
			}
			
			public static void  Revers(int x)
			{
				System.out.printf("%n%d = ", x);
				int j,sum;
				sum=0;
				while (x>0)
				{
				System.out.printf("%d", x%10);
				x=x/10;
				}
	       }
}
