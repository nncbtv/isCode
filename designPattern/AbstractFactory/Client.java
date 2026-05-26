package is.designPattern.AbstractFactory;

public class Client {// Client: usa solo la factory e i prodotti astratti
	public static void main(String[] args) {
		//Classe concreta con email
        //NotificationFactory factory1 = new EmailFactory();
		NotificationFactory factory1 = new SmsFactory();
        Notifica notifica = factory1.creaNotifica();
        TemplateMessaggio template = factory1.creaTemplate();

        System.out.println(template.formatta("Ciao Matteo"));
        notifica.invia();
    }
}
