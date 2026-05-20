package is.designPattern.State;

public class Client {
    public static void main(String[] args) {//il client utilizza il contesto per visualizzare e cambiare stato di un semaforo
        Semaforo light = new Semaforo();

        light.vediStato(); // Rosso
        light.cambiaStato();

        light.vediStato(); // Verde
        light.cambiaStato();

        light.vediStato(); // Giallo
        light.cambiaStato();

        light.vediStato(); // Rosso
    }
}
