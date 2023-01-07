import java.io.*;

class FileDemo9
{
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fout = new FileOutputStream("test.txt");

		DataOutputStream ps = new DataOutputStream(fout);

		DataInputStream in = new DataInputStream(System.in);

		int ch;

		while((ch=in.read())!=-1)
		{
			ps.write(ch);
		}
	}
}