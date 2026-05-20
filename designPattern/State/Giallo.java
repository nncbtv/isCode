package is.designPattern.State;

public class Giallo implements StatoSemaforo {//questa classe rappresenta uno dei singoli stati concreti e i suoi comportamenti
    @Override
    public void prossimo(Semaforo context) {
        context.setStato(new Rosso());
    }
    @Override
    public void vedi() {
        System.out.println("Semaforo GIALLO - attenzione");
    }
}