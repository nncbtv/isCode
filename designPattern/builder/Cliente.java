package is.designPattern.builder;

public class Cliente {
	
	public static void main(String[] args) {
		//Ho creato un builder che mi da il menù di un ristorantino
		Cucina menuDiOggi = new Cucina(); //La cucina è il director
		menuDiOggi.setBuilder(new ChefConcreto()); //ChefConcreto è il builderConcreto
		buildMenu(menuDiOggi);//Divido la creazione e la rappresentazione tramite chiamata a metodo
		
		//Creo un altro oggetto di tipo menu ma con un altro builder, lo chef di domani
		Cucina menuDomani = new Cucina();
		menuDomani.setBuilder(new ChefDomani());
		buildMenu(menuDomani);
	}
	
	private static void buildMenu(Cucina menu) {
		Menu menudiOggi = menu.buildMenu(); //Menù è l'oggetto finale creato dal builder
		menudiOggi.printMenu();
	}
}
