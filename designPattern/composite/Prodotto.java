package is.designPattern.composite;

public abstract class Prodotto implements Scatola {
	//Protette per avere visibilità package e classi figlie, final perché una volta assegnate restano quelle
	protected final String nome;
	protected final double prezzo;

	public Prodotto(String nomeIn, double prezzoIn) {
		this.nome = nomeIn;
		this.prezzo = prezzoIn;
	}//Costruttore per le sottoclassi
	
	@Override
	public double calcolaPrezzo() {
		return prezzo;
	}//Metodo che mi restituisce il prezzo di uno specifico prodotto

}//Prodotto

//Questa è la nostra foglia nel nostro albero.