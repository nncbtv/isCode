package is.designPattern.bridge;

public class PizzaCaprese extends Pizza{
	@Override
	public void prepara() {
		System.out.println("Metto: "+ingredienti);
		System.out.println("Aggiungo in più: "+ingredienteExtra);
		System.out.println("Per finire: Pomodorini Pachino e Mozzarella");
	}
	@Override
	public void inforna() {
		System.out.println("Sto infornando nel: "+cottura);
	}
}//PizzaCaprese