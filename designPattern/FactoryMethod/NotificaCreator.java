package is.designPattern.FactoryMethod;

public abstract class NotificaCreator { //Serve a decidere come creare la notifica, classe creator
	public abstract Notifica creaNotifica();// questo metodo serve a creare effetivamente una nuova notifica

    public void mandaNotifica() { //Questo metodo serve a crearla(richiamando il metodo creaNotifica) e 
        Notifica n = creaNotifica(); //inviarla(attraverso il metodo della classe Notifica).
        	 n.invia();	          //Viene inserito nella classe astratta per non doverlo reinserire in ogni classe concreta      
    }//mandaNotifica
}//NotificaCreator