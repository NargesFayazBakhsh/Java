
public class MyArray 
{
	
	////////       narges fayazbakhsh
	////////       9815091026
	
		private int [] items ;
		private int lenght ;
		public MyArray (int n)
		{
			items = new int [n];
			lenght = n;
			for (int i=0;i<n;i++)
				items[i]=0;
	        System.out.printf("lenght = %d%n", lenght);
			for(int i=0;i<n;i++)
				System.out.printf("%d",items[i]);
		}

		public MyArray(int n,int m)
		{
			items = new int [n];
			lenght = n;
			for (int i=0;i<n;i++)
				items[i]=m;
	        System.out.printf("lenght = %d%n", lenght);
			for(int i=0;i<n;i++)
				System.out.printf("%d",items[i]);
		}

		public MyArray(int n,int k,int...vals)
		{
			items = new int [n];
			lenght = n;
			int i=0;
			for(int val: vals)
				items[i++] = val;
			System.out.printf("lenght = %d%n", lenght);
			for(int j=0;j<k;j++)
				System.out.printf("%d",items[j]);
		}

		public void add(int x)
		{
			int newitems[] = new int[lenght+1];
			System.arraycopy(items, 0, newitems, 0, lenght);
			newitems[lenght]=x;
			lenght = lenght + 1;
			items = new int [lenght];
			items = newitems;
			System.out.printf("lenght = %d%n", lenght);
			for(int i=0;i<lenght;i++)
				System.out.printf("%d",items[i]);
		}
		
		public void del(int y)
		{
			int newitems[] = new int[lenght-1];
			System.arraycopy(items, 0, newitems, 0, y);
			System.arraycopy(items, y+1, newitems, y, lenght-y-1);
			lenght = lenght - 1;
			items = new int [lenght];
			items = newitems;
			System.out.printf("lenght = %d%n", lenght);
			for(int i=0;i<lenght;i++)
				System.out.printf("%d",items[i]);
		}
		
		public int max()
		{
			int x = items[0];
			for(int i=0;i<lenght;i++)
				if(items[i]>x)
					x=items[i];
			return x;
		}
		
		public void sort()
		{
			for(int i=0;i<lenght;i++)
			{
				for(int j=i+1;j<lenght;j++)
					if(items[i]>items[j])
					{
						int temp;
						temp=items[j];
						items[j]=items[i];
						items[i]=temp;
					}		
			}
			for(int i=0;i<lenght;i++)
				System.out.printf("%d",items[i]);
		}
		
		public int getlenght()
		{
			return lenght;
		}
		public int[] getitems()
		{
			return items;
		}
	}