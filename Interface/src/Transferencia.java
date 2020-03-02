

public class Transferencia implements Saldo {
	private String numeroConta;
	private String numeroAgencia;

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	@Override
	public void adicionarDinheiro() {
		System.out.println("O dinheiro será enviado para a conta informada.");
	}
}
