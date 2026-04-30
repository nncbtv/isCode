package is.designPattern.adapter.adapterProfObject;

public class Segreteria implements Studente{
	private Professore p; //Incapsulo un oggetto di tipo professore dentro l'adapter
	
	public Segreteria() {//Lo istanzio appena chiamano il costruttore dell'adapter
		p=new Professore();
	}
	

	@Override
	public double ritiroVoto() {//Implemento il metodo dell'interfaccia mettendo in comunicazione adapter e adaptee
		return p.daiVoto();
	}//ritiroVoto
	

}//Segreteria

//La classe segreteria è il nostro objectAdapter