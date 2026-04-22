package is.designPattern.bridge;

public abstract class Pizza {
	//Rappresentazione astratta dell'ogetto concreto pizza tramite le sue variabili e metodi
	protected String ingredienti = "Base Bianca";
	protected String ingredienteExtra = "Nessuno";
	protected String cottura = "Al forno";
	
	public void setIngredienti(String ingredientiIn) {
		this.ingredienti = ingredientiIn;
	}
	
	public void setIngredienteExtra(String ingredienteExtraIn) {
		this.ingredienteExtra = ingredienteExtraIn;
	}
	
	public void setCottura(String cotturaIn) {
		this.cottura = cotturaIn;
	}
	
	public abstract void inforna();
	public abstract void prepara();
	
}//Pizza