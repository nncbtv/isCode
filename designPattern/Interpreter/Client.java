package is.designPattern.Interpreter;

public class Client {
    public static void main(String[] args) {//qui stiamo facendo: (10-3)+2
    	Context context = new Context();
        context.setValore("a", 10);
        context.setValore("b", 3);
        context.setValore("c", 2);

        Expression expression =
            new Somma(
                new Sottrazione(
                    new Variabile("a"),
                    new Variabile("b")
                ),
                new Variabile("c")
            );

        System.out.println(expression.interpreta(context));
    }
}