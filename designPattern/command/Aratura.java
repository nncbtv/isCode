package is.designPattern.command;

public class Aratura implements LavorazioneGenerica {
	
	private final Operaio o;
	
	public Aratura(Operaio in) {
		this.o = in;
	}//Costruttore
	
	@Override
	public void eseguiLavorazione() {
		o.araCampo();
	}//eseguiLavorazione

}//Aratura