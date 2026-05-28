package is.designPattern.decorator;

public class Client {
	 public static void main(String[] args) {
	        Bevanda b1 = new Caffe(); //Componente base
	        System.out.println(b1.descrizione() + " -> " + b1.costo());

	        Bevanda b2 = new Latte(new Caffe()); //Aggiunta latte al componente base
	        System.out.println(b2.descrizione() + " -> " + b2.costo());
	        
	        Bevanda b3 = new Zucchero(new Caffe()); //Aggiunta caffe
	        System.out.println(b3.descrizione() + " -> " + b3.costo());

	        Bevanda b4 = new Zucchero(new Latte(new Caffe())); //Aggiunta latte e zucchero
	        System.out.println(b4.descrizione() + " -> " + b4.costo());
	        
	        
	    }
}
