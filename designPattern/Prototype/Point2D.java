package is.designPattern.Prototype;

public class Point2D implements Prototype { //Questa classe concretizza il metodo clone che andrà a copiare un punto 2D
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { //Serve a leggere la coordinata x
        return x;
    }

    public double getY() { //Serve a leggere la coordinata y
        return y;
    }

    @Override
    public Point2D clone() { //Metodo clone che restituirà un nuovo punto 2D a cui sono stati passati i punti x e y
        return new Point2D(x,y);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}