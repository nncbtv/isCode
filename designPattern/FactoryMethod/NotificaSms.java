package is.designPattern.FactoryMethod;

public class NotificaSms implements Notifica{//Serve a dire come inviare una notifica di tipo sms
	//Prodotto concreto
	@Override
	public void invia() { //metodo per inviare una notifica di tipo sms
		System.out.println("Invio notifica via SMS");
	}//invia
}//NotificaSms
