

public class FornecedoraTocantins extends EmpresaFornecedora{

	@Override
	public IndustriaCalcarioAgricola obterCalcario() {
		return new IndustriaHipercal();
	}

	@Override
	public IndustriaGessoAgricola obterGesso() {
		return new IndustriaConsube();
	}
}

