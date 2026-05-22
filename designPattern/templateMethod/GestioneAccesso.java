package is.designPattern.templateMethod;

public abstract class GestioneAccesso {
	
	protected static final String AZIENDA_PROVENIENZA = "AllSafe";
	private boolean esito;
	//TEMPLATE METHOD
	public final void richiediAccesso() {
		autenticazione();
		esito = lasciaPassare();
		risposta(esito);
	}//richiediAccesso
	
	//METODI DA DELEGARE
	protected abstract void autenticazione();
	protected abstract boolean lasciaPassare();
	
	//METODI STANDARD NON DA MODIFICARE
	protected final void risposta(boolean esito) {
		if ( esito ) {
			System.out.println("Accesso consentito");
			aperturaVarco();
		}
		else {
			System.out.println("Accesso negato");
		}
	}//risposta
	
	protected final void aperturaVarco() {
		System.out.println("Permessi verificati, autorizzazione consentita, apertura varco...");
	}//aperturaVarco
	
	public boolean guessEsito() {return esito == true;}
}//GestioneAccesso