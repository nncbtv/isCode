package is.designPattern.templateMethod;

public class TestTemplateMethod {

	public static void main(String[] args) {
		System.out.println("Arriva un tecnico");
		//Mi presento come se fossi un tecnico
		GestioneAccesso accessoBovalino = new TecnicoAutorizzato();
		accessoBovalino.richiediAccesso();
		System.out.println("\nArriva un dipendente:");
		//Mi presento come se fossi uno del personale
		GestioneAccesso accessoPianopoli = new Personale();
		accessoPianopoli.richiediAccesso();
	}//main

}//TestTemplateMethod