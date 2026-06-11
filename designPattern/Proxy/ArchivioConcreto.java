package is.designPattern.Proxy;

import java.util.HashMap;
import java.util.Map;

public class ArchivioConcreto implements ArchivioDocumenti {
	//Questa classe non è al corrente della gestione accessi del proxy
	private Map<String, String> fascicolo;

	public ArchivioConcreto() {
		this.fascicolo = new HashMap<>();
		//Inserisco dei piccoli "file" per gestire l'esempio
		fascicolo.put("Segreto2", "Le gocciole pavesi sono dei biscotti buonissimi");
		fascicolo.put("Segreto1", "Mi piacciono gli unicorni verdi");
	}//costruttore semplice
	
	@Override
	public void stampaDocumento(String doc) {
		System.out.println("Stampo: "+doc+"\n"+fascicolo.get(doc).toString());
	}//stampaDocumento

	@Override
	public String getDocumento(String doc) {
		System.out.println("Documento: "+doc+" richiesto");
		return fascicolo.get(doc);
	}//getDocumento

	@Override
	public void eliminaDocumento(String doc) {
		System.out.println("Eliminazione documento: "+doc);
		fascicolo.remove(doc);
	}//eliminaDocumento

	@Override
	public void addDocumento(String nomeDoc, String doc) {
		System.out.println("Aggiunta documento: "+nomeDoc);
		fascicolo.put(nomeDoc, doc);
	}//addDocumento

}//ArchivioConcreto
