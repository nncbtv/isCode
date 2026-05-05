package is.designPattern.visitor;

import java.util.ArrayList;

public class TestVisitor {

	public static void main(String[] args) {
		var l = new ArrayList<Cliente>(); //Lista in cui inserisco i clienti
		Cliente x = new ClienteCivile("Marco", "CS", "1");
		l.add(x);
		Cliente y = new ClienteNegozio("Francesco", "CZ", "2");
		l.add(y);
		Cliente z = new ClienteImprenditore("Cory Chase", "RC", "69"); //;)
		l.add(z);
		Rappresentante rocco = new RappresentanteAssicurazione();
		rocco.visitaClienti(l);
	}//main

}//TestVisitor