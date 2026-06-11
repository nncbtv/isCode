package is.designPattern.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scatolone implements Scatola{
	private final List<Scatola> figli = new ArrayList<>(); //Tengo i riferimenti ai miei figli (altri oggetti) per lavorarci sopra
	public Scatolone(Scatola...scatolaIn) { //Costruttore con parametri varargs
		//I varargs prendono tutto e lo convertono in array
		//Quindi dopo prendo l'array e lo converto in lista e chiamo il metodo addAll sulla lista figli
		figli.addAll(Arrays.asList(scatolaIn));
	}
	@Override
	public double calcolaPrezzo() {
		double totale = 0;
		for (Scatola x : figli) {//Ciclo foreach sulla lista
			totale = totale+x.calcolaPrezzo(); //Chiamo il prezzo di ogni mio figlio e lo sommo
		}
		return totale;
	}

	public void add(Scatola s) {
		figli.add(s);
	}//add
}//Scatolone

//Questa classe rappresenta il container del design pattern, essa contiene dentro di lei altre scatole o prodotti