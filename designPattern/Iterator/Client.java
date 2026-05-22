package is.designPattern.Iterator;

public class Client {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate(new Integer[]{10, 20, 30});
        MyIterator iterator = aggregate.createIterator();//Il client chiede un iteratore alla collezione.

        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}