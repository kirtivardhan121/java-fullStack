public class Test {
	public static void main(String args[]) {
		Pen p = new Pen();
		p.cost = 100;
		p.color = "Blue";
		System.out.println("Cost is " + p.cost);
		System.out.println("Color is " + p.color);
		p.write();
		
		System.out.println("------------------------");
		
		Car c = new Car();
		c.cost = 50000000;
		c.color = "Matt Black";
		c.model = "BMW-xclass";
		System.out.println("Cost is " + c.cost);
		System.out.println("Color is " + c.color);
		System.out.println("Model is " + c.model);
		c.move();
		
		Car d = new Car();
		d.cost = 5000000;
		d.color = "White";
		d.model = "Mercedes-benz";
		System.out.println("Cost is " + d.cost);
		System.out.println("Color is " + d.color);
		System.out.println("Model is " + d.model);
		d.move();
		
		
		System.out.println("------------------------");
		
		Cow a = new Cow();
		a.name = "Sundari";
		a.color = "White";
		System.out.println("Name of Cow is " + a.name);
		System.out.println("Color of Cow is " + a.color);
		a.eat();
		a.sleep();
		
		Cow b = new Cow();
		b.name = "Ganga";
		b.color = "Black";
		System.out.println("Name of Cow is " + b.name);
		System.out.println("Color of Cow is " + b.color);
		b.eat();
		b.sleep();
		

		
		System.out.println("------------------------");
		
		
	}

}
