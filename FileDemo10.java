import java.io.*;

class FileDemo10
{
	public static void main(String args[])
	{
		FileReader fin = null;
		FileWriter fout = null;

		try
		{
			fin = new FileReader("StringDemo1.java");

			BufferedReader br = new BufferedReader(fin);

			fout = new FileWriter("test.txt");

			PrintWriter pw = new PrintWriter(fout);

			String str;

			int linecnt=0;
			int totchars = 0;
			float avglength = 0;

			while((str=br.readLine())!=null)
			{
				pw.println(str);
				linecnt++;
				totchars = totchars + str.length();
			}

			avglength = (float) totchars / linecnt;

			System.out.println("\n Avg. Line Length : "+avglength);
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