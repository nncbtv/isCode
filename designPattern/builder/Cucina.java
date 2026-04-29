package is.designPattern.builder;

public class Cucina {
	//Chiamo uno chef, builder generico che segue le istruzioni per la preparazione del menù
	private PreparazioneMenu chef; 
	//Metodo per impostare quale builder deve costruire il menù
	public void setBuilder(PreparazioneMenu chefIn) {
		this.chef = chefIn;
	}
	//Chiamate ai metodi concreti per la costruzione
	public Menu buildMenu() {
		chef.buildAntipasto();
		chef.buildPrimo();
		chef.buildSecondo();
		chef.buildDolce();
		return chef.build();
	}
	
}//Cucina

/*
 * 	La classe cucina è il director nel nostro design pattern, essa mette in comunicazione il cliente con i builder concreti
 * 	passando prima per l'interfaccia che imposta tutti i metodi di creazione ridefiniti da ogni builder concreto.
 */