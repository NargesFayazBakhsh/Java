import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class S2 
{
  public static void main(String[] args)
  {
	    //     narges fayazbakhsh
		//     9815091026
	    Scanner input = new Scanner(System.in);
		System.out.print("enter n: ");
		int n = input.nextInt();
		int [] a = new int [n];
		for(int i=0;i<n;i++)
		{
		Random rand = new Random();
		int rand_int1 = rand.nextInt(10);
		a[i]=rand_int1;
		}
		int [] b = new int [10];
		for(int j=0;j<10;j++)
			b[j]=0;
		for(int j=0;j<n;j++)
			b[a[j]]++;

		System.out.println("entry :");
		for(int i=0;i<10;i++)
		  {
		    if(b[i]>1)
		    {
		      System.out.printf("%d : %d-->", (i),b[i]);
		    for(int j=0;j<n;j++)
		    {
		    	if(a[j]==i)
		    		System.out.printf(" %d", j);
		    }
		    System.out.println();
		    }
		  }	

		for(int i=0;i<n;i++)
		   System.out.printf("%d",a[i]);
		System.out.printf("%n");
		for(int i=0 ; i<n ; i++)
		{
			if(b[a[i]]!=0)
			{
				System.out.printf("%d",a[i]);
				b[a[i]]=0;
			}
		}		
		
  }
}