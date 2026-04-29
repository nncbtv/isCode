package is.designPattern.mediator;

public class SimulazioneAtterraggi {
	
	public static void main(String[] arg) {
		Aeroporto linate = new TorreControllo(); //Inizializzo il mediator
		Airbus a1 = new Airbus(linate, "Lamezia-Linate"); //Creo un nuvo volo da 2 oggetti diversi
		Boeing a2 = new Boeing(linate, "Londra-Linate");
		//Proviamo a farli atterrare, simuliamo che a1 arrivi prima e a2 dopo
		a1.atterraggio();
		a2.atterraggio();
	}//main
	
}//SimulazioneAtterraggi
