package is.designPattern.composite;

public class Cellulare extends Prodotto{ //Deve estendere prodotto per diventare parte dell'albero

	public Cellulare(String nomeIn, double prezzoIn) {
		super(nomeIn, prezzoIn);
	}//Costruttore

}//Cellulare

//Concretamente esso è il nostro prodotto, cioè l'oggetto concreto che insieme agli altri crea l'albero