import java.util.*;
public class CompliteNum {

	public static int [] point = new int [12];
	public static  int n,price,minprice;
	public static int [] a = new int[11];
	 
	public static void main(String[] args) {

// narges fayazBakhsh    9815091026
		int i,j,m,k,tmp;
		
		Scanner input = new Scanner(System.in);
		n = input.nextInt();  // n<11
		m = input.nextInt();
		k = 0;

		minprice=-1;

		for(i=1;i<=n;i++)
			a[i]=input.nextInt();
		for(i=1;i<n;i++)
			for(j=i;j<=n;j++)
				if(a[i]<a[j])
				{
					tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
//		System.out.printf("*****\n");
//		for(i=1;i<=n;i++)
//			System.out.printf("%d ",a[i]);
//		System.out.printf("*****\n");
		point[0]=(int) Math.sqrt(m);
		make(k,m);
		
		//
//		System.out.printf("minprice=%d",minprice);
		System.out.printf("%d",minprice);
	}
	
	
	
	
	
	
	public static void make(int k,int x)
	{
// narges fayazBakhsh    9815091026
		if(k<(n+1)) {
		if(x==0)
			{if (k==n)
		{   price=0;
			for(int i=1 ; i<=k ; i++)
			{
				
			price=price+ (point[i]-a[i])* (point[i]-a[i]);
//				System.out.printf("%d,", point[i]);
			}
//			System.out.printf("price=%d,minprice=%d", price,minprice);
			if (minprice==-1||minprice>price)
					minprice=price;
			
//		System.out.printf("\n");
		}}
		else 
		{
			for(int m=(int ) Math.sqrt(x);m>=1;m--)
            if (point[k]>=m)			
			{
				point[k+1]=m;
				make(k+1,x-m*m);
			}
		}
		}	
	}
}