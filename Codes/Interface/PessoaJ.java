
public class PessoaJ extends Cliente{

	private int cnpj;
	
	public PessoaJ() {
		
	}
	
	public PessoaJ(String nome, int cnpj) {
		super(nome);
		setCnpj(cnpj);
	}

	public int getCnpj() {
		return cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJ [cnpj=" + cnpj + "]";
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
}
