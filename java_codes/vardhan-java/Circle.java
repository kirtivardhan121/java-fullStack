class Circle{
	public static void main(String args[]){
		int r = 5;
		System.out.println("Circumference  of circle is " + circumference(r)); 
		System.out.println("Area of circle is " + area(r));
		System.out.println("14   is " + oddEven(r) + "Number");
		greeting("Welcome to java class");
	}
	static double area(int r){
	double a = Math.PI * r * r;
	return a;
	} 
	static double circumference(int r){
	double a = 2 * Math.PI * r;
	return a;
	} 

	static boolean oddEven(int n)
	{
		if(n % 2 == 0){
			return true;
		}else{
			return false;
		}
	}

	static void greeting(String msg)
	{
		System.out.println(msg);
	}
}