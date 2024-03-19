package designpatterns;

public class Factory {

	public static void main(String[] args) {
		// Create an instance of the PaymentProcessorFactory
		PaymentFactory factory = new PaymentFactory();
        // Get a CreditCardProcessor instance from the factory
        PaymentProcessor creditCardProcessor = factory.createPaymentProcessor("credit card");
       creditCardProcessor.processPayment(100.0);
        // Get a PayPalProcessor instance from the factory
        PaymentProcessor payPalProcessor = factory.createPaymentProcessor("paypal");
        payPalProcessor.processPayment(50.0);
	}

}
