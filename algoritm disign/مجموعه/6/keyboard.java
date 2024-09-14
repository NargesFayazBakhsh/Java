import java.util.Scanner;

public class keyboard {
	
	public static void r(int a[],int n)
	{
		for(int i=2;i<=n;i++)
		{
			System.out.printf("{");
			for(int j=0;j<i;j++)
			{
				System.out.print(a[j]);
				if(j!=i-1)
					System.out.print(", ");
			}
		System.out.printf("}\n");
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		int x = input.nextInt();
		int array [] = new int[x];

		System.out.printf("{}\n");
		
		for(int t = 0 ; t < x ; t++)
		{
			int h=x-t;
			for(int i = 0 ; i < x ; i++)
			array[i] = t+i+1;
		
		System.out.printf("{%d}\n",array[0]);
		
		for(int k=0;k<x-1;k++)
		{
			r(array,h);
		for(int i = 2 ; i<x-k ; i++)
			array[i-1] = array[i];
		h=h-1;
		}
		}
	}
	
}