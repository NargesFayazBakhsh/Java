package S10;
import java.util.Scanner;
public class S10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//tabdil adad be ramz

//narges fayazbakhsh
//9815091026

  Scanner input = new Scanner(System.in);	
  System.out.print("Enter number : ");
  int num = input.nextInt();
  int sum,i;	

  sum=0;
  for(i=0;i<4;i++)
  {
	sum=sum/10;
	sum=(((num%10)+7)%10)*1000+sum;
	num=num/10;	
  }
  sum=((sum%100)*100)+(sum/100);
  System.out.printf("%d %n", sum);	

  
		}

}
