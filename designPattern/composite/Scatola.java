package is.designPattern.composite;

public interface Scatola {
	
	public double calcolaPrezzo(); //Metodo comune in tutto l'albero

}//Scatola

//Questa interfaccia rappresenta l'attore component nel design pattern
//Tutti la devono implementare per creare l'albero e gestire il tutto tramite essa
//Il Client vedrà questa interfaccia dall'esterno credendo di lavorare su un solo oggetto e non multipli come in realtà