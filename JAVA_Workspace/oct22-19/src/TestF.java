public class TestF {

	TestF() {
		this(10); //constructor should not call itself, it'll throw an error
				 //constructor call must be the first statement in constructor  
	}
	TestF(int a) {
//		this();//we can not call one constructor in other constructor
	}
}
