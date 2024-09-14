import java.util.Random;	
public class Matrix 
{
	private int [][] items ;
	private int lenghtx,lenghty;
	public Matrix (int m,int n)
	{
		//  narges fayazbakhsh
		//  9815091026
		items = new int [m][n];
		lenghtx = m;
		lenghty = n;
		Random rand = new Random();
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				items[i][j]=rand.nextInt(10);
		System.out.printf("lenghtx=%d\tlenghty=%d%n",lenghtx,lenghty);
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.printf("%3d ", items[i][j]);
			System.out.println();
		}	
	}
	public void addRow(int ... a)
	{
		int newitems[][] = new int[lenghtx+1][lenghty];
		for(int i=0;i<(lenghtx);i++)
			for(int j=0;j<lenghty;j++)
				newitems[i][j]=items[i][j];			
        for(int k=0;k<lenghty;k++)
        	newitems[lenghtx][k]=a[k];
    	items = newitems;
		lenghtx ++;
		System.out.printf("lenghtx=%d\tlenghty=%d%n",lenghtx,lenghty);
		for(int i=0;i<(lenghtx);i++)
		{
			for(int j=0;j<lenghty;j++)
				System.out.printf("%3d ", items[i][j]);
			System.out.println();
		}
	}
	public void addCol(int ... b)
	{
		int newitems[][] = new int[lenghtx][lenghty+1];
		for(int i=0;i<(lenghtx);i++)
			for(int j=0;j<lenghty;j++)
				newitems[i][j]=items[i][j];	
		System.out.print("**");
        for(int k=0;k<lenghtx;k++)
        	newitems[k][lenghty]=b[k];//****
    	items = newitems;
		lenghty ++;
		System.out.printf("lenghtx=%d\tlenghty=%d%n",lenghtx,lenghty);
		for(int i=0;i<(lenghtx);i++)
		{
			for(int j=0;j<lenghty;j++)
				System.out.printf("%3d ", items[i][j]);
			System.out.println();
		}
	}
	public void display()
	{
		System.out.printf("lenghtx=%d\tlenghty=%d%n",lenghtx,lenghty);
		for(int i=0;i<(lenghtx);i++)
		{
			for(int j=0;j<lenghty;j++)
				System.out.printf("%3d ", items[i][j]);
			System.out.println();
		}
	}

	public void addMatrix(int [][] z,int mm,int nn)
	{
		if(mm != lenghtx || nn != lenghty)
		{
			throw new IllegalArgumentException("z not correct lenght");
		}
		for(int i=0;i<lenghtx;i++)
			for(int j=0;j<lenghty;j++)
				items[i][j]=items[i][j]+z[i][j];
		System.out.printf("lenghtx=%d\tlenghty=%d%n",lenghtx,lenghty);
		for(int i=0;i<(lenghtx);i++)
		{
			for(int j=0;j<lenghty;j++)
				System.out.printf("%3d ", items[i][j]);
			System.out.println();
		}
	}
	
}
