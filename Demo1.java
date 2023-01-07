import java.util.*;

class Demo1
{
	int no;
	float fno;
	String str;

	Scanner scr = new Scanner(System.in);

	void setData()
	{
		System.out.print("Enter Int No : ");
		no = scr.nextInt();

		System.out.print("Enter Float No : ");
		fno = scr.nextFloat();

		System.out.print("Enter String : ");
		str = scr.next();
	}

	void getData()
	{
		System.out.println("Int. No is : "+no);
		System.out.println("Float No is : "+fno);
		System.out.println("String is : "+str);
	}

	public static void main(String args[])
	{
		Demo1 d = new Demo1();

		d.setData();
		d.getData();
	}
}
