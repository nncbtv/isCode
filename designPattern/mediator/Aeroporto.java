package is.designPattern.mediator;

public interface Aeroporto {//Interefaccia del Medaitor che espone le operazioni da implementare

	void registraVolo(Volo voloIn);
	void richiediAtterraggio(Volo voloIn);
	
}//Aeroporto
/*
 * Questa Classe è il partecipante mediator nel design pattern, non è quello concreto.
 * Il concreto sarà la torre di controllo.
 */