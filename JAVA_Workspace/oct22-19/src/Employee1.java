public class Employee1 {

	String name;
	int eid;
	
	public Employee1(String name , int eid ) {
		this.name = name;
		this.eid = eid;
	}
	
	void printDetaills() {
		System.out.println("Employee name  is " +name);
		System.out.println("Employee id is " +eid);
		this.sayHello();
	}
	
	void sayHello() {
		System.out.println("Hello "+name+" Welcome to UST Global");
	}
	
	public static void main(String[] args) {
		Employee1 e1 = new Employee1("deepika" , 1);
		e1.printDetaills();
		
		Employee1 e2 = new Employee1("Alia" , 2);
		e2.printDetaills();
		
		Employee1 e3 = new Employee1("Ema" , 3);
		e3.printDetaills();
		
	}
}
