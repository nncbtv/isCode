package is.designPattern.AbstractFactory;

public class EmailTemplate implements TemplateMessaggio {// Prodotto concreto della famiglia Email
	 @Override
	    public String formatta(String testo) {
	        return "[EMAIL] " + testo;
	    }
}
