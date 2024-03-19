package designpatterns;

//Interface for the PaymentProcessor
interface PaymentProcessor { //product
	void processPayment(double amount);
}

//Concrete implementation of PaymentProcessor for Credit Card payments
class CreditCardProcessor implements PaymentProcessor {
	@Override
	public void processPayment(double amount) {
	   System.out.println("Processing credit card payment of $" + amount);
	   // Additional logic specific to credit card payments can be added here
	}
}

//Concrete implementation of PaymentProcessor for PayPal payments
class PayPalProcessor implements PaymentProcessor { //concreate creators
	@Override 
	public void processPayment(double amount) {
	   System.out.println("Processing PayPal payment of $" + amount);
	   // Additional logic specific to PayPal payments can be added here
	}
}

public class PaymentFactory { //creator
	public PaymentProcessor createPaymentProcessor(String paymentMethod) {
        if (paymentMethod.equalsIgnoreCase("credit card")) {
            return new CreditCardProcessor();
        } else if (paymentMethod.equalsIgnoreCase("paypal")) {
            return new PayPalProcessor();
        } else {
            throw new IllegalArgumentException("Invalid payment method");
        }
    }
}
