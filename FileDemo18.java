import java.io.*;

class FileDemo18
{
	public static void main(String args[]) throws IOException
	{
		File file = new File("D:\\JavaPrg");

		String flist[] = file.list();
		int classcnt=0;
		int txtcnt=0;

		for(int i=0;i<flist.length;i++)
		{
			File f = new File(flist[i]);

			if(flist[i].endsWith(".class")==true)
			{
				classcnt++;
				f.delete();
			}
			else if(flist[i].endsWith(".txt")==true)
			{
				txtcnt++;
				f.delete();
			}
		}

		System.out.println("Tot .class Files : " +classcnt);
		System.out.println("Tot .txt Files : " +txtcnt);
	}
}