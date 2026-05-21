package is.designPattern.Interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {         // contiene i dati da interpretare.
    private final Map<String, Integer> variables = new HashMap<>();//usiamo una mappa values per salvare coppie del tipo "a" -> 10.

    public void setValore(String name, int valore) {//Questo metodo inserisce un valore nel contesto.
        variables.put(name, valore);
    }

    public int getValore(String name) {//Questo metodo recupera il valore associato a una variabile.
        return variables.get(name);
    }
}