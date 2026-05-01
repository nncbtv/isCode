package is.designPattern.composite;

public class TestComposite {
	
	public static void main (String[] args) {
		//Creiamo gli oggetti da inseire nel nostro albero
		Cellulare c1 = new Cellulare("Cellulare Matteo", 200);
		Cellulare c2 = new Cellulare("Cellulare Benito", 200);
		Computer pc1 = new Computer("Laptop di Benito", 1200);
		Computer pc2 = new Computer("Laptop di Matteo", 1800);
		
		//Dopodichè mettiamo tutto nell'albero
		Scatola dispositiviMatBen = new Scatolone(c1,c2,pc1,pc2);
		//Proviamo a stampare il totale
		System.out.println("Tutti i dispositivi di Benito e Matteo costano: "+dispositiviMatBen.calcolaPrezzo());
		//In questo primo esempio abbiamo annidato e trattato come pezzo unico un albero semplice, solo nodi foglia.
		
		//Proviamo ad inserire una foglia e l'albero precedente
		Cellulare c3 = new Cellulare("Cellulare Francesca", 600);
		Scatola  dispositiviElettronici = new Scatolone(c3, dispositiviMatBen);
		//Ora abbiamo un ramo che punta ad una foglia e un altro che punta ad un sottoalbero, proviamo a stampare
		System.out.println("Tutti i dispositivi degli amici costano: "+dispositiviElettronici.calcolaPrezzo());
		
	}//main
	
}//TestComposite