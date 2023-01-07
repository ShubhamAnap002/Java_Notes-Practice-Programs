interface A
{
	int ino=100;

	void display();
}

class B implements A
{
	public void display()
	{
		System.out.println("No is : "+ino);
	}
}

class InterfaceDemo1
{
	public static void main(String args[])
	{
		B x = new B();

		x.display();
	}
}