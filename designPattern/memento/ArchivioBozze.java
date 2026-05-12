package is.designPattern.memento;

import java.util.Deque;
import java.util.LinkedList;

public class ArchivioBozze {
	/*
	 * Collezione in cui tengo i mementi,
	 * continene elementi di tipo object perché
	 * il caretaker non deve sapere che sta stoccando
	 * mementi di un oggetto, stoccaggio sicuro
	 */
	private Deque<Object> cassetto;
	
	public ArchivioBozze() {
		cassetto = new LinkedList<>();
	}//Costruttore
	
	public void aggiungi( Object m ) {
		cassetto.push(m); //Salvataggio memento
	}//aggiungi
	
	public Object prendi() {
		return cassetto.pop(); //Estrazione ultimo memento
	}//Prendi
	
}//ArchivioBozze
