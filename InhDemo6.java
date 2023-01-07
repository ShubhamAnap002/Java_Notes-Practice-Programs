abstract class A
{
	public abstract void display();
}

class B extends A
{
	public void display()
	{
		System.out.println("Display Called");
	}
}

class InhDemo6
{
	public static void main(String args[])
	{
		B x = new B();

		x.display();
	}
}