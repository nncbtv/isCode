package is.designPattern.FactoryMethod;

public class EmailCreator extends NotificaCreator{//questa sottoclasse decide di crearne una di tipo Email
	@Override
	public Notifica creaNotifica() { //qui abbiamo effettivamente creato una nuova notifica
		return new NotificaEmail();         //di tipo email che verrà utilizzata nel metodo astratto creato in precedenza
	}
}
