import java.util.*;

class ArrayDemo3
{
	Scanner scr = new Scanner(System.in);

	int mat[][],i,j,m,n;

	void setData()
	{	
		System.out.print("Enter Row Size : ");
		m = scr.nextInt();

		mat = new int[m][];

		for(i=0;i<m;i++)
		{
			System.out.print("Enter "+i+" Row's "+" Col Size : ");
			n = scr.nextInt();

			mat[i] = new int[n];
		}

		for(i=0;i<mat.length;i++)
		{
			System.out.println("Enter "+i+" Row's "+mat[i].length+" Elements : ");
			for(j=0;j<mat[i].length;j++)
			{
				mat[i][j] = scr.nextInt();
			}
		}
	}

	void getData()
	{
		System.out.println("Elements are : ");
		for(i=0;i<mat.length;i++)
		{
			for(j=0;j<mat[i].length;j++)
			{
				System.out.print("\t"+mat[i][j]);
			}
			System.out.print("\n");
		}
	}

	public static void main(String []args)
	{
		ArrayDemo3 x = new ArrayDemo3();

		x.setData();
		x.getData();
	}
}