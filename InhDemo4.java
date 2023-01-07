class A
{
	int ano;

	A()
	{
		System.out.println("A Default Constructor called");
	}

	A(int ano)
	{
		this.ano = ano;
		System.out.println("A Param. Constructor called");
	}
}

class B extends A
{
	int bno;

	B()
	{
		System.out.println("B Default Constructor called");
	}

	B(int ano, int bno)
	{
		super(ano);
		this.bno = bno;
		System.out.println("B Param. Constructor called");
	}

}

class C extends B
{
	int cno;

	C()
	{
		System.out.println("C Default Constructor called");
	}

	C(int ano, int bno, int cno)
	{
		super(ano,bno);
		this.cno = cno;
		System.out.println("C Param. Constructor called");
	}
}

class InhDemo4
{
	public static void main(String args[])
	{
		C x = new C(100,200,300);

	}
}