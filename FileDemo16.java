import java.io.*;

class FileDemo15
{
	public static void main(String args[])
	{
		FileInputStream fin = null;
		FileOutputStream fout = null;

		try
		{
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);

			DataInputStream in = new DataInputStream(fin);
			PrintStream ps = new PrintStream(fout);

			String str;

			while((str=in.readLine())!=null)
			{
				ps.println(str);
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
				fout.close();
			}
			catch(Exception e)
			{
			}
		}
	}
}