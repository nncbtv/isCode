package is.designPattern.State;

public class Semaforo { //questo è il context ovvero l’oggetto principale che cambia comportamento;
    private StatoSemaforo statoCorrente;

    public Semaforo() {
        statoCorrente = new Rosso();
    }

    public void setStato(StatoSemaforo state) {
        this.statoCorrente = state;
    }

    public void vediStato() {
    	statoCorrente.vedi();
    }

    public void cambiaStato() {
    	statoCorrente.prossimo(this);
    }
}