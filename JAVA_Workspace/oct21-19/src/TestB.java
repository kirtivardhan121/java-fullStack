public class TestB {

	public static void main(String[] args) {
		Btm b = new Btm();
		b.swipe();
		int count = b.getCount();
		System.out.println("Count is " + count);
		int totalcount = b.gettotalcount();
		System.out.println("Total Count is " +totalcount);
	}

}
