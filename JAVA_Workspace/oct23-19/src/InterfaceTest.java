public class InterfaceTest {

	public static void main(String[] args) {
		
		
		AutoMobile a;
		
		
		Bmw b = new Bmw();
		b.gear();
		b.gps();
		b.abs();
		
		System.out.println("-----------------");
		
		Toyota t = new Toyota();
		t.gear();
		t.gps();
	}
}
