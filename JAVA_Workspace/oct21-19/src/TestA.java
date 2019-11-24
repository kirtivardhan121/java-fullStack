public class TestA {
	public static void main(String[] args) {
		Person.color = "Fair";
		Person.sleep();
		
		Person p = new Person();
		p.name = "Vardhan";
		p.age = 22;
		System.out.println("Name of Person " + p.name);
		System.out.println("Age of Person " + p.age);
		System.out.println("Color of Person " + Person.color);
		p.eat();
		p.walk();
		
		System.out.println("------------------------");
		
		Person p1 = new Person();
		p1.name = "Ranjeete";
		p1.age = 22;
		System.out.println("Name of Person " + p1.name);
		System.out.println("Age of Person " + p1.age);
		System.out.println("Color of Person " + Person.color);
		Person.sleep();
		p1.eat();
		p1.walk();
	}
}
