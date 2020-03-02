

public class PayPal implements OnlinePayment {

	@Override
	public Deducao retirarDinheiro() {
		return new DepositoDireto();
	}

	@Override
	public Saldo adicionarDinheiro() {
		return new Transferencia();
	}
}
