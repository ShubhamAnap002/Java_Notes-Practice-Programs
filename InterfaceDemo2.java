interface A
{
	void accept();
}

interface B
{
	void display();
}

class C implements A,B
{
	int no;

	public void accept()
	{
		no=100;
	}
		
	public void display()
	{
		System.out.println("No is : "+no);
	}
}

class InterfaceDemo2
{
	public static void main(String args[])
	{
		C x = new C();

		x.accept();
		x.display();
	}
}