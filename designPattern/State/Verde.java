package is.designPattern.State;

public class Verde implements StatoSemaforo {//questa classe rappresenta uno dei singoli stati concreti e i suoi comportamenti    @Override
    public void prossimo(Semaforo context) {
        context.setStato(new Giallo());
    }
    @Override
    public void vedi() {
        System.out.println("Semaforo VERDE - passa");
    }
}