import java.io.*;

class ArrayDemo4
{
	int no;
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	void setData() throws IOException
	{
		System.out.print("Enter No : ");
		no = Integer.parseInt(br.readLine());
	}

	void getData()
	{
		System.out.println("No is : "+no);
	}

	public static void main(String args[]) throws IOException
	{
		System.out.print("Enter Array Size : ");
		int n = Integer.parseInt(br.readLine());

		ArrayDemo4 d[] = new ArrayDemo4[n];

		for(int i=0;i<n;i++)
		{
			d[i] = new Demo();
			d[i].setData();
		}

		for(int i=0;i<n;i++)
		{
			d[i].getData();
		}
	}
}