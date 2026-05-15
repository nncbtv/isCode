package is.designPattern.strategy;

import java.util.Scanner;

public class PayPal implements MetodiPagamento {

	private String nome, cognome, mail;
	private Scanner in = new Scanner(System.in);
	
	@Override
	public void chiediDati() {
		System.out.print("Inserire nome: ");
		nome = in.nextLine();
		System.out.print("Inserire cognome: ");
		cognome = in.nextLine();
		System.out.print("Inserire mail: ");
		mail = in.nextLine();
		in.close();
	}//chiediDati

	@Override
	public boolean controlloDati() {
		if ( nome.isBlank() || cognome.isBlank() || mail.isBlank() ) {
			return false;
		}
		return true;
	}//controlloDati

	@Override
	public void paga(int totale) {
		System.out.print("Stai pagando: "+totale+"€");
	}//paga

}//PayPal