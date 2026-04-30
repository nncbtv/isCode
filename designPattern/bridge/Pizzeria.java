package is.designPattern.bridge;

//Questa classe mi fa esattamente da bridge verso le metodologie di preparazione, è una pizzeria generica
public abstract class Pizzeria { 
	protected Pizza pizza; //Voglio creare una pizza senza sapere il metodo di preparazione
	
	public Pizzeria (Pizza pizzaIn) { //Prendo la pizza che mi hanno passato nelle pizzerie specifiche
		this.pizza = pizzaIn;
	}
	//Questi 3 metodi cambiano in base alla preparazione, ognuno le implementa in modo diverso
	abstract void addIngredienti();
	abstract void addIngredienteExtra();
	abstract void setMetodoCottura();
	/* Un  ordine di una pizza si evade sempre nello stesso modo, inserisco gli ingredienti di base, quelli extra e
	 * decido il metodo di cottura prima di preparare tutto ed infornare
	 */
	public void ordinePizza() {
		System.out.println("Stiamo preparando la tua pizza :)");
		//Sistemo gli ingredienti e i metodi di cottura in base alla pizzeria, ognuna fa a modo suo
		addIngredienti();
		addIngredienteExtra();
		setMetodoCottura();
		//Avvio preparazione e infornata della pizza che mi hanno passato
		pizza.prepara();
		pizza.inforna();
	}
	
}//Pizzeria