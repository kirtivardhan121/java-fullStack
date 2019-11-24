class TestAA{
	public static void main(String args[]){
		int a = 20;
		int b = 25;
		int c = 15;
		int d = a>b ? (a>c ? a:c) : (b>c ? b:c);
		System.out.println(d);
		int s = sum (a,b);
		System.out.println(s);
	}

	static int sum(int x, int y){
		int z = x + y;
		return z;
	}
}