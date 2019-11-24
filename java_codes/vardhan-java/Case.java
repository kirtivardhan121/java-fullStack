class Case{
	public static void main(String args[]){
	
	char grades = 'A';
	switch(grades)
	{
		case 'E' :System.out.println("Fail");
			break;
		case 'D' :System.out.println("Pass");
			break;
		case 'C' :System.out.println("Second Class");
			break;
		case 'B' :System.out.println("First Class");
			break;
		case 'A' :System.out.println("First Class With Distinction");
			break;
		default : System.out.println("Invalid Grade");
	}
	}
}