package is.designPattern.adapter.ChainOfResponsability;

public class ConcreteHandler2 extends Handler {//Handler successivo che prova a soddfisfare la richiesta 
	 @Override
	    public void handleRequest(int request) {  
	        if (request > 10) {
	            System.out.println("ConcreteHandler2 gestisce la richiesta: " + request);
	        }       
	        else if (successor != null) { // Se non può gestirla, la passa avanti(in questo caso nessuno è in grado di gestirla).
	            successor.handleRequest(request);
	        }
	    }
}
