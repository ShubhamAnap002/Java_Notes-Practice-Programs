import java.io.*;

class FileDemo17
{
	public static void main(String args[])
	{
		FileOutputStream fout = null;

		try
		{
			fout = new FileOutputStream("even.dat");

			DataInputStream in = new DataInputStream(System.in);

			PrintStream ps = new PrintStream(fout);

			System.out.print("Enter No. of Integers : ")
			int n = Integer.parseInt(in.readLine());

			while(n>=1)			
			{
				System.out.print("Enter No. : ")
				int no = Integer.parseInt(in.readLine());

				if(no%2==0)
				{
					ps.println(no);
				}

				n--;
			}			
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