package is.designPattern.Proxy;

import java.util.Scanner;

public class TestProxy {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.print("Benvenuto utente\nInserisci nome: ");
		String utente = input.nextLine();
		ArchivioDocumenti allSafe = new ProxyArchivioDocumenti(utente);
		allSafe.addDocumento("Segreto3", "Matteo in realtà si chiama Rocco");
		allSafe.eliminaDocumento("Segreto3");
		allSafe.stampaDocumento("Segreto1");
		input.close();
	}//main
}//TestProxy