import java.io.*;

class FileDemo15
{
	public static void main(String args[])
	{
		FileReader fin = null;
		FileWriter fout = null;

		try
		{
			fin = new FileReader(args[0]);
			fout = new FileWriter(args[1]);

			BufferedReader in = new BufferedReader(fin);
			PrintWriter pw = new PrintWriter(fout);

			String str;

			while((str=in.readLine())!=null)
			{
				pw.println(str);
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