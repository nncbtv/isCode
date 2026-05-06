package is.designPattern.FactoryMethod;

public class SmsCreator extends NotificaCreator{//questa sottoclasse decide di crearne una di tipo Sms
	@Override
	public Notifica creaNotifica() {//qui abbiamo effettivamente creato una nuova notifica
		return new NotificaSms();		    //di tipo email che verrà utilizzata nel metodo astratto creato in precedenza		
	}
}
