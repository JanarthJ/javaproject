package builderpattern;

public class BuilderCar {
	private String color;
	private String type;
	private double  price;
	
	public BuilderCar setColor(String color) {
		this.color = color;
		return this;
	}
	public BuilderCar setType(String type) {
		this.type = type;
		return this;
	}
	
	public BuilderCar setPrice(Double price) {
		this.price = price;
		return this;
	}
	
	public Car build() {
		return new Car(color,type,price);
	}//create the object for Car class with values;
}
