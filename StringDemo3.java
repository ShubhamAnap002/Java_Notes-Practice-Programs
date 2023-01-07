import java.io.*;

class StringDemo3
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

		for(int i=0;i<sb.length();i++)
		{
			for(int j=i+1;j<sb.length();j++)
			{
				if(sb.charAt(i)>sb.charAt(j))
				{
					char temp = sb.charAt(i);
					sb.setCharAt(i,sb.charAt(j));
					sb.setCharAt(j,temp);
				}
			}
		}

		System.out.println("\n After sorting characters, String is : "+sb);
	}
}