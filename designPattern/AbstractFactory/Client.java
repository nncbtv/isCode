package is.designPattern.AbstractFactory;

public class Client {// Client: usa solo la factory e i prodotti astratti
	public static void main(String[] args) {
        NotificationFactory factory = new EmailFactory();

        Notifica notifica = factory.creaNotifica();
        TemplateMessaggio template = factory.creaTemplate();

        System.out.println(template.formatta("Ciao Matteo"));
        notifica.invia();
    }
}
