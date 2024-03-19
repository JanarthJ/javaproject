package designpatterns;

public class Singleton {
	private static Singleton instance;
	private Singleton() {    
        // private constructor to prevent instantiation from outside
    	System.out.println("Instance created successfully");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public void programs() {
    	System.out.println("programs");
    }
}
