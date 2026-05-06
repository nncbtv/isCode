package is.designPattern.observer;

public class Negozio {
	/*
	 * Classe subject concreta che notifica i suoi observer
	 * In questo esempio il negozio notifica i suoi clienti
	 */

	private final ServizioMail newsLetter; //Observer
	
	public Negozio() {//Inizializzo l'observer quando creo il subject
		newsLetter = new ServizioMail();
	}//Costruttore
	
	public void notifica(Eventi x) {
		newsLetter.invia(x);
	}

	public ServizioMail getServizioMail() {//Metodo per ritorno observer
		return newsLetter;
	}//ServizioMail
	
}//Negozio