package is.designPattern.command;

import java.util.List;

public class TestCommand {
	public static void main(String[] arg) {
		Operaio matteo = new Operaio("Matteo"); //Questo è il receiver
		Operaio benito = new Operaio("Benito");
		Aratura a = new Aratura(benito); //Creo una lavorazione
		//Passo come parametro i receiver per indicare quale classe sa fare il comando
		Irrigazione b = new Irrigazione(matteo);
		//Ora gli passo all'invoker
		BachecaLavorazioni bl = new BachecaLavorazioni(List.of(a,b));
		//Chiedo all'invoker di inviare una richiesta di esecuzione ai receiver
		bl.eseguiLavorazioni();
		//Non so cosa e come eseguiranno il comando i receiver
	}//main
}//TestCommand