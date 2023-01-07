class A
{
	void display()
	{
		System.out.println("A's Display Called");
	}
}

class B extends A
{
	void display()
	{
		super.display();
		System.out.println("B's Display Called");
	}
}

class OverridingDemo
{
	public static void main(String args[])
	{
		B x = new B();

		x.display();
	}
}