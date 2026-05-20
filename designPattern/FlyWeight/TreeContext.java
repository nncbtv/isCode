package is.designPattern.FlyWeight;

public class TreeContext {  //è il contesto.
    private String uniqueState;   // è lo stato unico, cioè quello che cambia da un oggetto all’altro. (la posizione)
    private TreeType flyweight;  //è il riferimento all’oggetto condiviso.

    public TreeContext(String repeatingState, String uniqueState) {
        this.uniqueState = uniqueState;								//salvo la posizione e chiedo alla factory il Flyweight giusto.
        this.flyweight = TreeFactory.getFlyweight(repeatingState);
    }

    public void operation() {  //delego tutto al Flyweight, passando la posizione.
        flyweight.operation(uniqueState);
    }
}