package factorypattern;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryPanel factory = new FactoryPanel();
		
		PaymentProcessor creditcard = factory.createPaymentProduct("netbanking");
		creditcard.processPayment(100);
		
		PaymentProcessor upi = factory.createPaymentProduct("upi");
		upi.processPayment(1000);
		
	}

}
