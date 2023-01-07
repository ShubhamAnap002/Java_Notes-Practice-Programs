import java.io.*;

class StringBufferDemo1
{
	public static void main(String args[])
	{
		String str = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try
		{
			System.out.print("Enter String : ");
			str = br.readLine();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		StringBuffer sb = new StringBuffer(str);

		sb = sb.reverse();
		
		if(str.equalsIgnoreCase(sb.toString())==true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}