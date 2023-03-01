// Movie Theatre Management system, where you can create two classes one is main another one is movie,
//movie class can have two methods setMovie, getMovie where you can create movieName , movieStarttime, movieEndtime,movieTicketPrice as instance variables.
public class Movie {
	
	private String name;
	private String starttime;
	private String endtime;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
	
