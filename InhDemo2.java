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
	protected int bno;

	void setData() throws IOException
	{
		System.out.print("Enter B no : ");
		bno = Integer.parseInt(in.readLine());
	}
}

class C extends B
{
	int cno;

	void inputData() throws IOException
	{
		System.out.print("Enter C no : ");
		cno = Integer.parseInt(in.readLine());
	}

	void getData()
	{
		System.out.println("A No : "+ano);
		System.out.println("B No : "+bno);
		System.out.println("C No : "+cno);
	}
}

class InhDemo2
{
	public static void main(String args[]) throws IOException
	{
		C x = new C();
	
		x.accept();
		x.setData();
		x.inputData();

		x.getData();
	}
}