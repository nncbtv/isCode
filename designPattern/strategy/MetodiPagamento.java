package is.designPattern.strategy;

public interface MetodiPagamento {
	
	//Metodi per aggiungere un nuovo metodo di pagamento
	public void chiediDati();
	public boolean controlloDati();
	public void paga(int totale);

}//MetodiPagamento