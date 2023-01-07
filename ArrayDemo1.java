import java.util.*;

class ArrayDemo1
{
	Scanner scr = new Scanner(System.in);

	int arr[],i,n;

	void setData()
	{	
		System.out.print("Enter Array Size : ");
		n = scr.nextInt();

		arr = new int[n];

		System.out.print("Enter "+n+" Elements : ");
		for(i=0;i<n;i++)
		{
			arr[i] = scr.nextInt();
		}
	}

	void getData()
	{
		System.out.println("Elements are : ");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String []args)
	{
		ArrayDemo1 x = new ArrayDemo1();

		x.setData();
		x.getData();
	}
}