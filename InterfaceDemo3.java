interface A
{
	void display();
}

class B
{
	protected int ano;

	void accept()
	{
		ano = 100;
	}
}

class InterfaceDemo3 extends B implements A
{
	int bno;

	void input()
	{
		bno = 200;
	}

	public void display()
	{
		System.out.println("A No : "+ano);
		System.out.println("B No : "+bno);
	}

	public static void main(String args[])
	{
		InterfaceDemo3 x = new InterfaceDemo3();

		x.accept();
		x.input();
		x.display();
	}
}