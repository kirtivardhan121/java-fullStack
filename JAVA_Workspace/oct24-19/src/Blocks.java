public class Blocks {

	static int a;
	int b;
	
	static {
		a = 10;
		System.out.println("Static block 1");
	}
	
	Blocks() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		Blocks b1 = new Blocks();
		Blocks b2 = new Blocks();
		System.out.println("Value Of a " +a);
	}
	
	static {
		a = 20;
		System.out.println("Static block 2");
	}
	
	static {
		a = 40;
		System.out.println("Static block 3");
	}
}
