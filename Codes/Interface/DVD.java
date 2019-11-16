
public class DVD extends Produto {

	protected double duração;
	public DVD() {
		
	}
	public DVD(String nome, double preço, double duração) {
		super.setNome(nome);
		super.setPreço(preço);
		setDuração(duração);
	}

	public double getDuração() {
		return duração;
	}

	public void setDuração(double duração) {
		this.duração = duração;
	}

	@Override
	public String toString() {
		return "DVD [duração=" + duração + "]";
	}
	
	
}
