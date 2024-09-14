import java.util.*;
public class Iron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i , j , sum,price=-1,pri,max=0,i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
		
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		
		int [][] array = new int[100][11];
		int [] point = new int[11]; 
		
		for(i=0;i<=10;i++)
			array[0][i] = 0;
		

		for(i = 0;i<n;i++)
		{
			point[i+1] = input.nextInt();
			if(point[i+1]>max)
				max = point[i+1];
		}
		
		for(j=0 ; j<=max ; j++)
			array [j][0]=j*j;
		
		for(i = 1 ; i<=n ; i++)
		{
			array[0][i] = 0;
			for(j = point[i] ; j>0 ; j--)
				array[j][i] = (point[i]-j)*(point[i]-j);
		}
		
		int y =(int) Math.sqrt(m);
		for(i=1;i<=n; i++)
			if(y<point[i])
				point[i]=y;
		
		for(i10 = 0 ; i10 <= point[10] ; i10++)
	         for(i9 = 0 ; i9 <= point[9] ; i9++)	
			  for(i8 = 0 ; i8 <= point[8] ; i8++)
	           for(i7 = 0 ; i7 <= point[7] ; i7++)
	    		for(i6 = 0 ; i6 <= point[6] ; i6++)
	    		 for(i5 = 0 ; i5 <= point[5] ; i5++)
				  for(i4 = 0 ; i4 <= point[4] ; i4++)
				   for(i3 = 0 ; i3 <= point[3] ; i3++)
					for(i2 = 0 ; i2 <= point[2] ; i2++)
					 for(i1 = 0 ; i1 <= point[1] ; i1++)
					 {
						 sum = array[i1][0]+array[i2][0]+array[i3][0]+array[i4][0]+array[i5][0]+array[i6][0]+
								 array[i7][0]+array[i8][0]+array[i9][0]+array[i10][0];
						 if(m==sum)
						 {
//							 System.out.printf("%d %d %d %d %d %d %d %d %d %d\n",i1,i2,i3,i4,i5,i6,i7,i8,i9,i10);
							 pri = array[i1][1]+array[i2][2]+array[i3][3]+array[i4][4]+array[i5][5]+array[i6][6]+
									 array[i7][7]+array[i8][8]+array[i9][9]+array[i10][10];
//							 System.out.printf("pri=%d\n",pri);
							 if(price>pri||price==-1)
								 price=pri;
						 }
					 }
	
//		 System.out.printf("\nbestprice=%d\n",price);
		 System.out.printf("%d",price);
			
		

	}

}
