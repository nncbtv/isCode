package is.designPattern.bridge;

public class PizzeriaAmericana extends Pizzeria{

	public PizzeriaAmericana(Pizza pizzaIn) { //Ricevo un tipo di pizza da produrre
		super(pizzaIn); //La rimando al metodo bridge
	}
	//Faccio gli override del metodo bridge perchè la voglio comporre con il metodo americano
	@Override
	void addIngredienti() {
		pizza.setIngredienti("Olio");
	}
	@Override
	void addIngredienteExtra() {
		pizza.setIngredienteExtra("Salsa segreta");
	}
	@Override
	void setMetodoCottura() {
		pizza.setCottura("Forno elettrico");
	}
	
}//PizzeriaAmericana