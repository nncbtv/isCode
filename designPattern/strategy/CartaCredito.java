package is.designPattern.strategy;

import java.util.Scanner;

public class CartaCredito implements MetodiPagamento {

	private String nome, cognome, nCarta, dataScadenza, cvv;
	private Scanner in = new Scanner(System.in);
	
	@Override
	public void chiediDati() {
		System.out.print("Inserire nome: ");
		nome = in.nextLine();
		System.out.print("Inserire cognome: ");
		cognome = in.nextLine();
		System.out.print("Inserire numero carta: ");
		nCarta = in.nextLine();
		System.out.print("Inserire data di scadenza: ");
		dataScadenza = in.nextLine();
		System.out.print("Inserire cvv: ");
		cvv = in.nextLine();
		in.close();
	}//chiediDati

	@Override
	public boolean controlloDati() {
		if ( nome.isBlank() || cognome.isBlank() || nCarta.isBlank() || dataScadenza.isBlank() || cvv.isBlank() ) {
			return false;
		}
		return true;
	}//ControlloDati

	@Override
	public void paga(int totale) {
		System.out.println("Stai pagando: "+totale+"€");
	}//paga

}//CartaCredito