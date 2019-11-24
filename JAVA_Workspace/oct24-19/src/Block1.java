public class Block1 {

	static int b;
	int a;
	
	{
		a = 10;
		b = 20;
		System.out.println("Non static block 1");
	}
	
	public static void main(String[] args) {
		System.out.println("Main started");
		Block1 b1 = new Block1();
		Block1 b2 = new Block1();
		System.out.println("Main Ended");
	}
	
	{
		System.out.println("Non Static Block 2");
	}
}
