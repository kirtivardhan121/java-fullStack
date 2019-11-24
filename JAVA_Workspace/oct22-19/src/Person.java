public class Person {
	
	String name;
	int age;
	
	Person(String pname, int page){
		name = pname;
		age = page;
	}
	
	public static void main(String[] args) {
		Person p = new Person("Vardhan" , 22);
		Person p1 = new Person("Emma" , 22);
	}
}
