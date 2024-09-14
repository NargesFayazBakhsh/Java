import java.util.Scanner;
import java.lang.Math;	
public class S1 {

public static void main(String[] args) {
     /////////////       narges fayazbakhsh
   	 /////////////       9815091026	

Scanner input = new Scanner(System.in);
System.out.print("enter n: ");
int n = input.nextInt();
double p;
for(int k=1;k<10;k++)
  {
	p=(double)k/10;
   f(n,p);
  }				
}
public static void f (int n,double p)
{
	int [][] a = new int [n][n];
	System.out.println("p: "+p);
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
	System.out.printf("%nmax=%d min=%d sum=%d avg=%f%n%n",max,min,sum,avg);
  }
}