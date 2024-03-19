package practise;

import java.util.ArrayList;
import java.util.List;

//Subject interface
interface NewsAgency {
	 void addObserver(Subscriber observer);
	 void removeObserver(Subscriber observer);
	 void notifyObservers(String news);
}

//Concrete subject
class ConcreteNewsAgency implements NewsAgency {
	 private List<Subscriber> subscribers;	
	 public ConcreteNewsAgency() {
	     subscribers = new ArrayList<>();
	 }	
	 @Override
	 public void addObserver(Subscriber observer) {
	     subscribers.add(observer);
	 }	
	 @Override
	 public void removeObserver(Subscriber observer) {
	     subscribers.remove(observer);
	 }	
	 @Override
	 public void notifyObservers(String news) {
	     for (Subscriber subscriber : subscribers) {
	         subscriber.update(news);
	     }
	 }
	 public void publishNews(String news) {
	     System.out.println("Publishing news: " + news);
	     notifyObservers(news);
	 }
}

//Observer interface
interface Subscriber {
	void update(String news);
}

//Concrete observer
class ConcreteSubscriber implements Subscriber {
	 private String name;
	 public ConcreteSubscriber(String name) {
	     this.name = name;
	 }
	 @Override
	 public void update(String news) {
	     System.out.println(name + " received news: " + news);
	 }
}

public class ObserverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a news agency
        ConcreteNewsAgency newsAgency = new ConcreteNewsAgency();
        // Create subscribers
        Subscriber subscriber1 = new ConcreteSubscriber("Subscriber 1");
        Subscriber subscriber2 = new ConcreteSubscriber("Subscriber 2");
        // Add subscribers to the news agency
        newsAgency.addObserver(subscriber1);
        newsAgency.addObserver(subscriber2);
        // Publish news
        newsAgency.publishNews("Breaking news: New product launch!");
	}
}
