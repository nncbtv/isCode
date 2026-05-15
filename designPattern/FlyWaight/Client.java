package is.designPattern.FlyWaight;

public class Client {
    public static void main(String[] args) {
        TreeContext t1 = new TreeContext("Quercia", "(10,20)");//t1 e t2 usano entrambi "Quercia".
        TreeContext t2 = new TreeContext("Quercia", "(30,40)");
        TreeContext t3 = new TreeContext("Pino", "(50,60)"); //t3 usa "Pino".
        
        //ogni contesto usa il proprio Flyweight condiviso e la sua posizione:
        t1.operation();
        t2.operation();
        t3.operation();
    }
}
