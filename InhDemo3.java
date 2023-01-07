import java.io.*;

class A
{
	protected int ano;

	DataInputStream in = new DataInputStream(System.in);

	void accept() throws IOException
	{
		System.out.print("Enter A no : ");
		ano = Integer.parseInt(in.readLine());
	}
}

class B extends A
{
	int bno;

	void setData() throws IOException
	{
		System.out.print("Enter B no : ");
		bno = Integer.parseInt(in.readLine());
	}
	
	void getData()
	{
		System.out.println("A No : "+ano);
		System.out.println("B No : "+bno);
	}
}

class C extends A
{
	int cno;

	void setData() throws IOException
	{
		System.out.print("Enter C no : ");
		cno = Integer.parseInt(in.readLine());
	}

	void getData()
	{
		System.out.println("A No : "+ano);
		System.out.println("C No : "+cno);
	}
}

class InhDemo3
{
	public static void main(String args[]) throws IOException
	{
		B x1 = new B();
		C x2 = new C();
	
		x1.accept();
		x1.setData();

		x2.accept();
		x2.setData();

		x1.getData();
		x2.getData();
	}
}