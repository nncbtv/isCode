package is.designPattern.Proxy;

import java.util.*;

public class ProxyArchivioDocumenti implements ArchivioDocumenti {

	/*
	 * Proxy nel design pattern proxy, esso gestirà gli accessi
	 * ai documenti aziendali della allSafe, chiedendo per ogni
	 * operazione di autenticarsi e validerà o meno l'accesso
	 */
	private ArchivioConcreto archivio;
	private List<String> dipendenti;
	private List<String> admin;
	private boolean utenteDipendente = false;
	private boolean utenteAdmin = false;
	public ProxyArchivioDocumenti(String utente) {
		this.archivio = new ArchivioConcreto();
		this.dipendenti = new ArrayList<>();
		this.admin = new ArrayList<>();
		admin.add("Benito");
		admin.add("Ivang");
		dipendenti.add("Matteo");
		dipendenti.add("Rocco");
		dipendenti.add("Francesca");
		if ( dipendenti.contains(utente) )  utenteDipendente = true;
		if ( admin.contains(utente) )  utenteAdmin = true;
	}//Costruttore
	
	@Override
	public void stampaDocumento(String doc) {
		if ( utenteDipendente ) //Controllo Accesso
			archivio.stampaDocumento(doc);
		else
			System.out.println("Non hai accesso a questa risorsa");
	}//stampaDocumento

	@Override
	public String getDocumento(String doc) {
		if ( utenteAdmin )
			return archivio.getDocumento(doc);
		else
			System.out.println("Non sei un amministratore!");
		return null;
	}//getDocumento

	@Override
	public void eliminaDocumento(String doc) {
		if ( utenteAdmin )
			archivio.eliminaDocumento(doc);
		else
			System.out.println("Non sei un amministratore!");
	}//eliminaDocumento

	@Override
	public void addDocumento(String nomeDoc, String doc) {
		if ( utenteAdmin )
			archivio.addDocumento(nomeDoc, doc);
		else
			System.out.println("Non sei un amministratore!");
	}//addDocumento
	
}//ProxyArchivioDocumenti
