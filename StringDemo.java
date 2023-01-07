import java.io.DataInputStream;
import java.io.IOException;

class StringDemo
{
	String str, temp ;

	DataInputStream in = new DataInputStream(System.in);

	void setData() throws IOException
	{
		System.out.print("Enter String  :  ");
		str = in.readLine();	
	}

	void getData()
	{
		System.out.println("String is  :  "+str);

		temp = str.toUpperCase();
		System.out.println("Capital String is  :  "+temp);

		temp = str.toLowerCase();
		System.out.println("Small String is  :  "+temp);

		int len = str.length();
		System.out.println("String length is  :  "+len);

		temp = str.concat(" Computer");
		System.out.println("Concat String is  :  "+temp);

		temp = str.replace('e','*');
		System.out.println("Replace String is  :  "+temp);

		char ch = str.charAt(3);
		System.out.println("Character at 3rd position is  :  "+ch);

		int pos = str.indexOf('r');
		System.out.println("Index position of  r  is  :  "+pos);

		pos = str.indexOf('r', 4);
		System.out.println("Index position of  r  after 4th position is  :  "+pos);

		temp = str.substring(3);
		System.out.println("Sub String after 3rd position is  :  "+temp);

		temp = str.substring(3, 7);
		System.out.println("Sub String between 3rd to 7th position is  :  "+temp);

		boolean t = str.equals("Friends");
		System.out.println("Equality of strings is  :  "+t);

		t = str.equalsIgnoreCase("Friends");
		System.out.println("Equality of strings is  :  "+t);

		if(str.equalsIgnoreCase("Friends"))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}

		if(str.compareTo("Friends") == 0)
		{
			System.out.println("Strings are equal");
		}
		else if(str.compareTo("Friends") < 0)
		{
			System.out.println("First String is less");
		}
		else if(str.compareTo("Friends") > 0)
		{
			System.out.println("First String is greater");
		}
	}

	public static void main(String args[]) throws IOException
	{
		StringDemo s=new StringDemo();
		s.setData();
		s.getData();
	}
}
	