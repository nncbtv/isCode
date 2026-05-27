package is.designPattern.ChainOfResponsability;

public abstract class Handler {//Colui che definisce la base per chi è in grado di soddisfare la richiesta
	 protected Handler successor;

	    public void setSuccessor(Handler successor) {//Serve ad indirizzare la richiesta ad un handler successivo in grado di soddisfarla
	    		if (successor != null) {
	    			this.successor = successor;
	    		}
	    		else {
	    			System.out.println("Passare un riferimento valido");
	    		}
	    }
	    public abstract void handleRequest(int request);// metodo che inoltra la richiesta
}
