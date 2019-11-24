public class Emp {
	String name;
	int id;
	long aadhanrno;

	Emp(String name, int id, long aadharno){
		this.name = name;
		this.id = id;
		this.aadhanrno = aadharno;
	}
	
	Emp(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	void printDetails() {
		System.out.println("Hi " +name+ " Welcome to Ust Global");
	}
}
