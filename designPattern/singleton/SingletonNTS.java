package is.designPattern.singleton;

public class SingletonNTS {

	private static SingletonNTS istanza; //Oggetto di tipo singleton non inizializzato
	private String nome; //Campo fittizio giusto per l'esempio, potrebbe essere qualsiasi cosa
	
	private SingletonNTS(String nomeIn) {
		this.nome = nomeIn; //Aggiungere tutte le accortezze di un costruttore
	}//Costruttore standard privato

	public static SingletonNTS getIstance(String nomeIn) {
		if ( istanza == null ) //Solamente se l'istanza non è stata creata la creo
			istanza = new SingletonNTS(nomeIn);
		return istanza;
	}//Metodo per restitutire l'istanza
	
}//SingletonNTS

/*
 * 	Questa implementazione del singleton non è thread safe, infatti più thread potrebbero creare istanze della classe diversa.
 * 	Per via di tutti i motivi legati ad un codice non Thread Safe (interleaving ad esempio).
 */