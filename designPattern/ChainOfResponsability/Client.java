package is.designPattern.ChainOfResponsability;

public class Client {
	public static void main(String[] args) {// Creo i due handler.     
        Handler h = new ConcreteHandler();
        Handler h2 = new ConcreteHandler2();
      
        h.setSuccessor(h2);// Collego h1 a h2: se h1 non gestisce, passa a h2.
    
        h.handleRequest(5); // Invio una richiesta piccola: la gestisce h1.
        
        h.handleRequest(20);// Invio una richiesta più grande: h1 la passa a h2.
    }
}
