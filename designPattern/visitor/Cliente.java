package is.designPattern.visitor;

public abstract class Cliente {

	/*
	 * Questa interfaccia modella le entità concrete e delega l'accettazione visita
	 * Crea i campi per individuare ogni classe concreta ed espone il metodo da implementare
	 * Questa classe può esserci oppure no
	 */
	private final String nome;
	private final String indirizzo;
	private final String numero;
	
	public Cliente(String nomeIn, String indirizzoIn, String numeroIn) {
		this.nome = nomeIn;
		this.indirizzo = indirizzoIn;
		this.numero = numeroIn;
	}//Costruttore

	public abstract void accettaVisita(Rappresentante x);
	
}//Cliente