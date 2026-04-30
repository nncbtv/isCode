package is.designPattern.mediator;

public abstract class Volo {
	protected Aeroporto aeroporto; //Cerco di comunicare tramite il mediatore astratto con la torre di controllo
	protected String numeroVolo;

	public Volo (Aeroporto aeroporto, String numeroVolo) {
		this.aeroporto = aeroporto;
		this.numeroVolo = numeroVolo;
	}//Costruttore per il volo, passo l'aeroporto su cui atterare che mi fa da tramite per la torre di controllo
	
	public abstract void restaInAttesa(); //Metodo per rimanere in attesa per pista occupata
	
}//Volo
/*
 * Questa classe verrà implementata dai Colleague del design pattern.
 * 
 */