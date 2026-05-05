package Decorator;

public abstract class DecoratorBevanda implements Bevanda{ //Serve ad aggiungere un supplemento oltre alla soluzione base. 
														   //Utilizza un oggetto bevanda per beneficiare dei suoi metodi
	protected Bevanda bevanda;							  //in modo da aggiungerne dei supplementi

    public DecoratorBevanda(Bevanda bevanda) {
        this.bevanda = bevanda;
    }

}
