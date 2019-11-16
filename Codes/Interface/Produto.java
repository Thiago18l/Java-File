
public abstract class Produto {
	
	protected String nome;
	protected double pre�o;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double pre�o) {
		setNome(nome);
		setPre�o(pre�o);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	
	@Override
	public String toString() {
		return String.format("� um Produto"+this.nome+"que custa: "+this.pre�o);
	}
	
	

}
