package is.designPattern.Iterator;

public class ConcreteAggregate extends AbstractAggregate {// contiene i dati da scorrere, cioè l’array items.
    private Integer[] items;

    public ConcreteAggregate(Integer[] items) {
        this.items = items;
    }

    @Override
    public MyIterator createIterator() {//Crea e restituisce un iteratore concreto
        return new ConcreteIterator(this);
    }

    public Integer getItemAt(int index) {//Questo metodo serve all’iteratore per leggere un elemento della collezione in una certa posizione.
        return items[index];
    }

    public int size() {//Questo metodo restituisce la dimensione della collezione.
        return items.length;
    }
}