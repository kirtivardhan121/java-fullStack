public class Student {
	
	String name;
	int id;
	String cname;
	int rollno;
	String deptname;
	
	public Student(String name, int id, String cname,  int rollno, String deptname) {
		this.name = name;
		this.id = id;
		this.cname = cname;
		this.rollno = rollno;
		this.deptname = deptname;	
	}
	
	void printDetails() {
		System.out.println("Student name  is " +name);
		System.out.println("Student id is " +id);
		System.out.println("Student College name is " +cname);
		System.out.println("Student roll no  is " +rollno);
		System.out.println("Student deptno is " +deptname);
		
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Kirti", 101, "Dypcoe", 111, "CSE");
		s1.printDetails();
		
		Student s2 = new Student("Vardhan", 102, "Dypcoe", 112, "CSE");
		s2.printDetails();
		
		Student s3 = new Student("Nishu", 103, "Dypcoe", 110, "Animation");
		s3.printDetails();
		
		Student s4 = new Student("Diksha", 104, "Dypcoe", 113, "Archi");
		s4.printDetails();
		
		Student s5 = new Student("Raj", 105, "Dypcoe", 114, "IT");
		s5.printDetails();
	}

}
