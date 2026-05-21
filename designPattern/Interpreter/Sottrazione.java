package is.designPattern.Interpreter;

public class Sottrazione implements Expression {//Effettua una sottrazione. Espressione non terminal
    private Expression left;//parte sinistra dell'espressione
    private Expression right;//parte destra dell'espressione


    public Sottrazione(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreta(Context context) {//calcola prima il valore della parte sinistra e della parte destra, poi li sottrae.
        return left.interpreta(context) - right.interpreta(context);
    }
}