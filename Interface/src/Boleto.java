

public class Boleto implements Saldo {
	private String codigoBarras;

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	@Override
	public void adicionarDinheiro() {
		System.out.println("Código de barras OK.");
	}
}
