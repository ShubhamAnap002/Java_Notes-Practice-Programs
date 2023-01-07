import java.io.*;

class StringBufferDemo
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

		System.out.println("\n String is : "+str);
		
		StringBuffer sb = new StringBuffer(str);

		sb = sb.reverse();
		System.out.println("\n After reversing : "+sb);

		sb = sb.append(" Java");
		System.out.println("\n After appending Java : "+sb);

		sb.setCharAt(2,'@');
		System.out.println("\n After replacing 2nd char with @ : "+sb);

		sb = sb.insert(3,"WWW");
		System.out.println("\n After inserting WWW : "+sb);

		sb = sb.delete(2,3);
		System.out.println("\n After deleting  : "+sb);

		sb = sb.replace(2,4," *** ");
		System.out.println("\n After replacing 2 to 4 chars with *** : "+sb);

		sb.setLength(5);
		System.out.println("\n After set length to 5  : "+sb);
	}
}