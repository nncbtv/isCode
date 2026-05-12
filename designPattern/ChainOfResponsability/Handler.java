package is.designPattern.ChainOfResponsability;

public abstract class Handler {//Colui che definisce la base per chi è in grado di soddisfare la richiesta
	 protected Handler successor;

	    public void setSuccessor(Handler successor) {//Serve ha indirizzare la richiesta ad un handler successivo in grado di soddisfarla
	        this.successor = successor;
	    }
	    public abstract void handleRequest(int request);// metodo che inoltra la richiesta
}
