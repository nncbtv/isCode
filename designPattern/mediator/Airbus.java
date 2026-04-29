package is.designPattern.mediator;

public class Airbus extends Volo{

	public Airbus(Aeroporto aeroporto, String numeroVolo) {
		super(aeroporto, numeroVolo);
	}//Costruttore
	
	public void atterraggio() {
		System.out.println("Airbus "+numeroVolo+": Procedo ad atterrare");
		aeroporto.richiediAtterraggio(this); //Informo il mediator, quello astratto
	}//atterraggio

	@Override
	public void restaInAttesa() {
		System.out.println("Airbus "+numeroVolo+": Ricevuto, resto in attesa che la pista si liberi");		
	}//stop

	
}//Airbus
