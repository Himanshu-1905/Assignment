
public class InheritanceActivity {
	public static void main(String[] args) {
		Manager m = new Manager (126534,"Peter","Chennai India",237844,65000); // test class 1
		Trainee t = new Trainee(29846,"Jack","Mumbai India",442085,45000); // test class 2
		
		m.calculateSalary();
		m.calculateTransportAllowance();
		
		t.calculateSalary();
		t.calculateTransportAllowance();
	}
}
