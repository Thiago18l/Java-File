
public class Livros extends Produto {

	protected String nome, autor;
	protected double pre�o;
	
	public Livros() {
		
	}
	public Livros(String nome, String autor, double pre�o) {
		super.setNome(nome);
		setAutor(autor);
		super.setPre�o(pre�o);
	}
	
	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", autor=" + autor + ", pre�o=" + pre�o + "]";
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

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	
	
	
	
}
