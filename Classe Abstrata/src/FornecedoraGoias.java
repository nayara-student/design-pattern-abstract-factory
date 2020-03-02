

public class FornecedoraGoias extends EmpresaFornecedora{

	@Override
	public IndustriaCalcarioAgricola obterCalcario() {
		return new IndustriaCalbras();
	}

	@Override
	public IndustriaGessoAgricola obterGesso() {
		return new IndustriaNutrion();
	}
}