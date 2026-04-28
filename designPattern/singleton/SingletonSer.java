package is.designPattern.singleton;

import java.io.Serializable;

public class SingletonSer implements Serializable{
	
	private static SingletonSer istanza; //Oggetto di tipo singleton non inizializzato
	private String nome; //Campo fittizio giusto per l'esempio, potrebbe essere qualsiasi cosa
	
	private SingletonSer(String nomeIn) {
		this.nome = nomeIn; //Aggiungere tutte le accortezze di un costruttore
	}//Costruttore standard privato

	public static SingletonSer getIstance(String nomeIn) {
		synchronized (SingletonSer.class) { //Inserisco un blocco per la sincronizzazione di java
			if ( istanza == null ) //Solamente se l'istanza non è stata creata la creo
				istanza = new SingletonSer(nomeIn);
			return istanza;
		}
	}//Metodo per restitutire l'istanza
	
	private Object readResolve() {
		return getIstance(nome);
	}//readResolve

}//SingletonSer

/*
 * In questo modo anche chiamando il metodo readResolve() java ricade sempre nella stessa istanza dell'oggetto.
 * 
 */