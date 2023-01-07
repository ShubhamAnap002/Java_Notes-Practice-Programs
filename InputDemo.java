import java.io.*;

class InputDemo
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int no;

		System.out.print("Enter String : ");
		str = br.readLine();

		System.out.print("Enter No : ");
		no = Integer.parseInt(br.readLine());

		System.out.println("String is : "+str);
		System.out.println("No is : "+no);
	}
}