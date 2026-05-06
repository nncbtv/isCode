package is.designPattern.visitor;

import java.util.List;

public interface Rappresentante { 
	/*
	 * Questo è il nostro visitor astratto
	 * Questa interfaccia definisce i metodi che devono implementare i visitor concreti
	 * In questo caso il nostro visitor concreto sarà uno per tutte le classi concrete
	 * Stesso metodo ma faccio overloading, se non è possibile fare overloading creo
	 * metodi con nomi diversi
	 */
	void visitaClienti(List<Cliente> l);
	void visita(ClienteCivile cv);
	void visita(ClienteNegozio cn);
	void visita(ClienteImprenditore ci);

}//Rappresentante