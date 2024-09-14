package S11;
import java.util.Scanner;
public class S11 {

	public static void main(String[] args) {
		///////////////////     narges fayazbakhsh
  
		//////////////////      9815091026
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight : ");
		float W = input.nextFloat();
		System.out.print("Enter beigbt : ");
		float H = input.nextFloat();

		int i,C1=0,C2=0,C3=0,C4=0;
		for (i=0;i<10;i++)
		{
			System.out.printf("%n%d%nEnter weight : ",i+1);
			float weight = input.nextFloat();
			System.out.print("Enter beigbt : ");
			float beigbt = input.nextFloat();
			if(weight<W)
			{
				if(beigbt<H)			
				    C1++;
				else
					C2++;
			}
			else 
			{	
				if(beigbt<H)
				    C3++;
				else
					C4++;
			}					
		}
						
		System.out.printf("%nC1: ");
		for(i=C1;i>0;i--)
			System.out.printf("*");
				
		System.out.printf("%nC2: ");
		for(i=C2;i>0;i--)
			System.out.printf("*");

		System.out.printf("%nC3: ");
		for(i=C3;i>0;i--)
			System.out.printf("*");

		System.out.printf("%nC4: ");
		for(i=C4;i>0;i--)
			System.out.printf("*");
	
	}

}
