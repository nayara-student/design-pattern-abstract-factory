

public class Representante {
	private IndustriaCalcarioAgricola pedidoCalcario;
	private IndustriaGessoAgricola pedidoGesso;
	private EmpresaFornecedora empresa;
	
	public IndustriaCalcarioAgricola getPedidoCalcario() {
		return pedidoCalcario;
	}

	public void setPedidoCalcario(IndustriaCalcarioAgricola pedidoCalcario) {
		this.pedidoCalcario = pedidoCalcario;
	}

	public IndustriaGessoAgricola getPedidoGesso() {
		return pedidoGesso;
	}

	public void setPedidoGesso(IndustriaGessoAgricola pedidoGesso) {
		this.pedidoGesso = pedidoGesso;
	}

	public EmpresaFornecedora getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaFornecedora empresa) {
		this.empresa = empresa;
	}

	public void escolherFornecedora(String estado, String descricao) {
		if(estado.equals("GO") && descricao.equals("calcario")) {
			this.empresa = new FornecedoraGoias();
			this.pedidoCalcario = new IndustriaCalbras();
		}else if(estado.equals("GO") && descricao.equals("gesso")) {
			this.empresa = new FornecedoraGoias();
			this.pedidoGesso = new IndustriaNutrion();
		}else if(estado.equals("TO") && descricao.equals("calcario")) {
			this.empresa = new FornecedoraTocantins();
			this.pedidoCalcario = new IndustriaHipercal();
		}else if(estado.equals("TO") && descricao.equals("gesso")) {
			this.empresa = new FornecedoraTocantins();
			this.pedidoGesso = new IndustriaConsube();
		}
	}
}

