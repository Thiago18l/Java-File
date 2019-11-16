
public class Livros extends Produto {

	protected String nome, autor;
	protected double preço;
	
	public Livros() {
		
	}
	public Livros(String nome, String autor, double preço) {
		super.setNome(nome);
		setAutor(autor);
		super.setPreço(preço);
	}
	
	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", autor=" + autor + ", preço=" + preço + "]";
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	
	
	
}
