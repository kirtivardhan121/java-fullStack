
public class MobileTest {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.homeScreen();
		
		System.out.println("-----------------");
		
		Sony s = new Sony();
		s.homeScreen();
		
		System.out.println("-----------------");
		
		OnePlus o = new OnePlus();
		o.homeScreen();
		
		System.out.println("-----------------");
		
		Mi i = new Mi();
		i.homeScreen();

	}

}
