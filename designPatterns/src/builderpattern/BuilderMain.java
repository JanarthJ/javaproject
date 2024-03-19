package builderpattern;

public class BuilderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Car("pink","honda",1000000.0);
//		Car obj1 = new Car("blue","honda");
//		Car obj2 = new Car("yellow",20000.0);
//		Car obj3 = new Car();
		//complex task
		
		Car obj2 =  new BuilderCar().setColor("black").build();
		Car obj4 = new BuilderCar().setPrice(2000.0)
				.setType("honda").setColor("white").build();
		Car obj3 = new BuilderCar().build();
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
	}

}
