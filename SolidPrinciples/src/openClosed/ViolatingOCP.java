package openClosed;

// Requirement : version 2
	// we need implement the calculation for area of circle, square and reactangle

//version 1 shape area calculation
//class Shape{ //normal parent class 
//	public int area(int r) {
//		int area  = (int) (3.14 * r * r);
//		return area;
//	}
//	public int areaOfSquare(int s) { //violated the OCP principle
//		int area  = (int) (s*s);
//		return area;
//	}	
//}
//
//class Circle extends Shape{
//	public void display() {
//		System.out.println("Class Circle");
//	}
//}
public class ViolatingOCP {
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Circle obj = new Circle();
//		obj.display();
//		System.out.println(obj.area(2));
	}
}
