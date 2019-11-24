public class TestA {

	public static long add(long a, int b) {
		System.out.println("Add  first method");
		return a + b;
	}
	
	public static int add(int a, int b) {
		System.out.println("Add  scond method");
		return a + b;
	}
	
	public static void add(int a, byte b) {
		System.out.println("Add third  method");
	}
	
	public int multiply(int a , int b) {
		System.out.println("multiply first method");
		return a * b;
	}
	
	public int multiply(byte  a , int b) {
		System.out.println("multiply second method");
		return a * b;
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		main(10);
		add(10, 20);
		add(2220, 3456);
		add(23, 56758);
		
		TestA t = new TestA();
		t.multiply(10, 10);
		t.multiply(100, 50);
		
	}
	
	public static void main(int a) {
		System.out.println("Overloaded main method");
	}
}
