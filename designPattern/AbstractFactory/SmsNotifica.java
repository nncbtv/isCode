package is.designPattern.AbstractFactory;

public class SmsNotifica implements Notifica{// Altro prodotto concreto della famiglia SMS
	 @Override
	    public void invia() {
	        System.out.println("Invio notifica via SMS");
	    }
}
