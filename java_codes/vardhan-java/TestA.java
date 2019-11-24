class TestA
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		int c = a++ + b;
		System.out.println("c is " + c);

		int p = 10;
		int q = 20;
		int r = ++p + q;
		System.out.println("r is " + r);

		int k = 10;
		int l = 20;
		int m = --p + q;
		System.out.println("m is " + m);
		
	}

}