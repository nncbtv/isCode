package is.designPattern.FactoryMethod;

public interface Notifica { //Product (decide cosa fare, in questo caso di inviare una notifica)
	void invia();        	// metodo per inviare una notifica 
							// che poi potra essere di un qualsiasi tipo
}//Notifica