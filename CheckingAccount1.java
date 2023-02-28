
interface BankAccount1{
	void deposite(); //by.defaultabstract method
	void withdraw(); //by.default abstract method
}
public class CheckingAccount1 implements BankAccount1 {
	public void deposite() { //implementation 
		int balance = 12000;
		int deposite = 30000+balance;
				System.out.println("Deposite bal is :"+deposite);
	}
	public void withdraw() { //implementation
		int balance = 12000;
		int deposite = balance -500;
		System.out.println("Withdraw balance is :"+deposite);
	}
	public static void main(String[] args) { //main class
		BankAccount1 b1 =new CheckingAccount1();
		b1.deposite();
		b1.withdraw();
	}
}