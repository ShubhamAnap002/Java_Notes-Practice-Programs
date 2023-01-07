import java.util.*;

class ArrayDemo2
{
	Scanner scr = new Scanner(System.in);

	int mat[][],i,j,m,n;

	void setData()
	{	
		System.out.print("Enter Row Size : ");
		m = scr.nextInt();

		System.out.print("Enter Col Size : ");
		n = scr.nextInt();

		mat = new int[m][n];

		System.out.print("Enter "+m+"x"+n+" Elements : ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				mat[i][j] = scr.nextInt();
			}
		}
	}

	void getData()
	{
		System.out.println("Elements are : ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("\t"+mat[i][j]);
			}
			System.out.print("\n");
		}
	}

	public static void main(String []args)
	{
		ArrayDemo2 x = new ArrayDemo2();

		x.setData();
		x.getData();
	}
}