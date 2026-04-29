package is.designPattern.builder;

public abstract class PreparazioneMenu {
	Menu menu = new Menu(); //Creazione di un istanza dell'oggetto
	//Fornisco i metodi e le linee guida che ogni builder deve rispettare
	abstract void buildAntipasto();
	abstract void buildPrimo();
	abstract void buildSecondo();
	abstract void buildDolce();
	//Ritorno dell'oggetto
	public Menu build() {
		return menu;
	}//Menu
	
}//PreparazioneMenu