
// Method Overriding (1. same name method 2. same parameter 3. Is-A relation
// creating parent class/super class
public class TestOverriding {
	void run() { // method 1
		System.out.println("Running mode on");
	}
}
//creating child class / sub class
class Overriding extends TestOverriding{
	//defining same name method as its declared in the parent class
	void run() {// method 2
		System.out.println("Running mode off");
	}
	public static void main(String[] args) {
		// creating a object of child class
		Overriding a = new Overriding();
		a.run();
	}
}
