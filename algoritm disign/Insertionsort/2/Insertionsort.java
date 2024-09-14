import java.util.Random;
public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				// narges fayazBakhsh
				// 9815091026
				
				
			int a1 [] = new int [50];
			int a2 [] = new int [100];
			int a3 [] = new int [150];
			int a4 [] = new int [200];
			int a5 [] = new int [250];
			int a6 [] = new int [300];
			int a7 [] = new int [350];
			int a8 [] = new int [400];
			int a9 [] = new int [450];
			int a10 [] = new int [500];
			int a11 [] = new int [550];
			int a12 [] = new int [600];
			int a13 [] = new int [650];
			int a14 [] = new int [700];
			int a15 [] = new int [750];
			int a16 [] = new int [800];
			int a17 [] = new int [850];
			int a18 [] = new int [900];
			int a19 [] = new int [950];
			int a20 [] = new int [1000];	
				
			rand(a1);
			rand(a2);
			rand(a3);
			rand(a4);
			rand(a5);
			rand(a6);
			rand(a7);
			rand(a8);
			rand(a9);
			rand(a10);
			rand(a11);
			rand(a12);
			rand(a13);
			rand(a14);
			rand(a15);
			rand(a16);
			rand(a17);
			rand(a18);
			rand(a19);
			rand(a20);
		}
			
		public static void rand (int [] arr)
		{
				// narges fayazBakhsh		 9815091026
			Random rand = new Random();
			for (int j = 0 ; j<arr.length ; j++)
				arr[j] = rand.nextInt(arr.length)+1;
			pri(arr);
			sor(arr);	
		}
		
		public static void pri (int [] arr)
		{
			System.out.printf("n=%d : {",arr.length);
			for(int i = 0 ; i<arr.length ; i++)
			{
				System.out.printf("%d",arr[i]);
				if( i != arr.length-1)
					System.out.print(",");
			}
			System.out.print("}\n");
				
		}

		public static void sor (int [] arr)
		{
				// narges fayazBakhsh       9815091026
			for ( int i = 1 ; i < arr.length ; ++i)
			{
				int key = arr[i];
				int j = i-1;
				while (j >=0 && arr[j] > key)
				{
					arr[j+1] = arr [j] ;
					j--;
				}
				arr[j+1] = key ;
			}

			
			System.out.printf("n=%d : {",arr.length);
			for(int i = 0 ; i<arr.length ; i++)
			{
				System.out.printf("%d",arr[i]);
				if( i != arr.length-1)
					System.out.print(",");
			}
			System.out.print("}\n\n");
		}
}