package is.designPattern.command;

public class Irrigazione implements LavorazioneGenerica {
	/*
	 * Questa classe rappresenta il Command concreto
	 * Sarà lei ad informare il Receiver
	 */
	
	private final Operaio o;
	
	public Irrigazione(Operaio in) {
		this.o = in;
	}//Costruttore
	
	@Override
	public void eseguiLavorazione() {
		o.irrigaCampo();
	}//eseguiLavorazione

}//Irrigazione