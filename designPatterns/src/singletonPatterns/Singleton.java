package singletonPatterns;

public class Singleton {
	private static Singleton instance;
	private Singleton() {
		//Used for restrict the instasnce creation from outside
		System.out.println("Object created...");
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();			
		}
		return instance;		
	}	
}
