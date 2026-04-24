package is.designPattern.builder;

public class Menu {

	private String Antipasto = "Nessun Antipasto";
	private String Primo = "Nessun Primo";
	private String Secondo = "Nessun Secondo";
	private String Dolce = "Nessun dolce";
	
	public void setAntipasto(String cibo) {
		this.Antipasto = cibo;
	}//setAntipasto
	
	public void setPrimo(String cibo) {
		this.Primo = cibo;
	}//setPrimo
	
	public void setSecondo(String cibo) {
		this.Secondo = cibo;
	}//setSecondo
	
	public void setDolce(String cibo) {
		this.Dolce=cibo;
	}//setDolce
	
	public void printMenu() {
		System.out.println("Il menu comprende:\n"+Antipasto+", "+Primo+", "+Secondo+", "+Dolce);
	}//printMenu
	
	
}//Menu