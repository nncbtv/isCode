package is.designPattern.Interpreter;

public class Variabile implements Expression {//Rappresenta un numero semplice. Espressione terminal
    private String name;

    public Variabile(String name) {
        this.name= name;
    }

    @Override
    public int interpreta(Context context) {//Qui la variabile prende il suo valore dal Context.
        return context.getValore(name);
    }
}