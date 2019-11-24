public class Employee {
	
	String name;
	int eid;
	
	public Employee(String empname , int empid ) {
		name = empname;
		eid = empid;
	}
	
	void printDetaills() {
		System.out.println("Employee name  is " +name);
		System.out.println("Employee id is " +eid);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Vardhan", 001);
		e1.printDetaills();
		
		Employee e2 = new Employee( "Emma" , 002);
		e2.printDetaills();
		
		Employee e3 = new Employee("Arya" , 003);
		e3.printDetaills();

	}

}
