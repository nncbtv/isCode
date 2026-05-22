package is.designPattern.façade;

public class TestFaçade {

	public static void main (String[] args) {
		PiattaformaAziendaleFaçade f = new PiattaformaAziendaleFaçade();
		System.out.println("Piattaforma per la gestione dei compiti aziendali");
		f.avviaLavorazioneEstiva();
		System.out.println("\nAvvio un altro compito sulla mia azienda");
		f.avviaIrrigazione();
		System.out.println("\nChiedo alla piattaforma cosa hanno fatto i miei dipendenti\n");
		f.lavorazioniSvolte();
		System.out.println("Devo eliminare una lavorazione\n");
		f.eliminaLavorazione();
	}//main
	
}//TestFaçade