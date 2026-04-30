package is.designPattern.adapter.adapterProfObject;

public class TestAdapter {
	
	public static void main(String[] args) {
		Studente s= new Segreteria();
		System.out.print(s.ritiroVoto()); 
		//Chiamo sull'interfaccia il metodo che ha implementato l'adapter, per comunicare con l'adaptee
	}

}//TestAdapter