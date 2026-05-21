package Calculator;

public class CalcolatriceScientifica extends Calculator {

    public double power (double base, int esponente){
        if ( esponente < 0){
            throw new IllegalArgumentException("Esponente negativo");
        }
        if ( esponente == 0 ) return 1;
        return base*power(base, esponente-1);
    }//power

    public double sqrt (double n){
        if ( n < 0 ){
            throw new IllegalArgumentException("n negativo");
        }
        return Math.sqrt(n);
    }//sqrt

    public double remainder (double a, double b){
        if ( b == 0 ){
            throw new IllegalArgumentException("B non può essere zero");
        }
        return a % b;
    }//remainder

}//CalcolatriceScientifica
