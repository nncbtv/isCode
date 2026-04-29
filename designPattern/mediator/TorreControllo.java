package is.designPattern.mediator;

import java.util.ArrayList;

public class TorreControllo implements Aeroporto {
	
	private ArrayList<Volo> voli = new ArrayList<Volo>(); //Lista in cui conservo i voli
	private boolean pistaVuota = true;

	@Override
	public void registraVolo(Volo voloIn) {
		this.voli.add(voloIn);//Aggiungo il volo che mi è stato passato alla lista
	}//regsitraVolo

	@Override
	public void richiediAtterraggio(Volo voloIn) {
		if (pistaVuota) {
			System.out.println("TORRE: La pista è libera, "+voloIn.numeroVolo+" richiesta accettata");
			pistaVuota = false; //La pista è occupata fin quando non attera il volo
		}else {
			System.out.println("TORRE: Richiesta negata, pista occupata");
			voloIn.restaInAttesa(); //Mando l'aereo in attesa per la pista
		}
	}//richiediAtterraggio

}//TorreControllo, mediator concreto