import java.io.*;

class FileDemo13
{
	public static void main(String args[])
	{
		FileInputStream fin = null;
		
		try
		{
			fin = new FileInputStream(args[0]);

			DataInputStream in = new DataInputStream(fin);

			int ch;

			while((ch=in.read())!=-1)
			{
				System.out.print((char)ch);
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