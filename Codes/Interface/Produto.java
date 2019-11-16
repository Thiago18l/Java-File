
public abstract class Produto {
	
	protected String nome;
	protected double preço;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preço) {
		setNome(nome);
		setPreço(preço);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	@Override
	public String toString() {
		return String.format("É um Produto"+this.nome+"que custa: "+this.preço);
	}
	
	

}
