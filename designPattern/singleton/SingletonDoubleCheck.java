package is.designPattern.singleton;

public class SingletonDoubleCheck {

	private static volatile SingletonDoubleCheck istanza; //Oggetto di tipo singleton non inizializzato
	private String nome; //Campo fittizio giusto per l'esempio, potrebbe essere qualsiasi cosa
	
	private SingletonDoubleCheck(String nomeIn) {
		this.nome = nomeIn; //Aggiungere tutte le accortezze di un costruttore
	}//Costruttore standard privato

	public static SingletonDoubleCheck getIstance(String nomeIn) {
		if ( istanza == null ) { //Inserisco un Check preventivo, se questo va a True solo dopo aspetto per il lock
			synchronized (SingletonDoubleCheck.class) { //Inserisco un blocco per la sincronizzazione di java
				if ( istanza == null ) //Solamente se l'istanza non è stata creata la creo
					istanza = new SingletonDoubleCheck(nomeIn);
			}
		}
		return istanza;
	}//Metodo per restitutire l'istanza
	
}//SingletonDoubleCheck

/*
 * 	In questo modo entriamo in sezione critica solo se l'istanza non è stata creata e se il nostro thread acquisisce il lock.
 *  Volatile mi serve a scrivere sulla variabile istanza solo quando l'oggetto è completo al 100%
 */