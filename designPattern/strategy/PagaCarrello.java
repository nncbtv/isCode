package is.designPattern.strategy;

public class PagaCarrello {
	
	private int costoCarrello = 135;
	//boolean per aggiungere spese di spedizione
	private boolean includiSpedizione = true;
	//Interfaccia Strategy
	private MetodiPagamento x;
	
	public void Acquista() {
		x.chiediDati();
		if ( x.controlloDati() ) 
			x.paga(getCostoTotale());
		else
			System.out.print("Errore nel pagamento");
	}//Acquista
	
	public void setMetodoPagamento(MetodiPagamento y) {
		this.x = y;
	}//setMetodoPagamento
	
	private int getCostoTotale() {
		//If implicito per aggiungere 10 se boolean = True
		return includiSpedizione ? costoCarrello+8 : costoCarrello;
	}//getCostoTotale

}//PagaCarrello