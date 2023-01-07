final class A
{
	final void display()
	{
		System.out.println("A's Display Called");
	}
}

class B extends A   // will generate error because A class is final
{
	void display()   // will generate error because display method in A class is final
	{
		System.out.println("B's Display Called");
	}
}

class FinalMethodDemo
{
	public static void main(String args[])
	{
		B x = new B();

		x.display();
	}
}