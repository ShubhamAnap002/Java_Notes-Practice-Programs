class ConstructorDemo
{
	int no;

	ConstructorDemo()
	{
		no=0;
		System.out.println("Default Constructor Called");
	}

	ConstructorDemo(int no)
	{
		this();
		this.no=no;
		System.out.println("Param. Constructor Called");
	}

	void display()
	{
		System.out.println("No is : "+no);
	}

	public static void main(String args[])
	{
		ConstructorDemo c1 = new ConstructorDemo(100);
		ConstructorDemo c2 = new ConstructorDemo(200);

		c1.display();
		c2.display();
	}
}