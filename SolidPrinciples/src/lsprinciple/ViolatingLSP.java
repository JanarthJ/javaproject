package lsprinciple;


class Bird{ //parent class
	public void Eat() {
		System.out.println("All Birds eat ");
	}
	public void fly() {
		System.out.println("I can able to fly ");
	}
}

//child class
class Parrot extends Bird{
	
}
//child class 2
class Penguin extends Bird{
	public void fly() {
		System.out.println("Penguin cant able to fly  ");
	}
}


public class ViolatingLSP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Penguin obj = new Penguin();
//		obj.fly();
		Bird obj = new Bird(); //parent or superclass object
		obj.Eat();
		obj.fly();
		System.out.println("--------------------------");
		Penguin obj1 = new Penguin(); //child or subclass object
		obj1.Eat();
		obj1.fly();
		
//		LSP
	}

}
