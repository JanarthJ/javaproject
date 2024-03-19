package observerpattern;

import java.util.ArrayList;
import java.util.List;

interface Netflix{ //subject Netflix
	void addSubscriber(NetflixSubscriber obj);
	void removeSubscriber(NetflixSubscriber obj);
	void notifySubscriber(String notify);
}
//concreate class for subject Netflix
public class SubjectNetflix  implements Netflix{
	private List<NetflixSubscriber> peoples;
	//List of subscribers
	public SubjectNetflix() {
		peoples = new ArrayList<>();
	}
	@Override
	public void addSubscriber(NetflixSubscriber obj) {
		// TODO Auto-generated method stub
		peoples.add(obj);
	}

	@Override
	public void removeSubscriber(NetflixSubscriber obj) {
		// TODO Auto-generated method stub
		peoples.remove(obj);
	}

	public void notifySubscriber(String notify) {
		// TODO Auto-generated method stub
		for(NetflixSubscriber sub :peoples ) {
			sub.update(notify);
		}
	}
	
	public void publishNotification(String Notify) {
		System.out.println("Notification Published"+ Notify);
		notifySubscriber(Notify);
	}

}
