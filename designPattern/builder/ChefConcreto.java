package is.designPattern.builder;

public class ChefConcreto extends PreparazioneMenu {

	@Override
	void buildAntipasto() {
		// TODO Auto-generated method stub
		menu.setAntipasto("Antipasto Vecchi Tempi");
	}
	@Override
	void buildPrimo() {
		// TODO Auto-generated method stub
		menu.setPrimo("Penne all'arrabiata");
	}
	@Override
	void buildSecondo() {
		// TODO Auto-generated method stub
		menu.setSecondo("Manzo ai ferri");
	}
	@Override
	void buildDolce() {
		// TODO Auto-generated method stub
		menu.setDolce("Torta millefoglie");
	}
}//ChefConcreto
