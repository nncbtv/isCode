package is.designPattern.bridge;

public class Cliente {
	
	public static void main(String[] args) {
		/*Usiamo il design pattern bridge per ottimizzare la porduzione di pizza e i suoi tipi, 
		dividendo da una parte i tipi e dall'altra la metodologia di preparazione*/
		
		/*La pizzeria italiana inserirà sempre l'olio e un po' di basilico su qualsiasi pizza passi*/
		Pizzeria nonnoTotaro = new PizzeriaAmericana(new PizzaCaprese());
		/*La pizzeria americana inserirà la sua salsa segreta in qualsiasi pizza passi*/
		Pizzeria jhonatan = new PizzeriaAmericana(new PizzaWrustel());
		/*Chiamiamo una bella caprese da nonnoTotaro*/
		nonnoTotaro.ordinePizza();
		System.out.println();
		/*Chiamimamo una bella wrustel da jhonatan*/
		jhonatan.ordinePizza();
		/*Proviamo ad invertire le pizze tra le due pizzerie*/
		System.out.println("\nPizze invertite:\n");
		Pizzeria nonnoTotaro2 = new PizzeriaItaliana(new PizzaWrustel());
		/*La pizzeria americana inserirà la sua salsa segreta in qualsiasi pizza passi*/
		Pizzeria jhonatan2 = new PizzeriaAmericana(new PizzaCaprese());
		/*Chiamiamo una bella wrustel da nonnoTotaro*/
		nonnoTotaro2.ordinePizza();
		System.out.println();
		/*Chiamimamo una bella caprese da jhonatan*/
		jhonatan2.ordinePizza();
	}//main
	
}//Cliente