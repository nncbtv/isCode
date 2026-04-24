package is.designPattern.builder;

public class Cucina {
	private PreparazioneMenu chef;
	
	public void setBuilder(PreparazioneMenu chefIn) {
		this.chef = chefIn;
	}
	
	public Menu buildMenu() {
		chef.buildAntipasto();
		chef.buildPrimo();
		chef.buildSecondo();
		chef.buildDolce();
		return chef.build();
	}
	
}//Cucina