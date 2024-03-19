package builderpattern;

public class Car { //builder class
	private String color;
	private String type;
	private double  price;
	public Car(String color, String type, double price) {
		super();
		this.color = color;
		this.type = type;
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public String getType() {
		return type;
	}
	public double getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "color = "+color+", type = "+type+", Price = "+price;
	}
}
