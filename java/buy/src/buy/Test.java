package buy;
//  narges fayazBakhsh
//  9815091026
import java.security.SecureRandom;
public class Test {

	public static void main(String[]arges)
	{
		Product[] Products = new Product[10];
		int i;
		SecureRandom randomNumbers = new SecureRandom();
		int aa = randomNumbers.nextInt(20);
		int bb = randomNumbers.nextInt(20);
		int ccs = randomNumbers.nextInt(20);
		int ccm = randomNumbers.nextInt(20);
		int ccl = randomNumbers.nextInt(20);
		System.out.printf("quantity mobile=: %d \nquantity book: %d \nquantity cloth small: %d   quantity cloth medium: %d   quantity cloth larg: %d\n",aa,bb,ccs,ccm,ccl);
		System.out.print("\n-------------------------");
		for(i=0;i<10;i++)
		{

	      int a = randomNumbers.nextInt(3) +1;
	      System.out.printf("\nFaktor_number %d:",i+1);
		  switch(a)
		  {
		    case 1:
		    {
				int a1 = randomNumbers.nextInt(10000000);
				int a2 = randomNumbers.nextInt(10000);
				int a3 = randomNumbers.nextInt(10)+1;
			     if(a3<=aa)
		    	  {
					Products[i]= new mobile(a1,a2,1,aa,"abcd");
		    	    Products[i].showFactor(a3);
		        	Products[i].print();
		        	aa=aa-a3;
		    	  }
			     else
			     {
			    	System.out.printf("\nthe quantity mobile lese than you order(you want:%d > we have:%d)",a3,aa);
			        System.out.print("\n-------------------------");
			     }
		    	break;
		    }
		    case 2:
	    	{
				int b1 = randomNumbers.nextInt(10000000);
				int b2 = randomNumbers.nextInt(10000);
				int b3 = randomNumbers.nextInt(500);
				int b4 = randomNumbers.nextInt(10)+1;
				 if(b4<=bb)
				 {
	    		   Products[i] = new book(b1,b2,2,bb,"book",b3);
	    	       Products[i].showFactor(b4);
	    		   Products[i].print();
	    		   bb=bb-b4;
				 }
			     else
			     {
			    	System.out.printf("\nthe quantity book lese than you order(you want:%d > we have:%d)",b4,bb);
			        System.out.print("\n-------------------------");
			     }
	    		break;
		    }
		
			case 3:
			{
				int c1 = randomNumbers.nextInt(10000000);
				int c2 = randomNumbers.nextInt(10000);
				int c3 = randomNumbers.nextInt(10)+1;
				char c4=0;
				int k = randomNumbers.nextInt(3)+1;
				if(k==1)
				 {
					c4='s';
				    if(c3<=ccs)
				     {
					  Products[i] = new cloth(c1,c2,3,ccs,c4);
					  Products[i].showFactor(c3);
					  Products[i].print();
					  ccs=ccs-c3;
				     }
				     else
				     {
				    	System.out.printf("\nthe quantity cloth 's' lese than you order(you want:%d > we have:%d)",c3,ccs);
				        System.out.print("\n-------------------------");
				     }
				 }
				if(k==2)
				 {
					c4='m';
				    if(c3<=ccm)
				     {
					  Products[i] = new cloth(c1,c2,3,ccm,c4);
					  Products[i].showFactor(c3);
					  Products[i].print();
					  ccm=ccm-c3;
				     }
				     else
				     {
				    	System.out.printf("\nthe quantity cloth 'm' lese than you order(you want:%d > we have:%d)",c3,ccm);
				        System.out.print("\n-------------------------");
				     }
				 }
				if(k==3)
			     {
					c4='l';
				    if(c3<=ccl)
				     {
					  Products[i] = new cloth(c1,c2,3,ccl,c4);
					  Products[i].showFactor(c3);
					  Products[i].print();
					  ccl=ccl-c3;
				     }
				     else
				     {
				    	System.out.printf("\nthe quantity cloth 'l' lese than you order(you want:%d > we have:%d)",c3,ccl);
				        System.out.print("\n-------------------------");
				     }
				 }
				break;
			}
		  }
		}
	}
}
