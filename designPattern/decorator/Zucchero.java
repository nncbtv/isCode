package is.designPattern.decorator;

public class Zucchero extends DecoratorBevanda{ //supplemento da aggiungere al servizio base
	public Zucchero(Bevanda bevanda) {
        super(bevanda);
    }

    @Override
    public String descrizione() {
        return bevanda.descrizione() + ", zucchero";
    }

    @Override
    public double costo() {
        return bevanda.costo() + 0.10;
    }
}
