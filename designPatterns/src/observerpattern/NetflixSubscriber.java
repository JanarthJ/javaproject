package observerpattern;

interface NetflixSubscriberInterface{//observer
	void update(String notification);
}
//concreate class for observer
public class NetflixSubscriber implements NetflixSubscriberInterface {
	private String SubscriberName;
	public NetflixSubscriber(String Name) {
		this.SubscriberName = Name;
	}
	@Override
	public void update(String notification) {
		// TODO Auto-generated method stub
		System.out.println("Hey "+ SubscriberName+" "+notification+" are uploaded and waiting for you !......");
		
	}

}
