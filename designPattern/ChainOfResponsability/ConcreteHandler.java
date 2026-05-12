package is.designPattern.adapter.ChainOfResponsability;

public class ConcreteHandler extends Handler{// colui che prova a gestire la richiesta; se non può, la passa a successore

	@Override
	public void handleRequest(int request) {
		if (request <= 10) {
            System.out.println("ConcreteHandler1 gestisce la richiesta: " + request);
        } else if (successor != null) {// Se non può gestirla, la passa al successore.
            successor.handleRequest(request);
        }
    }
	

}
