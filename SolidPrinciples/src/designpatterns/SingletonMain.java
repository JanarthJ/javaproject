package designpatterns;

class Example{
	public int num;
	public Example(int num) {
		this.num = num;
	}
}

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj = Singleton.getInstance();
		Singleton obj1 = Singleton.getInstance();
		System.out.println(obj);
		System.out.println(obj1);
	}

}

//Example obj = new Example(20);
//Example obj1 = new Example(10);
