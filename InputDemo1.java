import java.io.*;

class InputDemo1
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str;
	int no;
	float fno;

	void setData() throws Exception
	{
		System.out.print("Enter String : ");
		str = br.readLine();

		System.out.print("Enter Int. No : ");
		no = Integer.parseInt(br.readLine());

		System.out.print("Enter Float No : ");
		fno = Float.parseFloat(br.readLine());
	}

	void getData()
	{
		System.out.println("String is : "+str);
		System.out.println("Int. No is : "+no);
		System.out.println("Float No is : "+fno);
	}

	public static void main(String args[]) throws Exception
	{
		InputDemo1 in = new InputDemo1();

		in.setData();
		in.getData();
	}
}