package is.designPattern.memento;

public class Documento {
	//variabile privata incapsulata nell'oggetto
	private String testo = "Gentilissimo Matteo, oggi devo ricordarti del ";
	
	public void aggiungiTesto(String s) {
		this.testo= this.testo+s;
	}//aggiungiTesto
	
	public String toString() {
		return testo;
	}//toString
	
}//Documento