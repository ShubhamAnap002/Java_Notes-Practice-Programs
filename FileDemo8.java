import java.io.*;

class FileDemo8
{
	public static void main(String args[]) throws Exception
	{
		FileReader fin = new FileReader("StringDemo1.java");

		BufferedReader br = new BufferedReader(fin);

		FileWriter fout = new FileWriter("test.txt");

		PrintWriter pw = new PrintWriter(fout);

		String str;

		int lcnt=0;

		while((str=br.readLine())!=null)
		{
			pw.println(str.toUpperCase());

			lcnt++;
		}

		fin.close();
		fout.close();

		System.out.println("\n Total Lines : "+lcnt);
	}
}