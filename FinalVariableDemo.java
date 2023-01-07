class FinalVariableDemo
{
	public static void main(String args[])
	{
		final double PI = 3.14;

		PI++;    // will generate error

		System.out.println("PI : "+PI);
	}
}