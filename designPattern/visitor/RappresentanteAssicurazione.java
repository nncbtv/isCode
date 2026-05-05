package is.designPattern.visitor;

import java.util.List;

public class RappresentanteAssicurazione implements Rappresentante {

	/*
	 * Visitor concreto che in base alla classe concreta userà uno dei suoi metodi
	 */
	
	public void visitaClienti (List<Cliente> clienti) {
		for ( Cliente x : clienti) {
			x.accettaVisita(this);
			//Siccome non conosco il tipo di classe concreta lascio alla stessa la scelta del suo metodo di visita
		}
	}//Avvio visita
	
	@Override
	public void visita(ClienteNegozio cn) {
		System.out.println("Sto proponendo la polizza furti ad un negoziante ("+cn.getNome()+")");
	}//visitClienteNegozio

	@Override
	public void visita(ClienteImprenditore ci) {
		System.out.println("Sto proponendo la polizza incendio ad un imprenditore ("+ci.getNome()+")");
	}//visitClienteImprenditore

	@Override
	public void visita(ClienteCivile cv) {
		System.out.println("Sto propronendo la polizza vita ad un cliente ("+cv.getNome()+")");
	}//visitClienteCivile

}//RappresentanteAssicurazione