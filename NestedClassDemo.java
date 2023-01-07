class A
{
	int ano;

	B b = new B();

	void accept()
	{
		ano=100;
		b.setData();
	}

	void display()
	{
		System.out.println("A No : "+ano);
		b.getData();
	}

	class B
	{
		int bno;

		void setData()
		{
			bno=200;
		}

		void getData()
		{
			System.out.println("B No : "+bno);
		}
	}
}

class NestedClassDemo
{
	public static void main(String args[])
	{
		A a = new A();
		
		a.accept();
		a.display();
	}
}