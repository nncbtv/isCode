package is.designPattern.adapter.adapterProfClass;

public class Segreteria extends Professore implements Studente{
	
	@Override
	public double ritiraVoto() {		
		return daiVoto(); //Usol il metodo della classe professore
	}

}//Questa classe è l'adapter, fa comunicare l'interfaccia studente con la classe proffessore
