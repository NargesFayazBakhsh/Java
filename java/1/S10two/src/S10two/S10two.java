package S10two;
import java.util.Scanner;
public class S10two {

	public static void main(String[] args) {

		/// decode of number 
		//// narges fayazbakhsh
		//// 9815091026
		
			Scanner input = new Scanner(System.in);	
			System.out.print("Enter number : ");
			int num = input.nextInt();
			int sum=0,i;	
			for(i=0;i<4;i++)
			{
				sum=sum/10;
				sum=(((num%10)+3)%10)*1000+sum;
				num=num/10;	
			}
			sum=((sum%100)*100)+(sum/100);
			System.out.printf("%d", sum);	
	
	}

}
