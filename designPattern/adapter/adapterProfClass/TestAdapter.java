package is.designPattern.adapter.adapterProfClass;

public class TestAdapter {
	
	public static void main(String[] args) {
		Studente s= new Segreteria(); //Creo uno studente con la sua implementazione concreta
		System.out.println(s.ritiraVoto()); //Invoco il metodo
		//Il metodo invocato verrà chiesto dall'adapter all'adaptee
	}

}//TestAdapter