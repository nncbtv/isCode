package is.designPattern.command;

public class Operaio{
	/*
	 * Questa classe è il Receiver, sarà lei a svolgere le operazioni
	 */
	private final String nome;
	
	public Operaio(String nomeIn) {
		this.nome = nomeIn;
	}//Costruttore
	
	public void irrigaCampo() {
		System.out.println("Sono: "+nome+", sto irrigando il campo fino alle 23");
	}//irrigaCampo
	
	public void araCampo() {
		System.out.println("Sono: "+nome+", sto arando il campo");
	}//araCampo

}//Operaio