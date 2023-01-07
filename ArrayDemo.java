import java.util.*;

class ArrayDemo
{
	public static void main(String []args)
	{
		Scanner scr = new Scanner(System.in);

		int arr[];
		int i,n;
		
		System.out.print("Enter Array Size : ");
		n = scr.nextInt();

		arr = new int[n];

		System.out.print("Enter "+n+" Elements : ");
		for(i=0;i<n;i++)
		{
			arr[i] = scr.nextInt();
		}

		System.out.println("Elements are : ");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}