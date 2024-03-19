package factorypattern;

interface PaymentProcessor{ //product
	void processPayment(double amount);	
}

class CreditCardPayment implements PaymentProcessor{ //subproducts
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment procced with credicard"+amount);
	}	
}

class UPIPayment implements PaymentProcessor{
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment procced with UPI"+amount);
	}	
}

class NetBankPayment implements PaymentProcessor{
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment procced with bankPayment"+amount);
	}	
}


public class FactoryPanel {//factory
	//factory method
	public PaymentProcessor createPaymentProduct(String paymentMode) {
		if(paymentMode.equalsIgnoreCase("Creditcard")) {
			return new CreditCardPayment();
		}else if(paymentMode.equalsIgnoreCase("upi")) {
			return new UPIPayment();
		}else if(paymentMode.equalsIgnoreCase("netbanking")) {
			return new NetBankPayment();
		}else {
			throw new IllegalArgumentException("Invalid Payment Mode");
		}
	}
}
