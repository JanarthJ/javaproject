package singletonPatterns;

public class SingletonMain {
	//static 
	//private, protected,default,public 
	public static void main(String[] args) {
//		Singleton obj = new Singleton();
		Singleton obj = Singleton.getInstance();
		Singleton obj1 = Singleton.getInstance();
		System.out.println(obj);
		System.out.println(obj1);
//		NonSingleton obj1 = new NonSingleton(20);
//		obj.display();
//		obj1.display();
//		System.out.println(obj);
//		System.out.println(obj1);
	}
}
