import java.util.*;
public class PD {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		int x = input.nextInt();
		int masahat = input.nextInt();
		int a [] = new int[11];
		
		int i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
		
		int i,j, min, sum, hazineh;
		min=-1;
		for(i = 0 ; i < 11; i++)
			a[i] = 0;		
		
	
		for(i = 1 ; i <= x ; i++)
			a[i] = input.nextInt();
		for(i10 = 0 ; i10 <= a[10] ; i10++)
         for(i9 = 0 ; i9 <= a[9] ; i9++)	
		  for(i8 = 0 ; i8 <= a[8] ; i8++)
           for(i7 = 0 ; i7 <= a[7] ; i7++)
    		for(i6 = 0 ; i6 <= a[6] ; i6++)
    		 for(i5 = 0 ; i5 <= a[5] ; i5++)
			  for(i4 = 0 ; i4 <= a[4] ; i4++)
			   for(i3 = 0 ; i3 <= a[3] ; i3++)
				for(i2 = 0 ; i2 <= a[2] ; i2++)
				 for(i1 = 0 ; i1 <= a[1] ; i1++)
				 {sum=0;
				 sum=i10*i10+i9*i9+i8*i8+i7*i7+i6*i6+i5*i5;
				 sum=sum+i4*i4+i3*i3+i2*i2+i1*i1;
				 if (sum == masahat) 	 
				   {
				   hazineh=(i10-a[10])*(i10-a[10])+(i9-a[9])*(i9-a[9])+(i8-a[8])*(i8-a[8]);
				   hazineh=hazineh+(i7-a[7])*(i7-a[7])+(i6-a[6])*(i6-a[6])+(i5-a[5])*(i5-a[5]);
				   hazineh=hazineh+(i4-a[4])*(i4-a[4])+(i3-a[3])*(i3-a[3])+(i2-a[2])*(i2-a[2]);
				   hazineh=hazineh+(i1-a[1])*(i1-a[1]);
				   if ((min<0)||(hazineh<min))
				        min=hazineh;
				   } 
				 }
			System.out.printf("%d", min);
	}
}
