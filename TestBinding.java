
class TestBinding {
void show() { // dynamic binding
	System.out.println("Is it clear");
}}
class Binding extends TestBinding {
	void show () {
		System.out.println("Override");
	}
	public static void main (String [] args) {
		TestBinding obj=new Binding() ;
		obj.show();
}
}
