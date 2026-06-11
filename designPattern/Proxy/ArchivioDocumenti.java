package is.designPattern.Proxy;

public interface ArchivioDocumenti {

	//subject design pattern proxy
	//Il Client vedrà soltanto questi metodi
	
	void stampaDocumento(String doc);
	String getDocumento(String doc);
	void eliminaDocumento(String doc);
	void addDocumento(String nomeDoc, String doc);
	
}//ArchivioDocumenti