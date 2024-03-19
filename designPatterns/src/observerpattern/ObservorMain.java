package observerpattern;

public class ObservorMain {
	public static void main(String args[]) {
		//subject instance
		SubjectNetflix netflix = new SubjectNetflix();
		//create subscriber --> register in netflix
		NetflixSubscriber sub1 = new NetflixSubscriber("JJ");
		NetflixSubscriber sub2 = new NetflixSubscriber("manjunath");
		
		//add subscriber into subject netflix
		//adding username and credential into netflix DB
		netflix.addSubscriber(sub1);
		netflix.addSubscriber(sub2);
		
		netflix.publishNotification("New Series");
		netflix.publishNotification("Movies");
	}
}
