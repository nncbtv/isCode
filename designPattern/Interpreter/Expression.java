package is.designPattern.Interpreter;

public interface Expression {//Questa è l’interfaccia base di tutte le espressioni.
    int interpreta(Context context); //Ogni espressione deve sapere come interpretarsi usando il Context.
}