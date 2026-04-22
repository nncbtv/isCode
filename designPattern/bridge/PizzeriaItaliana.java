package is.designPattern.bridge;

public class PizzeriaItaliana extends Pizzeria{

	public PizzeriaItaliana(Pizza pizzaIn) {
		super(pizzaIn); //La rimando al metodo bridge
	}
	
	//Faccio l'override dei metodi del bridge per comporla in stile italiano
	@Override
	void addIngredienti() {
		pizza.setIngredienti("Olio e salsa di pomodoro");
	}
	@Override
	void addIngredienteExtra() {
		pizza.setIngredienteExtra("Basilico");
	}
	@Override
	void setMetodoCottura() {
		pizza.setCottura("Forno a legna");
	}
	
}//PizzeriaItaliana