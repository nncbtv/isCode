package is.designPattern.mediator;

public class Boeing extends Volo {

	public Boeing(Aeroporto aeroporto, String numeroVolo) {
		super(aeroporto, numeroVolo);
	}//Costruttore
	
	public void atterraggio() {
		System.out.println("Boeing "+numeroVolo+": Procedo ad atterrare");
		aeroporto.richiediAtterraggio(this); //Informo il mediator, quello astratto
	}//atterraggio

	@Override
	public void restaInAttesa() {
		System.out.println("Boeing "+numeroVolo+": Ricevuto, resto in attesa che la pista si liberi");		
	}//stop

}//Boeing