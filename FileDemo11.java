import java.io.*;

class FileDemo11
{
	public static void main(String args[])
	{
		FileReader fin = null;
		FileWriter fout = null;

		try
		{
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter File Name : ");
			String fname = br1.readLine();

			fin = new FileReader(fname);

			BufferedReader br = new BufferedReader(fin);

			fout = new FileWriter("test.txt");

			PrintWriter pw = new PrintWriter(fout);

			String str;

			int n=1;

			while((str=br.readLine())!=null)
			{
				if(n%2==0)
				{
					pw.println(str.toUpperCase());
				}
				else
				{
					pw.println(str.toLowerCase());
				}

				n++;
			}

			System.out.println("\n File copied successfuly");
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