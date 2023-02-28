abstract class Shape{
abstract void calculateArea();
}
class Circle extends Shape{
	void calculateArea() {
		int radius=3;
		double Radius=3.14*radius*radius;
		System.out.println("Area of circle is:"+Radius);
	}
}
class Rectangle extends Shape{
	void calculateArea() {
		int length=10,breadth=4;
		int area=length+breadth;
		System.out.println("Area of Ractangle is:"+area);
	}
	public static void main(String[] args) {
		Shape object = new Circle();
		object.calculateArea();
		Shape obj = new Rectangle();
		obj.calculateArea();
	}
}
