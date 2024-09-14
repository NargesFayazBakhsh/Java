import java.util.*;

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
		int t,h,k,i,j;
		for(t = 0 ; t < x ; t++)
		{
			h=x-t;
			for(i = 0 ; i < x ; i++)
			array[i] = t+i+1;
		
		System.out.printf("{%d}\n",array[0]);
		for(k=0;k<x-1;k++)
		{
			r(array,h);
		for(j = 2 ; j<x-k ; j++)
			array[j-1] = array[j];
		h=h-1;
		}
		}
	}
	
}
