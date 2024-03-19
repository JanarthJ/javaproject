package openClosed;

//version 1 and 2 shape area calculation
//version 3 
interface Shape{
	int area(int r);
}
class Circle implements Shape{	
	public int area(int r) {
		int area  = (int) (3.14 * r * r);
		return area;
	}
	public void display() {
		System.out.println("Class Circle");
	}
}

class Square implements Shape{
	public int area(int s) {
		int area  = s*s;
		return area;
	}
	public void display() {
		System.out.println("Class Square");
	}
}


public class NonViolatingOCP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle  c = new Circle();
		Square s  =  new Square();
		System.out.println(c.area(2));
		System.out.println(3);
	}

}
