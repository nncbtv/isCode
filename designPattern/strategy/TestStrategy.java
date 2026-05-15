package is.designPattern.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		//Creo una simulazione di un carrello da pagare
		PagaCarrello carrelloAmazon = new PagaCarrello();
		/*
		//Imposto il mio metodo di pagamento
		carrelloAmazon.setMetodoPagamento(new PayPal());
		//Procedo al pagamento dello stesso
		carrelloAmazon.Acquista();*/
		
		//Cambio metodo di pagamento
		carrelloAmazon.setMetodoPagamento(new CartaCredito());
		carrelloAmazon.Acquista();
	}//main

}//TestStrategy