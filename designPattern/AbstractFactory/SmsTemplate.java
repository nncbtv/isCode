package is.designPattern.AbstractFactory;

public class SmsTemplate implements TemplateMessaggio{// Prodotto concreto della famiglia SMS
	@Override
	public String formatta(String testo) {
		 return "[SMS] " + testo;
	}

}
