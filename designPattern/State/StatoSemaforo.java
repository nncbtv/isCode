package is.designPattern.State;

public interface StatoSemaforo { //State, interfaccia che definisce le azioni possibili
    void prossimo(Semaforo context);
    void vedi();
}