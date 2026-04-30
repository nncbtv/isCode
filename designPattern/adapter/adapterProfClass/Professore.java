package is.designPattern.adapter.adapterProfClass;

public class Professore {
	
	protected int voto=20;
	
	public int daiVoto() { //Metodo da adattare
		return voto;
	}
}//Professore

//Questa classe è la classe adaptee