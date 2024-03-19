package practise;

class Car { 
    private int price;
    private String color;
    private String type;
	public Car(int price, String color, String type) {
		this.price = price;
		this.color = color;
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Car [price=" + price + ", color=" + color + ", type=" + type + "]";
	}    
}
  
  class CarBuilder {
	  	private int price;
	    private String color;
	    private String type;
		public CarBuilder setPrice(int price) {
			this.price = price;
			return this;
		}
		public CarBuilder setColor(String color) {
			this.color = color;
			return this;
		}
		public CarBuilder setType(String type) {
			this.type = type;
			return this;
		}		 
		public Car build()
		{
			return new Car(price, color, type);
		}	    
  }



  
public class BuilderSample {
	public static void main(String args[]) {		 
		 Car obj = new CarBuilder().setColor("pink")
				 .setType("honda").setPrice(10000).build();
		 Car obj1 = new CarBuilder().setColor("pink")
				 .setType("honda").build();
		 Car obj2 = new CarBuilder().setColor("pink")
				.build();
		 Car obj3 = new CarBuilder().build();
		 System.out.println(obj);
		 System.out.println(obj1);
		 System.out.println(obj2);
		 System.out.println(obj3);
	}
}
