
public class PessoaF extends Cliente{
	
	private int cpf;
	
	public PessoaF() {
		this.cpf = 0;
	}
	public PessoaF(String nome, String end, int cpf) {
		
		super(nome, end);
		setCpf(cpf);
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "PessoaF [cpf=" + cpf + "]";
	}
	

}
