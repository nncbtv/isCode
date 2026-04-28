package is.designPattern.singleton;

public class SingletonSinc {

	private static SingletonSinc istanza; //Oggetto di tipo singleton non inizializzato
	private String nome; //Campo fittizio giusto per l'esempio, potrebbe essere qualsiasi cosa
	
	private SingletonSinc(String nomeIn) {
		this.nome = nomeIn; //Aggiungere tutte le accortezze di un costruttore
	}//Costruttore standard privato

	public static SingletonSinc getIstance(String nomeIn) {
		synchronized (SingletonSinc.class) { //Inserisco un blocco per la sincronizzazione di java
			if ( istanza == null ) //Solamente se l'istanza non è stata creata la creo
				istanza = new SingletonSinc(nomeIn);
			return istanza;
		}
	}//Metodo per restitutire l'istanza
	
}//SingletonSinc

/*
 * 	In questo modo i thread entrano in modo ordinato nella sezione critica, la creazione dell'istanza.
 * 	Questa implementazione però rallenta di molto il multi-threading per via dell'attesa dei thread per la sezione critica.
 * 	Possiamo ovviare a questo problema introducendo il metodo double check.
 * 
 */
