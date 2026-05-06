package is.designPattern.observer;

public class MobileAppListener implements EventListener {

private final String username;
	
	public MobileAppListener(String username) {
		this.username = username;
	}//Costruttore
	
	@Override
	public void update(Eventi x) {
		//Questo sarà il metodo che invierà le notifiche nel concreto
		if ( x == Eventi.NUOVA_MERCE) {
			System.out.println("Ciao "+username+" il negozio ha nuova merce!");
		}
		if ( x == Eventi.SALDI) {
			System.out.println("Ciao "+username+" ci sono nuove offerte per te!");
		}
		
	}//update

}//MobileAppListener