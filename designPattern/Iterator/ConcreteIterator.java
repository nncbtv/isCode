package is.designPattern.Iterator;

public class ConcreteIterator implements MyIterator {
    private ConcreteAggregate aggregate;//è il riferimento alla collezione che stiamo scorrendo.
    private int index;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.index = 0;
    }

    @Override
    public void next() {//Questo metodo sposta l’iteratore avanti di una posizione.
        index++;
    }

    @Override
    public boolean isDone() {//Questo metodo controlla se l’iterazione è finita.
        return index >= aggregate.size();
    }

    @Override
    public Integer currentItem() {//Questo metodo restituisce l’elemento attuale senza cambiare posizione.
        return aggregate.getItemAt(index);
    }
}