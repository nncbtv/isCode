package is.designPattern.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServizioMail {
	/*
	 * Questa classe sarà il nostro observer che notifica gli observer concreti
	 */
	private final Map<Eventi, List<EventListener>> clienti; 
	
	public ServizioMail() { //
		clienti = new HashMap<>();
		/*
		 * Lambda Expressions per popolare la mappa con gli eventi e una lista vuota
		 * Arrays.stream trasforma i campi dell'enum in un array iterabile con foreach
		 * Il foreach inserisce il valore x dell'enum come chiave nella mappa
		 */
		Arrays.stream(Eventi.values()).forEach(x -> clienti.put(x, new ArrayList<>()));
	}//ServizioMail
	
	public void iscrizione(Eventi x, EventListener l) {
		clienti.get(x).add(l); //Aggiungo un observer concreto all'evento x
	}//iscrizione
	
	public void disiscrizione(Eventi x, EventListener l) {
		clienti.get(x).remove(l); //Rimuovo un observer concreto
	}//disiscrizione
	
	public void invia(Eventi x) {
		/*
		 * Questo metodo notifica ogni observer concreto
		 * Chiamando per ognuno di essi il metodo update
		 * Tramite un foreach scritto in lamda expressions
		 * Richiamo tutti gli observer nella lista dell'evento x della mappa
		 * Passo anche l'evento così da far capire agli observer come muoversi
		 */
		clienti.get(x).forEach(y -> y.update(x));
	}//Invia

}//ServizioMail