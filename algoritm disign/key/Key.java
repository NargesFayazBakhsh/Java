import java.util.*;
public class Key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		String s1 = input.next();
		String s2 = "";
		s2 = s2 + s1.charAt(0);
		for(int i = 1 ; i < s1.length() ; i++ )
		{
			if (s1.charAt(i) != s1.charAt(i-1))
				s2 = s2 + s1.charAt(i);
		}
		System.out.printf("%s",s2);
	}

}
