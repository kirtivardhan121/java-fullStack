public class OverridingTest {

	public static void main(String[] args) {

		Super s = new Super();
		s.count();
		
		System.out.println("----------------");
		
		Sub sb = new Sub();
		sb.add();
		sb.count();
	}

}
