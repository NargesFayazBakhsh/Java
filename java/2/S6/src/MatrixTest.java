import java.util.Scanner;
import java.lang.Math;
public class MatrixTest {

	public static void main(String[] args) 
	{
		//  narges fayazbakhsh
		//  9815091026
		Scanner input = new Scanner(System.in);
		System.out.printf("enter m: ");
		int m = input.nextInt();
		System.out.print("enter n: ");
		int n = input.nextInt();
		Matrix a = null;
		a = new Matrix(m,n);
		
		int [] x = new int [n];
		System.out.print("enter new row: ");
		for(int i=0;i<n;i++)
			x[i] = input.nextInt();
		a.addRow(x);
	
		int [] y = new int [m+1];
		System.out.print("enter new col: ");
		for(int i=0;i<(m+1);i++)
			y[i] = input.nextInt();
		a.addCol(y);
		a.display();
		System.out.printf("enter m: ");
		int mm = input.nextInt();
		System.out.print("enter n: ");
		int nn = input.nextInt();
		System.out.print("enter elements: ");
		int [][] z = new int [mm][nn];
		for(int i=0;i<(mm);i++)
		{
			for(int j=0;j<nn;j++)
				z[i][j] = input.nextInt();
			System.out.println();
		}

		try
		 {
		  a.addMatrix(z,mm,nn);
		 }
		catch(IllegalArgumentException e)
		{
			System.out.printf("erorr: %s",e);
		}
	}
}
