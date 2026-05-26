package is.designPattern.FactoryMethod;

public class NotificaEmail implements Notifica{//Serve a dire come effettivamente inviare una notifica di tipo email
	//Prodotto concreto
	@Override
	public void invia() { //metodo per invie una notifica di tipo email
		System.out.println("Invio notifica via Email");		
	}//invia	
}//NotificaEmail
