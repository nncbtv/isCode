package is.designPattern.Iterator;

public interface MyIterator {
    void next();            // Avanza di una posizione
    boolean isDone();       // Restituisce true se siamo alla fine
    Integer currentItem();  // Restituisce l'elemento corrente
}
