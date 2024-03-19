package lsprinciple;

abstract class BirdLSP{ //parent class
	public void Eat() {
		System.out.println("All Birds eat ");
	}
	public abstract void move() ;// abstract method
}

//child class
class ParrotLSP extends BirdLSP{
	public void move() {
		System.out.println("I can able to fly");
	}
}
//child class 2
class PenguinLSP extends BirdLSP{
	public void move() {
		System.out.println("Penguin cant able to fly  ");
	}
}

public class NonViolationgLSP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Penguin obj = new Penguin();
//		obj.fly();
//		BirdLSP obj = new BirdLSP(); //parent or superclass object
//		obj.Eat();
//		obj.move();
		
//		System.out.println("--------------------------");
//		PenguinLSP obj1 = new PenguinLSP(); //child or subclass object
//		obj1.Eat();
//		obj1.move();
		
//		LSP
	}
}
