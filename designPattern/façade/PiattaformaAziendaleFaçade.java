package is.designPattern.façade;

import java.util.List;

import is.designPattern.command.*;
import is.designPattern.memento.*;
import is.designPattern.templateMethod.*;

public class PiattaformaAziendaleFaçade {
	//Questa classe rappresenta il nosto Façade, l'interfaccia semplificata
	private GestioneAccesso accessoAzienda; //TemplateMethod
	private BachecaLavorazioni bachecaAziendale; //Command
	private Messaggio quadernoDiCampagna; //Memento
	
	public PiattaformaAziendaleFaçade() {
		quadernoDiCampagna = new Mail();
	}//costruttore
	
	public void avviaLavorazioneEstiva() {
		TecnicoAutorizzato t = new TecnicoAutorizzato();
		accessoAzienda = t;
		accessoAzienda.richiediAccesso();
		
		if ( accessoAzienda.guessEsito() ) {
			Operaio o = new Operaio(t.getNome());
			Aratura a = new Aratura(o);
			Irrigazione b = new Irrigazione(o);
			bachecaAziendale = new BachecaLavorazioni(List.of(b,a));
			
			bachecaAziendale.eseguiLavorazioni();
			
			quadernoDiCampagna.scrivi("Irrigazione & Aratura\n");
		}
		
	}//avviaLavorazione
	
	public void lavorazioniSvolte() {
		System.out.println("Lavorazioni svolte:\n"+quadernoDiCampagna.toString());
	}//lavorazioniSvolte
	
	public void eliminaLavorazione() {
		quadernoDiCampagna.undo();
		lavorazioniSvolte();
	}//eliminaLavorazione
	
	public void avviaIrrigazione() {
		TecnicoAutorizzato t = new TecnicoAutorizzato();
		accessoAzienda = t;
		accessoAzienda.richiediAccesso();
		
		if ( accessoAzienda.guessEsito() ) {
			Operaio o = new Operaio(t.getNome());
			Irrigazione b = new Irrigazione(o);
			bachecaAziendale = new BachecaLavorazioni(b);
			
			bachecaAziendale.eseguiLavorazioni();
			
			quadernoDiCampagna.scrivi("Irrigazione\n");
		}
		
	}//avviaIrrigazione
	
}//PiattaformaAziendaleFaçade