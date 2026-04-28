package adapterProfObject;

public class Segreteria implements Studente{
	private Professore p;
	
	public Segreteria() {
		p=new Professore();
	}
	

	@Override
	public double ritiroVoto() {
		// TODO Auto-generated method stub
		return p.daiVoto();
	}
	

}
