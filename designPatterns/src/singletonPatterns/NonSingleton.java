package singletonPatterns;

public class NonSingleton {
	public static int num;

	public NonSingleton(int num) {
		this.num=num;
	}
	
	public void display() {
		System.out.println("This is display "+this.num);
	}
}
