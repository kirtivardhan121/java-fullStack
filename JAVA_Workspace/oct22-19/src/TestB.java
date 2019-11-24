public class TestB {
	
	static int a = 25;
	int x; 
	
	public static void main(String[] args) {
		add();
		TestB p = new TestB();
		System.out.println("Value of x is " + p.x);
	}
	
	public static void add() {
		int a = 0; //we have to initialize variables before use
		final int b = 0; //only final access modifier is supported for local variable
		System.out.println(a);
		System.out.println(b);
	}
}
