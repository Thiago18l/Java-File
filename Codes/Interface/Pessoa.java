
public abstract class Pessoa {
	
	protected String nome;
	protected String end;
	
	
	
	public Pessoa(String nome) {
		setNome(nome);
	}
	
	public Pessoa() {
		this.nome = "";
		this.end = "";
		
	}
	public Pessoa(String nome, String end) {
		setNome(nome);
		setEnd(end);
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", end=" + end + "]";
	}
	

}
