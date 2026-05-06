package is.designPattern.visitor;

public class ClienteCivile extends Cliente{
	
	/*
	 * Classe concreta della nostra struttura, essa si deve far visitare
	 */

	public ClienteCivile(String nomeIn, String indirizzoIn, String numeroIn) {
		super(nomeIn, indirizzoIn, numeroIn);
	}//Costruttore della superclasse

	@Override
	public void accettaVisita(Rappresentante x) {
		x.visita(this);
	}//accettaVisita

}//ClienteCivile