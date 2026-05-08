package is.designPattern.command;

import java.util.ArrayList;
import java.util.List;

public class BachecaLavorazioni {
	/*
	 * Questa classe rappresenta il mio invoker
	 * Essa tiene conto dei comandi lanciati
	 */

	private final List<LavorazioneGenerica> lavoriSvolti = new ArrayList<>();
	//Questa lista mi serve per tenere conto della lavorazioni, dalla più recente alla meno
	
	public BachecaLavorazioni(LavorazioneGenerica l) {
		this.lavoriSvolti.add(l); //Aggiungo la lavorazione
	}//Costruttore di base
	
	public BachecaLavorazioni(List<LavorazioneGenerica> l) {
		this.lavoriSvolti.addAll(l);
	}//Overload del costruttore
	
	public void eseguiLavorazioni() {
		for ( LavorazioneGenerica x : lavoriSvolti ) {
			x.eseguiLavorazione(); //Non so però che tipo di lavorazione andrò a fare
		}
	}//Metodo per la richiesta di esecuzione comandi (Lavorazioni)
	
}//BachecaLavorazioni