package is.designPattern.FlyWaight;

public class TreeType { //FlyWaight
    private String name; // rappresenta lo stato ripetuto: ad esempio "Quercia" o "Pino".

    public TreeType(String name) {
        this.name = name;
    }

    public void operation(String position) { //usa un dato esterno, cioè la posizione, per completare l’azione.
        System.out.println("Disegno un albero di tipo " + name + " in " + position);
    }
}