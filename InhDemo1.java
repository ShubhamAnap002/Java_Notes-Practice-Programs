class A
{
	protected int ano;

	protected void setA()
	{
		ano = 100;
	}
}

class B extends A
{
	int bno;

	void setB()
	{
		bno = 200;
	}

	void display()
	{
		System.out.println("A No : "+ano);
		System.out.println("B No : "+bno);
	}
}

class InhDemo1
{
	public static void main(String args[])
	{
		B x = new B();

		x.setA();
		x.setB();

		x.display();
	}
}