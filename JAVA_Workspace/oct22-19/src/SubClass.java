public class SubClass extends SuperClass {
	
	String s = "SubClass Variable";
	
	SubClass() {
		super();
		System.out.println("Sub Class Constructor");
	}
	
	void getsData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("------------");
		super.superClassethod();
	}
}
