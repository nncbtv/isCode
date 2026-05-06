package is.designPattern.decorator;

public class Latte extends DecoratorBevanda { //supplemento da aggiungere al servizio base
	public Latte(Bevanda bevanda) {
        super(bevanda);
    }

    @Override
    public String descrizione() {
        return bevanda.descrizione() + ", latte";
    }

    @Override
    public double costo() {
        return bevanda.costo() + 0.30;
    }
}
