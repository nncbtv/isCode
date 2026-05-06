package is.designPattern.FactoryMethod;

public class Client { //qui il client utilizzerà la classe creator astratta per ricevere una notifica*
	 public static void main(String[] args) {
	        NotificaCreator creator1 = new EmailCreator();//*di tipo email
	        creator1.mandaNotifica();

	        NotificaCreator creator2 = new SmsCreator();//*di tipo sms
	        creator2.mandaNotifica();
	    }
}
