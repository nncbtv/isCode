package is.designPattern.templateMethod;

import java.util.Scanner;

public class TecnicoAutorizzato extends GestioneAccesso {
	
	private String nome;
	
	private int autorizzazione;
	
	private Scanner s = new Scanner ( System.in );
	
	@Override
	protected void autenticazione() {
		System.out.print("Inserire nome: ");
		this.nome = s.nextLine();
		System.out.print("Inserire codice autorizzazione: ");
		this.autorizzazione = s.nextInt();
		if ( nome.isBlank() ) {
			System.out.println("Errore nell'inserimento dati");
		}
	}//autenticazione

	@Override
	protected boolean lasciaPassare() {
		if (autorizzazione<=0) return false;
		return true;
	}//lasciaPassare
	
}//TecnicoAutorizzato
