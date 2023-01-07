class OverloadingDemo
{
	void add(int n1,int n2)
	{
		System.out.println("Add is : "+(n1+n2));
	}

	void add(int n1,int n2,int n3)
	{
		System.out.println("Add is : "+(n1+n2+n3));
	}

	void add(float n1,float n2)
	{
		System.out.println("Add is : "+(n1+n2));
	}

	void add(double n1,double n2)
	{
		System.out.println("Add is : "+(n1+n2));
	}

	void add(int n1,double n2)
	{
		System.out.println("Add is : "+(n1+n2));
	}

	void add(double n1,int n2)
	{
		System.out.println("Add is : "+(n1+n2));
	}

	public static void main(String args[])
	{
		OverloadingDemo o = new OverloadingDemo();

		o.add(10,20);
		o.add(10.50,20.75);
	}
}