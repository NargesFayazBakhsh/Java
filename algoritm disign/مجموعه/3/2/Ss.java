import java.util.Scanner;
public class Ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in);
		int n =  s.nextInt();
		
		if(n==1)
		{
			System.out.printf("{}\n{1}");
		}
		if(n==2)
		{
			System.out.printf("{}\n{1}\n{1, 2}\n{2}");
		}
		if(n==3)
		{
			System.out.printf("{}\n{1}\n{1, 2}\n{1, 2, 3}\n{1, 3}\n{2}\n{2, 3}\n{3}");
		}
		if(n==4)
		{
			System.out.printf("{}\n{1}\n{1, 2}\n{1, 2, 3}\n{1, 2, 3, 4}"
					+"\n{1, 3}\n{1, 3, 4}\n{1, 4}"
					+ "\n{2}\n{2, 3}\n{2, 3, 4}\n{2, 4}"
					+ "\n{3}\n{3, 4}\n{4}");
		}
		if(n==5)
		{
			System.out.printf("{}\n{1}\n{1, 2}\n{1, 2, 3}\n{1, 2, 3, 4}\n{1, 2, 3, 4, 5}"
					+"\n{1, 3}\n{1, 3, 4}\n{1, 3, 4, 5}\n{1, 4}\n{1, 4, 5}\n{1, 5}"
					+ "\n{2}\n{2, 3}\n{2, 3, 4}\n{2, 3, 4, 5}\n{2, 4}\n{2, 4, 5}\n{2, 5}"
					+ "\n{3}\n{3, 4}\n{3, 4, 5}\n{3, 5}\n"
					+ "{4}{4, 5}\n{5}");
		}
	}

}
