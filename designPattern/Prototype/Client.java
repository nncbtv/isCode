package is.designPattern.Prototype;

public class Client {
    public static void main(String[] args) { //usa il prototipo concreto senza conoscere i dettagli della creazione.
        Point2D p1 = new Point2D(3, 4); // Crea un oggetto originale(un Prototipo).
        Point2D p2 = p1.clone(); // Crea una copia del prototipo.

        System.out.println("Originale: " + p1);
        System.out.println("Clonato: " + p2);
    }
}