public class TestG {

	final void add() {
		System.out.println("Add Method");
	}
	
	final void add(int a) {
		System.out.println("overloaded Method");
	}
	
	public static void main(String[] args) {
		SuperClass sup = new SuperClass();
		
		System.out.println("--------------------");
		SubClass sub = new SubClass();
		sub.getsData();
		
		System.out.println("--------------");
		TestG g = new TestG();
		g.add();
		g.add(10);

	}

}
