package is.designPattern.builder;

public abstract class PreparazioneMenu {
	Menu menu = new Menu();
	abstract void buildAntipasto();
	abstract void buildPrimo();
	abstract void buildSecondo();
	abstract void buildDolce();
	Menu build() {return menu;}
}//PreparazioneMenu