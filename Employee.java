
// creating employee class 
public class Employee {
	//Problem 1
	long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;
    //double transportAllowance;
    public Employee(long Id, String Name, String Address, Long Phone) {
        this.employeeId = Id;
        this.employeeName = Name;
        this.employeeAddress = Address;
        this.employeePhone = Phone;
      //this.basicSalary = Salary;
}
    //method for calculating salary
    void calculateSalary() {
    	double salary = basicSalary +  ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);
    	System.out.println("Salary of "+employeeName+" is "+salary);
    }
    //adding default transport allowance method
    void calculateTransportAllowance() {
    	double transportAllowance=10*basicSalary/100;
    	System.out.println(employeeName+"Transport Allowance is:"+transportAllowance);
    }
}
//deriving manager class from Employee class
class Manager extends Employee{ //child class of Employee class
	public Manager(long Id, String Name, String Address, long Phone, double Salary) { // using base class to overloading parent constructor
		
		super(Id,Name,Address,Phone);
		super.basicSalary=Salary;
	}
	 void calculateTransportAllowance() {
	    	double transportAllowance=15*basicSalary/100;
	    	System.out.println(employeeName+"Transport Allowance is:"+transportAllowance);
	 }
}
// deriving Trainee class from Employee class
class Trainee extends Employee{
	public Trainee(long Id, String Name, String Address, long Phone, double Salary) {
		super(Id,Name,Address,Phone);
		super.basicSalary=Salary;
	}
}
