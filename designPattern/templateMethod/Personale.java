package is.designPattern.templateMethod;

import java.util.Scanner;

public class Personale extends GestioneAccesso {
	
	private String nome, cognome, provenienza;
	
	private Scanner sc = new Scanner ( System.in );

	
	@Override
	protected void autenticazione() {
		System.out.print("Inserire nome: ");
		this.nome = sc.nextLine();
		System.out.print("Inserire cognome: ");
		this.cognome = sc.nextLine();
		System.out.print("Inserire nome azienda: ");
		this.provenienza = sc.nextLine();
		if ( nome.isBlank() || cognome.isBlank()  || provenienza.isBlank() ) {
			System.out.println("Errore nell'inserimento dati");
		}
	}//autenticazione

	@Override
	protected boolean lasciaPassare() {
		if (provenienza.equals(AZIENDA_PROVENIENZA)) return true;
		//Passa solo il personale della mia azienda
		return false;
	}//lasciaPassare

}//GestioneAccesso