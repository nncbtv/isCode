package is.designPattern.observer;

public class TestObserver {
	
	public static void main(String[] args) {
		Negozio matteoElettronics = new Negozio(); //Inizializzo il subject
		//Ora imposto un nuovo observer concreto al subject per la merce nuova notificato via mail
		matteoElettronics.getServizioMail().iscrizione(Eventi.NUOVA_MERCE,new EmailListener("benito@nanci.it"));
		//Ora imposto un nuovo observer concreto al subject per i saldi notificato via app
		matteoElettronics.getServizioMail().iscrizione(Eventi.SALDI,new MobileAppListener("nncbtv"));
		//Postrei aggiungerne tranquillamente altri con la stessa riga di codice
		System.out.println("Il camion sta scaricando la merce");
		//Decido dopo lo scarico di informare tutti i miei clienti (observer)
		matteoElettronics.notifica(Eventi.NUOVA_MERCE);
		System.out.println("Decido di mettere in saldo la vecchia merce");
		matteoElettronics.notifica(Eventi.SALDI);
	}//main

}//TestObserver