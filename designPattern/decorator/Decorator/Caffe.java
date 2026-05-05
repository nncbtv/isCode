package Decorator;

public class Caffe implements Bevanda{ //rappresenta un servizio base del componente (viene utilizzato sempre).
	 @Override
	    public String descrizione() {
	        return "Caffe";
	    }

	    @Override
	    public double costo() {
	        return 1.00;
	    }

}
