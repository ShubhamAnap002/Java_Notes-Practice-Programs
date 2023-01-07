/* Define a class MyNumber having one private int data member. Write a default constructor to
initialize it to 0 and another constructor to initialize it to a value (Use this). Write methods
isNegative, isPositive, isZero, isOdd, isEven. Create an object in main. Use command line
arguments to pass a value to the object (Hint : convert string argument to integer) and perform the
above tests. Provide javadoc comments for all constructors and methods and generate the html
help file. */

public class MyNumber
{
	private int no;

	// Default constructor and it is used to set 0
	public MyNumber()
	{
		this.no = 0;
	}

	// Param. constructor and it is used to set value sent by object
	public MyNumber(int no)
	{
		this.no = no;
	}

	// isNegative method is used to check whether a number is Negative or not
	public boolean isNegative()
	{
		if(no<0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	// isPositive method is used to check whether a number is Positive or not
	public boolean isPositive()
	{
		boolean ans = (no>=0) ? true : false;
		return ans;
	}

	public boolean isZero()
	{
		return  (no==0) ? true : false;
	}

	public boolean isEven()
	{
		return  (no%2==0);
	}

	public boolean isOdd()
	{
		return  (no%2!=0);
	}

	public static void main(String args[])
	{
		int no = Integer.parseInt(args[0]);

		MyNumber m = new MyNumber(no);

		boolean ans = m.isNegative();
		System.out.println(no+" is Negative? : "+ans);

		System.out.println(no+" is Positive? : "+m.isPositive());

		System.out.println(no+" is Zero? : "+m.isZero());

		System.out.println(no+" is Even? : "+m.isEven());

		System.out.println(no+" is Odd? : "+m.isOdd());
	}
}