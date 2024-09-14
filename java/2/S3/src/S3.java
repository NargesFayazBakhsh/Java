import java.util.Scanner;
import java.lang.Math;	
public class S3 {

  public static void main(String[] args) 
  {
	  Scanner input = new Scanner(System.in);
		System.out.print("enter n: ");
		int n = input.nextInt();
		int [][] a = new int [n][n];
		double p = 0.7;
		System.out.println(+p);
		double [] xx = new double [n*(n+1)/2];
		for(int i=0;i<(n*(n-1)/2);i++)
			xx [i]= Math.random();
		int t=0;
		for(int i=0 ; i<n ; i++)
		{
			for(int j=i+1;j<n;j++)
			{
				double x= xx[t];
				t++;
				if(p>x)
				{
					a[i][j]=0;
					a[j][i]=0;
				}
				else
				{
					a[i][j]=1;
					a[j][i]=1;
				}
			}
			a[i][i]=0;
		}		
		///////////////
		int sum=0 , max=0,min=n;
		for(int i=0 ; i<n ; i++)
		{
			t=0;
			for(int j=0;j<n;j++)
			{
				t=t+a[i][j];	
			}
			sum = sum + t;
			if(max<t)
				max = t;
			if(t<min)
				min = t;
		}
		float avg = (float)sum/n;
		
		for(int i=0;i<n; i++)
		{
			System.out.printf("%n");
			for(int j=0;j<n;j++)
				System.out.printf("%d ",a[i][j]);
		}
		
		float [][] b = new float [n][n];
			
		for (int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				b[i][j]=0;
				int sumand = 0,sumor=0;
				for(int k=0;k<n;k++)
					{
					sumand=sumand+(a[i][k]*a[j][k]);
					sumor=sumor+((a[i][k])|(a[j][k]));
					}
				if(sumor==0)
					sumor++;
				b[i][j] = (float)sumand/sumor;
				b[j][i] = b[i][j];
			}
			b[i][i]=1;
		}
		for(int i=0;i<n;i++)
		{
			System.out.printf("%n");
			for(int j=0;j<n;j++)
				System.out.printf("%f  ", b[i][j]);
		}

  }

}
