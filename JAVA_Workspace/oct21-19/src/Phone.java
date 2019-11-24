public class Phone {

	public static void main(String[] args) {
		
		ThirdGen t = new ThirdGen();
		t.call();
		t.msg();
		t.games();
		t.camera();
		
		System.out.println("-----------");
		
		SecondGen s = new SecondGen();
		s.games();
		
		System.out.println("-----------");
		
		FirstGen f = new FirstGen();
		f.call();
		f.msg();
	}

}
