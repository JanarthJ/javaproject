package practise;

//Target interface
interface Charger {
 void charge();
}

//Adaptee (existing class that needs adapting)
class AndroidCharger {
	 void chargeWithMicroUSB() {
	     System.out.println("Charging  device with Micro USB");
	 }
}

//Adapter class
class AndroidToiPhoneChargerAdapter implements Charger {
 private AndroidCharger androidCharger;

 public AndroidToiPhoneChargerAdapter(AndroidCharger androidCharger) {
     this.androidCharger = androidCharger;
 }

 @Override
 public void charge() {
     androidCharger.chargeWithMicroUSB();
     System.out.println("Adapter converting Micro USB to Lightning connector for iPhone");
     System.out.println("Charging iPhone device with Lightning connector");
 }
}




public class AdapterExample {
	public static void main(String[] args) {
		 // Using Android charger directly
        AndroidCharger androidCharger = new AndroidCharger();
        androidCharger.chargeWithMicroUSB();

        // Using iPhone charger with adapter
        AndroidCharger androidCharger2 = new AndroidCharger();
        Charger iPhoneChargerAdapter = new AndroidToiPhoneChargerAdapter(androidCharger2);
        iPhoneChargerAdapter.charge();
	}
}
