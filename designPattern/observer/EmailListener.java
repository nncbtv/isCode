package is.designPattern.observer;

public class EmailListener implements EventListener{
	/*
	 * Questa classe rappresenta gli observer concreti
	 * in base al cambiamento del subject reagiscono di conseguenza
	 */
	
	private final String email;
	
	public EmailListener(String email) {
		this.email = email;
	}//Costruttore
	
	public void update(Eventi x) {
		//Questo sarà il metodo che invierà le mail nel concreto
		if ( x == Eventi.NUOVA_MERCE) {
			System.out.println("Ciao "+email+" il negozio ha nuova merce!");
		}
		if ( x == Eventi.SALDI) {
			System.out.println("Ciao "+email+" ci sono nuove offerte per te!");
		}
	}//update
	
}//EmailListener