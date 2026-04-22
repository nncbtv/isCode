package is.designPattern.builder;

public class ChefDomani extends PreparazioneMenu{
	@Override
	void buildAntipasto() {
		menu.setAntipasto("Insalata Caprese");
	}
	@Override
	void buildPrimo() {
		menu.setPrimo("Orecchiette ai broccoli e pancetta");
	}
	@Override
	void buildSecondo() {
		menu.setSecondo("Scaloppine al limone");
	}
	@Override
	void buildDolce() {
		menu.setDolce("Ciambellone americano");
	}
}//Chefdomani