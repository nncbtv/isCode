package is.designPattern.Interpreter;

public class Somma implements Expression {//Effettua una somma. Espressione non terminal
    private Expression left; //parte sinistra dell'espressione
    private Expression right;//parte destra dell'espressione

    public Somma(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreta(Context context) {//calcola prima il valore della parte sinistra e della parte destra, poi li somma.
        return left.interpreta(context) + right.interpreta(context);
    }
}