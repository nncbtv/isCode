package is.designPattern.bridge;

public class PizzaWrustel extends Pizza{

	@Override
	public void prepara() {
		System.out.println("Metto: "+ingredienti);
		System.out.println("Aggiungo: "+ingredienteExtra);
		System.out.println("Per finire: Wrustel e patatine");
	}
	
	@Override
	public void inforna() {
		System.out.println("Sto infornado nel: "+cottura);	
	}
	
}//PizzaWrustel