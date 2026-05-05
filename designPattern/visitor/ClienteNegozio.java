package is.designPattern.visitor;

public class ClienteNegozio extends Cliente{

	public ClienteNegozio(String nomeIn, String indirizzoIn, String numeroIn) {
		super(nomeIn, indirizzoIn, numeroIn);
	}//Costruttore della superclasse

	@Override
	public void accettaVisita(Rappresentante x) {
		x.visita(this);
	}//accettaVisita

}//ClienteNegozio