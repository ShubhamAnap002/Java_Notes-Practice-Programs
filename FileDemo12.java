import java.io.*;

class FileDemo12
{
	public static void main(String args[])
	{
		FileInputStream fin = null;
		FileOutputStream fout = null;

		try
		{
			fin = new FileInputStream(args[0]);

			DataInputStream in = new DataInputStream(fin);

			fout = new FileOutputStream(args[1]);

			PrintStream out = new PrintStream(fout);

			String str;

			int n=1;

			while((str=in.readLine())!=null)
			{
				if(n%2==0)
				{
					StringBuffer sb = new StringBuffer(str);
					sb.reverse();
					str = sb.toString();

				}
				
				out.println(str);

				n++;
			}

			System.out.println("\n File copied successfuly");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error : Enter File Name of Command Line");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error : File not found");
		}

		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

	}
}