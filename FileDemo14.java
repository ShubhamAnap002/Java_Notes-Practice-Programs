import java.io.*;

class FileDemo14
{
	public static void main(String args[])
	{
		FileReader fin = null;
		
		try
		{
			fin = new FileReader(args[0]);

			BufferedReader in = new BufferedReader(fin);

			String str;

			while((str=in.readLine())!=null)
			{
				System.out.print(str);
			}			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error : Invalid no. of agruments");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error : File not Found");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				fin.close();
			}
			catch(Exception e)
			{
			}
		}
	}
}