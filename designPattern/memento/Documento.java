package is.designPattern.memento;

public class Documento {
	//variabile privata incapsulata nell'oggetto
	private String testo = "";
	
	public void aggiungiTesto(String s) {
		this.testo= this.testo+s;
	}//aggiungiTesto
	
	//Salvataggio di stato con il memento
	public Object salvaStato() {
		return new Memento(this.testo);
	}//Creazione di un nuovo memento, backup stato
	
	public void ricostruisci(Object stato) {
		Memento m = (Memento) stato; //Casting
		this.testo = m.getSavedString();
	}//Ricostruzione dal memento
	
	public String toString() {
		return testo;
	}//toString
	
	private static class Memento{
		//Tutti i dati dell'oggetto da salvare
		private final String testo; 
		/*
		 * Costruttore privato del memento,
		 * esso concretamente salva i dati dell'oggetto
		 * in questo caso solo la variabile string
		 */
		private Memento(String testoBackup) {
			this.testo = testoBackup;
		}
		//Metodo get per la ricostruzione dei dati
		private String getSavedString() {
			return testo;
		}
	}//Memento
	
}//Documento