package is.designPattern.memento;

public class Mail implements Messaggio {
	
	private Documento doc;
	private ArchivioBozze bozza;
	
	public Mail() {
		doc = new Documento();
		bozza = new ArchivioBozze();
	}//Costruttore

	@Override
	public void scrivi(String testo) {
		//Salvo lo stato
		Object currentState = doc.salvaStato();
		bozza.aggiungi(currentState);
		//Modifico lo stato attuale
		doc.aggiungiTesto(testo);
		//System.out.println(doc.toString()); //Do l'oggetto
	}//scrivi

	@Override
	public void undo() {
		Object statoPrec = bozza.prendi(); //Chiedo lo stato
		doc.ricostruisci(statoPrec); //Riscotruisco
		//System.out.println(doc.toString()); //Do l'oggetto
	}//undo

	public String toString() {
		return doc.toString();
	}//toString
	
}//Mail