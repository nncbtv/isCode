package is.designPattern.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {//è la factory che crea e riusa i Flyweight.
    private static Map<String, TreeType> cache = new HashMap<>();//è una mappa che conserva gli oggetti già creati.  
    															//La chiave è il valore ripetuto, ad esempio "Quercia".
    public static TreeType getFlyweight(String repeatingState) {
        if (!cache.containsKey(repeatingState)) {     //Se la cache non contiene quel tipo, lo crea. 
            cache.put(repeatingState, new TreeType(repeatingState));
        }
        return cache.get(repeatingState);   //Se esiste già, lo restituisce senza ricrearlo.
    }
}