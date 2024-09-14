package S6;
import java.util.Scanner;
public class S6 {
	public static void main(String[] args) {

		// BMI

		// narges fayazbakhsh
		//9815091026
		
	Scanner input = new Scanner(System.in);
	System.out.print("Enter weight in kilogram : ");
	float weight = input.nextFloat();
	System.out.print("Enter beigbt in Meters : ");
	float beigbt = input.nextFloat();				
	float BMI = weight/(beigbt*beigbt);				
	System.out.printf("%nBMI=%3.2f", BMI);
		
	}

}
