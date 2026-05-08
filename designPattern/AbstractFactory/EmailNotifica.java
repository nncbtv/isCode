package is.designPattern.AbstractFactory;

public class EmailNotifica implements Notifica{// Altro prodotto concreto della famiglia Email
	    @Override
	    public void invia() {
	        System.out.println("Invio notifica via Email");
	    }
}
