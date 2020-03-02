

public class Wallet {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		OnlinePayment aplicativo = new PicPay();
		OnlinePayment aplicativo2 = new PayPal();
		
		Saldo conta_cliente1 = aplicativo.adicionarDinheiro();
		Deducao conta_cliente2 = aplicativo.retirarDinheiro();
		Saldo conta_cliente3 = aplicativo2.adicionarDinheiro();
		Deducao conta_cliente4 = aplicativo2.retirarDinheiro();
	}
}
