
public class CD extends Produto {
	protected int n_faixas;
	
	public CD() {
		
	}
		
	public CD ( String nome, double pre�o, int n_faixas) {
		super.setNome(nome);
		super.setPre�o(pre�o);
		setN_faixas(n_faixas);
	}

	@Override
	public String toString() {
		return "CD [n_faixas=" + n_faixas + "]";
	}

	public int getN_faixas() {
		return n_faixas;
	}

	public void setN_faixas(int n_faixas) {
		this.n_faixas = n_faixas;
	}
}
