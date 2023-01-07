import java.io.*;

class InputDemo2
{
	DataInputStream in = new DataInputStream(System.in);

	String str;
	int no;
	float fno;

	void setData() throws Exception
	{
		System.out.print("Enter String : ");
		str = in.readLine();

		System.out.print("Enter Int. No : ");
		no = Integer.parseInt(in.readLine());

		System.out.print("Enter Float No : ");
		fno = Float.parseFloat(in.readLine());
	}

	void getData()
	{
		System.out.println("String is : "+str);
		System.out.println("Int. No is : "+no);
		System.out.println("Float No is : "+fno);
	}

	public static void main(String args[]) throws Exception
	{
		InputDemo2 in = new InputDemo2();

		in.setData();
		in.getData();
	}
}