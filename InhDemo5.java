abstract class A
{
	int ano;

	abstract void display();
}

class B extends A
{
	int bno;

	void display1()
	{
		System.out.println("B Display called");
		
	}
}

class InhDemo5
{
	public static void main(String args[])
	{
		B x = new B();
		x.display();
	}
}