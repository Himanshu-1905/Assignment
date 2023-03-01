
public class Main1 { // main class
public static void main(String[] args) { //main method
	Movie m = new Movie();
	m.setName("Thank God");
	m.setStarttime("11:00 AM");
	m.setEndtime("01:00 PM");
	m.setPrice(350);
	
	System.out.println("Movie name is: "+m.getName());
	System.out.println("Starting time is: "+m.getStarttime());
	System.out.println("Ending time is: "+m.getEndtime());
	System.out.println("Price is: "+m.getPrice());
}
}
