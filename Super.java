
class Supercon {
String Day ="Sunday";
}
 class days extends Supercon {
	String Day="Saturday";
	void printDay() {
		System.out.println(Day); // print Day name 
		System.out.println(super.Day);
	}
}
class Super{
	public static void main(String args[]) {
		days d = new days();
		d.printDay();
	}
}
