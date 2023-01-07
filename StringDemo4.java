import java.io.*;

class StringDemo4
{
	public static void main(String args[])
	{
		String str;
		int cnt=0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try
		{
			while(true)
			{
				System.out.println("Enter String : ");
				str = br.readLine();

				if(str.equalsIgnoreCase("good bye")==true)
				{
					break;
				}

				if(str.contains("India") == true || str.contains("Hello") == true)
				{
					cnt++;
				}
			}

			System.out.println(cnt);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}