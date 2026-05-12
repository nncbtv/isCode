package is.designPattern.memento;

public class TestMemento {
	
	public static void main(String[] arg) {
		/*********************************IMPLEMENTAZIONE GOF************************************/
		/*//Creo i due oggetti
		Documento letteraMatteo = new Documento();
		ArchivioBozze bozza = new ArchivioBozze();
		
		//Modifico il nostro originator
		String intro = "Ciao Matteo, riguardo i tuoi UML";
		letteraMatteo.aggiungiTesto(intro);
		System.out.println(letteraMatteo.toString());
		
		//Salvo lo stato prima della nuova modifica
		Object stato = letteraMatteo.salvaStato(); //Memento
		bozza.aggiungi(stato); //Aggiunta al caretaker
		
		//Modifico
		String paragrafo = ", sembrano un po' orrendi";
		letteraMatteo.aggiungiTesto(paragrafo);
		System.out.println(letteraMatteo.toString());
		
		//Torno allo stato precednete, midifiche errate
		Object statoPrec = bozza.prendi(); //Chiedo al caretaker
		letteraMatteo.ricostruisci(statoPrec); //Ricostruisco
		System.out.println(letteraMatteo.toString());
		
		//Ultima modifica
		String paragrafo2 = ", sono strepitosi!";
		letteraMatteo.aggiungiTesto(paragrafo2);
		System.out.println(letteraMatteo.toString());*/
		
		/*******************************************ESEMPIO INTERFACCIA****************************/
		Messaggio lamentelaMatteo = new Mail();
		lamentelaMatteo.scrivi("Ciao Matteo, riguardo i tuoi UML");
		lamentelaMatteo.scrivi(", sono orrendi!");
		//Tolgo l'ultima modifica
		lamentelaMatteo.undo();
		//Rimodifico
		lamentelaMatteo.scrivi(", sono stupendi!");
	}//main

}//TestMemento