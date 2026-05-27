package is.designPattern.ChainOfResponsability;

public class ConcreteHandler2 extends Handler {//Handler successivo che prova a soddfisfare la richiesta 
	
	//Per il setting dell successore uso il metodo della classe astratta
	
	 @Override
	    public void handleRequest(int request) {  
	        if (request > 10) {
	            System.out.println("ConcreteHandler2 gestisce la richiesta: " + request);
	        }       
	        else { // Se non può gestirla, la passa avanti(in questo caso nessuno è in grado di gestirla).
	            successor.handleRequest(request);
	        }
	    }
}
